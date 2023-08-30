package practice;

import java.util.Scanner;

public class practice2arrayPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 크기 수 입력하세요.");
		int n = sc.nextInt();
		
		String[] sentence = new String[n];
		
		
		System.out.println("배열 출력 "+ n +"개하기:");
		for(int i=0; i<sentence.length; i++) {
			
			sentence[i]= sc.next();
			
		}
		
		for(int i =0; i<sentence.length; i++) {
			
			System.out.println(sentence[i]);
			
		}
	}
}
