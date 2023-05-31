package ex02.RandomClass;
import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		
		System.out.println("다섯개의 정수를 입력하세요. (1~100)");
		Scanner sc = new Scanner(System.in);
		
		int dan = ((int)(Math.random()*100)+1);    // 랜덤 숫자
		
	
		for(int i=1; 6>i; i++) {  // 기회 횟수
			
			int bet = sc.nextInt();  // 입력한 정수
			
			if(bet>100 || bet<0) {
				System.out.println("1에서 100사이 숫자를 입력해주세요");	
			}else
				
				if(dan>bet) {
					System.out.println("입력하신 " + bet + " 보다 더 큽니다");	
				}
				else if(dan<bet) {
					System.out.println("입력하신 " + bet + " 보다 더 작습니다");
				}
	
			else
				{ System.out.println("정답입니다!");
				  System.exit(0);
				}
			
		}
		System.out.println("정답은 "+ dan);
		
		
	}
	
}
/*
 * up/down
 * 1~100 중에 난수 출력  dan = 난수값
 * up 
 */