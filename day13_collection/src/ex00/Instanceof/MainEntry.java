package ex00.Instanceof;


class A{} //부모

class B extends A{} //자식

public class MainEntry {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
//		B a1 = new A();
		
		// 주로 상속 관계에서 부모객체인지 자식 객체인지 확인하는 데 사용
		
		System.out.println("a instanceof A "+(a instanceof A));
		System.out.println("a instanceof A "+(b instanceof A));
		System.out.println("a instanceof A "+(a instanceof B));
		System.out.println("a instanceof A "+(b instanceof B));
		
	}

}
