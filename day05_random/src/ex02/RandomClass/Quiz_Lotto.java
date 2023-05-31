package ex02.RandomClass;

import java.util.Scanner;

public class Quiz_Lotto {

	public static void main(String[] args) {
		
		
		//1 ~ 45까지 숫자 중 6개 추출
		
		
		System.out.println("1 ~ 45개중 6개 자동 추출");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		//int bet = sc.nextInt();  // 입력한 정수
		//int dan = ((int)(Math.random()*100)+1);    // 랜덤 숫자
		
		for(int i=0; 5>=i; i++) {
			
			int dan = ((int)(Math.random()*45)+1);
			
			System.out.print(dan+" ");
		
		}
		
		
		
	}

}
