package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEX {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException{
		
//		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
		
		for(int i=0; i<= 10; i++) {
			raf.seek(i * 100);
			String str ="hello";
//			raf.writeInt(i);
			raf.writeUTF(str);
		}
		
		for(int i=0; i<= 10; i++) {
			raf.seek(i * 100);
			System.out.println(raf.readUTF());
			
		}
		
		System.out.println("string print successs!!");
		raf.close();
		
		
		
	}

}
