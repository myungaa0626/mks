package ex05.While;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int su;
		char grade = ' ', yn =' ';
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 무한루프
			
			do {
				System.out.println("당신의 점수 입력 요망: ");
				su = sc.nextInt();
				
			}while( su < 0 || su > 101);
			
			System.out.println("\n당신의 점수 "+ su+ "\n");
			
			System.out.println("계속 입력하실래요? (y/n)");
			yn = sc.next().charAt(0);
			if ( yn == 'N'|| yn == 'n')break;
			
			
		} // end while

	}

}
