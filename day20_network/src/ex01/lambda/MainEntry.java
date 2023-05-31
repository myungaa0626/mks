//package ex01.lambda;
//
//interface Message {
//	void something();
//}
//
//class Person {
//	public void greeting(Message msg) {
//		msg.something();		
//	}
//}
//
//public class MainEntry {
//	public static void main(String[] args) {
////		 Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		
//		p.greeting(new Message() { // 일반적인 형태
//			@Override
//			public void something() {
//				System.out.println("good morning");
//				System.out.println("한주 열공 감사요!!");
//
//			}
//		});
//		
//		System.out.println("-------------------------------");
//		
//		p.greeting(()->{ // 람다 형태
//			System.out.println("람다 안녕");
//				System.out.println("한주 열공 감사요!!"); });
//		
//	} //method end
//}	// class end
//	