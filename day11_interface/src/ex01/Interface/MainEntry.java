package ex01.Interface;


interface A { // interface -  abstract method, final field
	int x = 90;        // final static int x = 90;
	final int y = 777; 
	char ch = 'A';
	
	// 추상메소드, abstract 생략가능함 -  무조건 추상메소드임
	public void show(); // public abstract void show();
	public abstract void disp();
	
} // A end


interface B {
	void view();
	
} // B end

interface C {
	String name = "happy";  // 상수화 되어서 밑에서 name의 값을 변경할수 없음
	public void draw();
	
} // C end

interface D extends B {
	void dview();
	
} // D end
////////////////////////////////////////////////////
class Rect implements D {

	@Override
	public void view() {     // B 인터페이스
		
		
	}

	@Override
	public void dview() {     // D 인터페이스
		
		
	}
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	
} // Rect class
///////////////////////////////////////////////////////
class Shape {
	
	
}	// Shape class
class Circle implements C{

	@Override
	public void draw() {
		//name = "doyeon";
		System.out.println(name + "님이네요.");
	}
}
//class Multi implements  B, C, A extends Shape{   << 이거 에러뜸
class Multi extends Shape implements B, C, A {
	
	@Override
	public void show() {    //A
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {    //A
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {    //C
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {    //B
		// TODO Auto-generated method stub
		
	}
} // Multi end
public class MainEntry {

	public static void main(String[] args) {
		
		// A a = new A(); // 클래스 안에서 인터페이스는 객체 생성 할수없다.

	}

}
