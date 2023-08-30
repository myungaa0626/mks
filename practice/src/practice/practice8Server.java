package practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class practice8Server {
	HashMap clients;
	
	practice8Server() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);	// 동기화를 위해 사용.
	}
	
	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("서버 실행...");
			
			while (true) {
				socket = serverSocket.accept();	// 클라이언트의 정보를 알고 있는 소켓.
				System.out.println(socket.getInetAddress() + ":" + socket.getPort() + " 연결.");
				
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 브로드캐스팅 기능
	void sendToAll(String msg) {
		Iterator iterator = clients.keySet().iterator();
		
		while (iterator.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(iterator.next());
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] agrg) {
		new practice8Server().start();
	}
	
	// inner class (클래스 내부에 있는 클래스를 의미)
	public class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			String name = "";
			
			try {
				name = in.readUTF();
				
				// HashMap 에 사용자 이름 존재유무 체크.
				if (clients.get(name) != null) {
					out.writeUTF("이미 존재하는 이름입니다 : " + name);
					out.writeUTF("다른 이름으로 다시 연결해주세요.");
					System.out.println(socket.getInetAddress() + ":" + socket.getPort() + " 연결 종료.");
					in.close();
					out.close();
					socket.close();
					socket = null;
				} else {
					sendToAll("#" + name + " 님께서 입장하셨습니다.");
					clients.put(name, out);
					
					while (in != null) {
						sendToAll(in.readUTF());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (socket != null) {
					sendToAll("#" + name + " 님께서 접속을 종료하였습니다.");
					clients.remove(name);
					System.out.println(socket.getInetAddress() + ":" + socket.getPort() + " 연결 종료.");
				}
			}
		}
	}
}