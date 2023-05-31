package ex01.method;
public class MainEntry {
	// 2) 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x, int y, String msg) { // 함수정의부(구현부)  		// 2
		System.out.println("hap = "+(x+y));
		int sum = x + y;
		System.out.println("sum = "+ sum);
		System.out.println(msg);
		System.out.println(x+", "+y+", "+msg);
	}
	private static void abs(int x) {              								// 1
		if( x<0) x= -x;
		System.out.println("절대값 : "+x);
	}
	public static void main(String[] args) { 									//main
		
		abs(-9);
		plus(10,20,"hello"); // 함수호출
		System.out.println("main start");
		line();
		info();
		line();
		System.out.println("main end");
	}
	//1) 매개변수 없고, 리턴타입 없는 경우
	public static void info() {                             					//4
		System.out.println("doyeon");
		System.out.println("010-2435-2342");
		System.out.println("seoul");
	}
	public static void line() {
		System.out.println("=================================================");  // 3, 5
	}
}