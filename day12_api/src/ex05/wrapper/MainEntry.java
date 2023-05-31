package ex05.wrapper;
class Point{  }
public class MainEntry {
		
	public static void main(String[] args) {
		Integer Ia = new Integer(10);
		Integer Ib = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(Ia);
		System.out.println(Ia.getClass().getName()+"@"+Integer.toHexString(Ia.hashCode()));
		
		int x =77;		  // 4 바이트
		double y = 5.5;   // 8 바이트
		System.out.println(x+", "+y);
		//y = x; // 묵시적 형변환
		x = (int)y; // 명시적 형변환
		System.out.println(x+", "+y);
		
		// Boxing  vs  UnBoxing
		int c = Ia.intValue();  // jdk 4.x 이전에 사용하던 메소드
		int d = Ib;				// jdk 5.x 이후부터 autoboxing, unboxing
		int num = Integer.parseInt(su);
		System.out.println(c + num);
		System.out.println(c + d);
		System.out.println(Ia.MAX_VALUE); //  21억
		System.out.println(Ia.MIN_VALUE); // -21억
		
		//Double dd = 12.34;
		Double dd = new Double(12.34);
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println("===========================");
		c = (int)dd.doubleValue();
		System.out.println("형변환 c의 값은? " + c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("111111", 2);
		System.out.println(f);
		System.out.println(e +20);
		
		int xx = 3; // stack memory
		Integer yy = new Integer(3); // heap memory
		
		xx = yy; // autoboxing / unboxing
	}	
}		
//wrapper class :	기본 자료형에 대응되는 클래스형 자료형
//		
//기본자료형	클래스형(레퍼런스 또는 참조형)자료형
//int		      Integer
//float		      Float
//double		  Double
//char		      Character
//....		      ....