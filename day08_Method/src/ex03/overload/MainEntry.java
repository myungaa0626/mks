package ex03.overload;

public class MainEntry {
	//오버로드
	
	public static void line() {
		System.out.println("---------------------");
	}
	public static void line(String str) { //array :length 필드 <-- 배열의 길이 (크기), String : length() <-- 문자열의 길이
		
			System.out.println(str);

	}
	
	public static void line(double strDouble) { //array :length 필드 <-- 배열의 길이 (크기), String : length() <-- 문자열의 길이
		
		System.out.println(strDouble);

	}
	public static void line(int n, int y, String str) { //array :length 필드 <-- 배열의 길이 (크기), String : length() <-- 문자열의 길이
		
		if(n > y) { //교환 
			int temp = n;
			n = y;
			y = temp;
		}
		
		
		for(int i =1; i <n; i++) {
			System.out.print(str);

		}
		System.out.println();
	}

	public static void main(String[] args) {
		line();
		line("$$$");
		plus (12.34);
		plus(20);
		plus("hello ");
		line("*");
		//line(20*"*");
	}
	
	public static void plus(int x) {
		System.out.println(x + 100);
	}
	
	public static void plus(int x,int y) {
		System.out.println(x + y);
	}
	
	public static void plus(double x) {
		System.out.println(x + 100);
	}
	public static void plus(String x) {
		System.out.println(x + 100);
	}
	

}
