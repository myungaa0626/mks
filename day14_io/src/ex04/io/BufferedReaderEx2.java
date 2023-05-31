package ex04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	
	public static void main(String[] args) 
							throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("input = ");  String str1 = br.readLine();
//		System.out.println("input = ");  String str2 = br.readLine();
		
//		System.out.println(str1 + str2);
		
		
		System.out.println("input = ");
		int su1 = Integer.parseInt(br.readLine());
		
		System.out.println("input = ");
		int su2 = Integer.parseInt(br.readLine());
		
		System.out.println(su1+su2);
		
	}
	
	
}
