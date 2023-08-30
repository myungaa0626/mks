package practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class practice7Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		Socket s = new Socket("localhost", 8000);
		
		DataInputStream din = new DataInputStream(s.getInputStream());
	
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		Scanner sc = new Scanner(System.in);
		
		String str ="", str2="";
		
		
		while(!str.equals("exit")) {
			
			str = sc.nextLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();

			System.out.println("Server message= " + str2);
			
			
		}	

			dout.close();
			s.close();

	}

}
