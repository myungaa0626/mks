package ex02.oop;
import java.lang.*; // 자동으로 임포트됨
//접근지정자를 생략하면 default로 자동 설정됨
class Point extends Object{  // 내부적으로 이미 object를 상속 받았다 (extends 하고 있었다)
	
	private int x, y; //멤버변수 - 접근지정자 : private < default < protected < public
	
	public int getX() {
		return x;
	}
	public void setX(int x) {//int xx (파라미터 매개변수)
		
		this.x =x;
	}
	public void display() {
		System.out.println(getX() + ", "+y);
		System.out.println(x+ ", "+y);
	}
} //point end

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println(pt.getX());
		pt.setX(1000);
		System.out.println(pt.getX());
	}

} // MainEntry end







