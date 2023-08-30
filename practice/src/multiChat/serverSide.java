package multiChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class serverSide {
    public void start() throws IOException {

        ServerSocket ss = new ServerSocket(8888);
        Set<PrintWriter> client = new HashSet<>();
        System.out.println("서버 돌아가는중...");

        while (true) {
            Socket s = ss.accept();
            new ClientHandler(s, client).start();
        }
    }

    private class ClientHandler extends Thread {
        private Socket socket;
        private Set<PrintWriter> clientWriters;

        public ClientHandler(Socket socket, Set<PrintWriter> clientWriters) {
            this.socket = socket;
            this.clientWriters = clientWriters;
        }

        public void run() {
            try (
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)
            ) {
                synchronized (clientWriters) {
                    clientWriters.add(pw);
                }

                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println("수신: " + message);
                    broadcast(message);
                }
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            } 
        }

        private void broadcast(String message) {
            synchronized (clientWriters) {
                clientWriters.forEach(writer -> writer.println(message));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        serverSide server = new serverSide();
        server.start();
    }
}