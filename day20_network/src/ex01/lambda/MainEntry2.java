//package ex01.lambda;
//
//interface Message {
//	int something(); // int return type, parameter X
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Message interface something: "+ su);		
//	}
//}
//
//public class MainEntry2 {
//	public static void main(String[] args) {
////		 Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() { // 일반적인 형태
//			@Override
//			public int something() {
//				System.out.println(" 리턴타입 안녕");
//				System.out.println("한주 열공 감사요!!");
//				return 100;
//
//			}
//		});
//		
//		System.out.println("-------------------------------");
//		
//		p.greeting(()->{ // 람다 형태
//			System.out.println("람다 안녕");
//				System.out.println("한주 열공 감사요!!"); 
//				return 200;
//				});
//		
//	} //method end
//}	// class end
//	