package ex01.generic;

public class GenericEx<T> { // <<<< 제네릭 만드는 방법
	
	
	T[] v;  // 멤버변수
	
	public void set( T[] v ) { // 멤버함수
		
		this.v = v;
		
	}
	
	public void print() {
		for(T item : v ) {
			System.out.println(item);
		}
	}
	
	

}
