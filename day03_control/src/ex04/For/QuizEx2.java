package ex04.For;

import java.util.Scanner;

public class QuizEx2 {

	public static void main(String[] args) {
		
//		for(int i=1; 101>i; i++) {
//			
//			if(i%2==0) 
//						System.out.print(i+ " ");
//			if(i%20==0)
//						System.out.println();
//			
//		}
		System.out.println("원하는 단을 입력 받아서 구구단 출력하기");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i;
		System.out.println(a + "단 ");
		for(i = 1; 9>=i; i++) {
			System.out.println(a +" * "+ i +" = " + a * i+ " ");
		}
	}
}
/*
문제1] 1~100까지 중에서 짝수 출력(열)하고, 한행에 10개씩 출력하는 프로그램 작성 
문제2] 원하는 단을 입력 받아서 구구단 출력하기
*/