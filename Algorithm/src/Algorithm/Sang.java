package Algorithm;

import java.util.Scanner;

public class Sang {

	public static void main(String[] args) {
		//삼항연산자 연습
		
		System.out.println("두개의 정수를 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();    //
		int c = sc.nextInt();    //
		
		
		String a = (b<c)? "true": "false";
		
		System.out.println(a);
		
		if(a=="false") {
			
			System.out.println(b + " < "+ c + " 틀렸음");
			
		}
		else
			System.out.println( b + " < "+ c + " 맞았음");

	}

}
