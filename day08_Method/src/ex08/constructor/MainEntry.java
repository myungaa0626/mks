package ex08.constructor;

public class MainEntry {

	public static void main(String[] args) {
		
		Point pt = new Point(); // 객체생성, 메모리에 할당, 생성자함수 자동호출
		pt.disp();
		
		Point pt1 =new Point(2);
		pt1.disp();
		
		Point pt2 = new Point(4,8);
		pt2.disp();
	}
}
