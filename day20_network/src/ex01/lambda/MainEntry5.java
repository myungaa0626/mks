//package ex01.lambda;
//
//
//// 타입을 써야할 상황이 있다.
//interface Message {
//	void something(int x, int y); // parameter X
//}
//
//interface Talk{
//	
//	void something(String x, String y);
//	
//}
//
//
//class Person {
//	public void greeting(Message msg) {
//		msg.something(3,5);
//		System.out.println("Message interface something: ");		
//	}
//	public void greeting(Talk msg) {
//		msg.something("hello", "DeaBo!!");
//	}
//}
//public class MainEntry5 {
//	public static void main(String[] args) {
////		 Lambda Expression, JDK 1.8 이상
//		Person p = new Person();
//		p.greeting(new Message() { // 일반적인 형태
//			@Override
//			public void something(int x, int y) {
//				System.out.println(" 리턴타입, 파라미터 안녕");
//				System.out.println("x = "+x+" y = "+y);
//				return;
//			}
//
//		});
//		
//		System.out.println("-------------------------------");
//		
//		
////		p.greeting(x, y)-> {//에러발생 타입에 대해서 애매해서 타입을 정확히 써줘야함;
////		p.greeting((int x, int y))-> {
////			
////			System.out.println(x+" "+y);
////			
////		};
//		char ch = 'K';
//		
//		p.greeting((String x, String y)->{ // 람다 형태, 자료형 안써도됨, 매개변수가 2개 이상일때는 괄호 생략하면 안됨
//			System.out.println("람다 안녕");
//				System.out.println("한주 열공 감사요!!"); 
//				System.out.println(x+" "+y);
////				ch = 'P'; // 값 변경 할수 없다
//				num = 500; // static 변수값은 변경 가능함.
//				System.out.println(num);
//		});
//	
//		
//	} //method end
//	
//	
//	
//	static int num = 30;
//	
//	
//	
//}	// class end
//	