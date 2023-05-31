//package ex01.lambda;
//interface Message {
//	int something(int x, int y); // int return type, parameter X
//}
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(3,5);
//		System.out.println("Message interface something: "+ su);		
//	}
//}
//public class MainEntry4 {
//	public static void main(String[] args) {
////		 Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		p.greeting(new Message() { // 일반적인 형태
//			@Override
//			public int something(int x, int y) {
//				System.out.println(" 리턴타입, 파라미터 안녕");
//				System.out.println("x = "+x+" y = "+y);
//				return 50;
//			}
//
//		});
//		
//		System.out.println("-------------------------------");
//		
//		p.greeting((x, y)->{ // 람다 형태, 자료형 안써도됨, 매개변수가 2개 이상일때는 괄호 생략하면 안됨
//			System.out.println("람다 안녕");
//				System.out.println("한주 열공 감사요!!"); 
//				return x+y;
//		});
//	
//		
//	} //method end
//}	// class end
//	