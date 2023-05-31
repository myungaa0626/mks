package quiz;

import java.util.Scanner;

public class QuizLotto {

	
	public static void init() {
		
		int[] arr = new int[6];
	}
	
	public static void msg() {
		System.out.println("1 ~ 45개중 6개 자동 추출");
		System.out.println();
	}
	
	public static void dan() {
		

		for(int i=0; 5>=i; i++) {
			for(int j =0; j<=5; j++) {
				
			
				int dan = ((int)(Math.random()*45)+1);
				
				System.out.print(dan+" ");
			}System.out.print("\t\n");
		}//System.out.println();
	}
	
	public static void main(String[] args) {
		
				msg();
				dan();
				//1 ~ 45까지 숫자 중 6개 추출
				// isCheck(int[] arr, int i) {  }
	}
}
