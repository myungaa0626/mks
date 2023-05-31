package ex01.If;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		
		String str =""; // null
		System.out.println("integer data input : ");
		
		int su = new Scanner(System.in).nextInt();
		
		if(su % 2 == 0) System.out.println("even");
		else System.out.println("odd");
		
		//삼항(조건)연산자 : ( 조건 ) ? 참 : 거짓;
		
		

		str = (su % 2 == 0)? "even":"odd";
		System.out.println(str);
		
		if(su > 0) System.out.println("양수");
		else if(su < 0) System.out.println("음수");
		else System.out.println("0 이군요");
		
		
		
		
	}

}
