package Algorithm;

import java.util.Scanner;

public class Switch_Year_YoonNyun {
		
	public static void main(String[] args) {
		
		//문제] 윤년/평년 판정 프로그램 작성
		//
		//if(year % 4 ==0) //윤년                           4년으로 나눠지면서 
//			if(year % 100 !=0 || year%400 ==0) {//윤년     100으로 나누어 떨어지지 않거나 400으로 나눌수 있다
//			 	"윤년";
		//
		//}
		// 1. 객체 선언
		int year;
		int answer;
		
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		//int b = (5 < 4) ? 50 : 40;   <<< 
		//삼항연산자
		
		if( year % 4 == 0) {
			if( year % 100 !=0 || year % 400 == 0) {
				
				
				
			}
			
		}
		
		
		
	}	
		
}		
