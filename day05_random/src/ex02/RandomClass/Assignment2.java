package ex02.RandomClass;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		//과제2] (-1) +2 + (-3) + 4 + (-5) + .... +(-9) + 10 = ?  5	
		System.out.println("정수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int answer = 0;
		
		for(int i = 1; num >= i; i++) {
			if(i%2==0) {
				answer = answer + i;    // 	
			}
			else 
				answer = answer + i* (-1);  
		} // for
		System.out.println(answer);
		
	} // method
} // class
