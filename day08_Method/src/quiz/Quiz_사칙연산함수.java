package quiz;

import java.util.Scanner;

public class Quiz_사칙연산함수 {
	
	//plus(+), mul(*) 리턴 타입 없이
	//sub(-), div(/) 리턴타입 있고, 함수는 예외처리도 한다.
	
	public static void main(String[] args) {
		plus(20,30);
		multiply(15,3);
		sub();
		div();
	}
	
	public static void plus(int x, int y) {
		System.out.println("x + y = ");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		int sum = x+y;
		System.out.println(x+" + "+y+" = "+(x+y));
	}
	public static void multiply(int x, int y) {
		System.out.println("x * y = ");
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		int sum = x*y;
		System.out.println(x+" * "+y+" = "+x*y);
	}
	public static int sub() {
		System.out.println("x - y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		int sum = x-y;
		System.out.println(sum);
		return sum;
	}
	public static int div() {
		System.out.println("x / y = ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		try {
			int sum = x/y;
			System.out.println(sum);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		return y;
	}
}
