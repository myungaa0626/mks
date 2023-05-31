package ex08.constructor;

public class Point {
	private int x, y;
	// 생성자함수  3개
	public Point() {
		
		this(100,100);
		System.out.println("default constructor");
		
//		x = 3;
//		y = 2;
	}
	public Point (int x) {
		System.out.println("1 constructor");
		this.x = x;
		y=30;
	}
	public Point (int x, int y) {
		System.out.println("2 constructor");
		this.x = x;
		this.y = y;
	}
	// getter / setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	// output method
	public void disp() {
		System.out.println("x : "+ x + " y : " + y);
	}
}
