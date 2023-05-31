package ex05.constructor;

public class MainEntry {

	public static void main(String[] args) {
		
		
		TV tv = new TV();  // 객체생성, 메모리 할당, 생성자함수 자동호출
		tv.disp();
		
		
		TV tv2 = new TV(25);
		tv2.disp();
		
		TV tv3 = new TV("green");
		tv3.disp();
		
		TV tv4 = new TV("pink",99);
		tv4.disp();
	
		
		
	}

}
