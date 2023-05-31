package ex05.While;

import java.util.Scanner;

public class QuizEx1 {

	public static void main(String[] args) {
		
		// 2023.03.31 퀴즈
		Scanner sc = new Scanner(System.in);
		
		int kor; 
		int eng;
		char yn = ' '; // 연산자 (+,-,*,/)
		
		while(true){ // 무한루프
  
				do {
					System.out.println("당신의 국어 점수 입력 요망");
					kor = sc.nextInt(); // 국어 점수 입력
					
				}while(kor < 0 || kor > 101); // 이 조건 안에 들어가면 무한반복
				
				do {
					System.out.println("당신의 영어 점수 입력 요망");
					eng = sc.nextInt();       // 영어 점수 입력
					
				}while(eng < 0 || eng > 101); // 이 조건 안에 들어가면 무한반복
				
				do {
					
					System.out.println("연산자 입력 요망 (+,-,*,/)");
					//yn = sc.next().charAt(0);
					
				}while(yn == '+' || yn == '-' || yn == '*' || yn  == '/' );
				
				yn = sc.next().charAt(0);
				
				if(yn == '+') {
					System.out.println("당신의 점수는 "+ (kor+eng));
				}
				else if(yn == '-') {
					System.out.println("당신의 점수는 "+ (kor-eng));
				}
				else if(yn == '*') {
					System.out.println("당신의 점수는 "+ (kor*eng));
				}
				else if(yn == '/') {
					try {
						System.out.println("당신의 점수는 "+ ((double)kor/(double)eng));
					}catch (ArithmeticException e) {
						System.out.println("ArithmeticException");
					}
					
				}
				else
					System.out.println("연산자를 (+,-,*,/) 중 입력하세요");
				break;
				
				
				
		} // end while
	} // method
} //class
/*
3과목 입력 받아서 (0~100) 점수만 입력 받는다.
연산자 (+,-,*,/) 입력받아서 (+,-,*,/) 외의 연산자 들어오면 재입력 받게 한다
100
100
100
+

100+100+100 = 300
*/