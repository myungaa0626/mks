package ex02.RandomClass;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {

		//과제1] 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5) = ?   35                                                
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총 더해질 숫자 갯수를 입력하시오.");
		int count = sc.nextInt(); // 총 더해지는 갯수 (5회 = 35, 3회 = 10)
		
		int answer = 0;
		
		for(int i = 1; count >= i; i++) {
			for(int j =1; j<=i; j++) {
				answer += j;
			}
		}

		System.out.println(answer);

	} //method
} // class


