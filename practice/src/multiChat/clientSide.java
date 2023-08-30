package multiChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class clientSide {
    public static void main(String[] args) throws IOException {
        
        Socket s = new Socket("localhost", 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력해주세요: ");
        String name = sc.nextLine();
        System.out.print("메세지 입력해주세요: ");

        Thread input = new Thread(() -> {
            while (true) {
                String message = sc.nextLine();
                pw.println(name + ": " + message);  
            }
        });

        Thread output = new Thread(() -> {
            try {
                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        input.start();
        output.start();
    }
}