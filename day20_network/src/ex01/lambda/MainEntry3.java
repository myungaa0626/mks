package ex01.lambda;

interface Message {
	int something(int x); // int return type, parameter X
}

class Person {
	public void greeting(Message msg) {
		int su = msg.something(10);
		System.out.println("Message interface something: "+ su);		
	}
}

public class MainEntry3 {
	public static void main(String[] args) {
//		 Lambda Expression, JDK 1.8 이상
		Person p = new Person();
		
		p.greeting(new Message() { // 일반적인 형태
			@Override
			public int something(int x) {
				System.out.println(" 리턴타입, 파라미터 안녕");
				System.out.println("한주 열공 감사요!!");
				return 50;

			}
		});
		
		System.out.println("-------------------------------");
		
		
		p.greeting(x->{ // 람다 형태, 자료형 안써도됨
			System.out.println("람다 안녕");
				System.out.println("한주 열공 감사요!!"); 
				return 20;
		});	
	} //method end
}	// class end
	