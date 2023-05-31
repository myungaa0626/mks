package ex07.io.data;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	public static void main(String[] args) throws IOException {
		
		File file =  new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file); // 예외발생
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true); // 예외발생
		dos.writeChar(65);      // ASCII code ---> 'A'
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(888888888);
		dos.writeFloat(12.34f);
		dos.writeDouble(8.8);
		dos.flush();           // buffer 비우기
		
		System.out.println("text.txt 파일에 " + dos.size()+ " byte save");
		dos.close();
		
		
	}

}
