package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class practice1scannerandio {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름");
		String name = sc.next();
		
		
		System.out.println("나이");
		int age = sc.nextInt();
		
		
		System.out.println("이름 " + name );
		System.out.println("나이 " + age);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("이름");
		String name1 = br.readLine();
		
		System.out.println("나이");
		int age1 = br.read();
		
		System.out.println("이름" + name1);
		System.out.println("나이" + age1);
		
		
		
	}

}
