package ex01.method;

import java.util.Scanner;

public class MethodEx1 {
	
	
	//3) 매개변수 없고, 리턴타입 있는 경우
	
	
	public static int show() {
		System.out.println("show() method");
		return 100;
	}
	
	
	public static void info() {
		
	}
	
	public static int max() {
		
		System.out.println("x, y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		
		int max =(x>y)? x:y;
				return max;

	}

	public static void main(String[] args) {
		
		
		max();
		show(); // 함수호출
		System.out.println(show());
		int num = show();
		System.out.println(num);
		int show = show();
		System.out.println(show);

	}
}