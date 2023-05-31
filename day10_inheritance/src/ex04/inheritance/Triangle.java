package ex04.inheritance;

import java.util.Scanner;

public class Triangle extends Shape{ // sub class
	
	public Triangle() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("높이 값은 = ");
		this.h = sc.nextInt();	
		
		System.out.println("넓이 값은 = ");
		this.w = sc.nextInt();	
		
		
	}
	
	public double calc() {
		this.result = (h * w * 0.5);
		
		return result;
	}
	
	public void show() {
		System.out.println("높이 값은 = "+ h + ", 넓이 값은 = "+w+", 원의 넓이 = "+ calc());
	}
	
}
