package ex05.While;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		int su;
		char grade = ' ';
		
		do{
		System.out.println("점수 입력 요망: ");
		Scanner sc = new Scanner(System.in);
		
		su = sc.nextInt();
		System.out.println("점수는 " + su +grade);
		}while( su< 0 || su >101);
		
		//switch 예시로 변경
		switch (su / 10) {
			case 10: grade ='A'; break;
			case 9: grade ='A'; break;
			case 8: grade ='B'; break;
			case 7: grade ='C'; break;
			case 6: grade ='D'; break;
			default: grade ='F'; break;
	
		}
		
		System.out.println("학점은 " + grade+ " 입니다");
	
	}

}
