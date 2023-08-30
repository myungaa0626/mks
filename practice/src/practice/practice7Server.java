package practice;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class practice7Server {

	public static void main(String[] args) throws IOException {
		
			ServerSocket ss = new ServerSocket(8000);

			Socket s = ss.accept();

			DataInputStream dis = new DataInputStream(s.getInputStream());
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			Scanner sc = new Scanner(System.in);
			
			
			String str ="", str2="";
			
			System.out.println("서버 시작합니다");
			while(!str.equals("exit")) {
				
				str = dis.readUTF();
				System.out.println("Client message= " + str);
				
				str2 = sc.nextLine();
				dout.writeUTF(str2);
				dout.flush();
				
			}	
			dis.close();
			s.close();
			ss.close();
	}
}
