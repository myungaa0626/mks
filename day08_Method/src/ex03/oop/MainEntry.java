package ex03.oop;

public class MainEntry {

	public static void main(String[] args) {
		// 객체 생성해서 3, 5 로 결과 출력하기
		Rectangle rect = new Rectangle();
		rect.display();
		rect.setX1(100);
		rect.setY1(50);
		rect.setX2(70);
		rect.setY2(30);
		rect.display();
		
		System.out.println("====================================");
		
		Point pt = new Point();
		pt.display(); // 초기값
		
		pt.setX(100);
		pt.setY(50);
		pt.display();
		
		pt.setXY(3, 5);
		pt.display();
	
	}

}
