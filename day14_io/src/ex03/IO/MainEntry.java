package ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args)
					throws IOException {  // 예외처리 위임 - JVM
		
		
		InputStream is = System.in; // 표준 입력
		
	//		try {
				System.out.println("단일 문자 입력 : ");
				int num = is.read()-48; // 예외발생, '0' ~ '9' : 48 ~ 57 (ASCII code)
	//			System.out.println((char)num);
				is.read(); is.read(); // 자바는 2바이트이기 때문에 is.read() << 이걸 두번써야지 4바이트가 출력이 됨
				int num2 = is.read()-48;
				
				System.out.println(num+num2);

	//			} catch (IOException e) {
				
	//			  e.printStackTrace();			
	//			}
		
	
	}
}
