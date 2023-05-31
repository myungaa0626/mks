package ex03.Exception;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
			
			int x, y, result;

			try {    // 에러가 발생하는 부분에 try-catch문을 이용하면 된다.
				
				System.out.println("x, y = ");
				x =new Scanner(System.in).nextInt( );
				y =new Scanner(System.in).nextInt( );
				result= x/y;    // 에러 발생 할수있다. (0으로 나눌시)
				System.out.println(result);
			}catch(Exception e) {
				//System.out.println("0으로 나눌수 없습니다.");
				//System.out.println(e.getMessage());
				//e.printStackTrace(); //
			}
		}
//	public static void main(String[] args) {
//		
//		System.out.println("x, y = ");
//		int x, y, result;
//		
//		x =new Scanner(System.in).nextInt( );  y =new Scanner(System.in).nextInt( );
//		
//		if( y == 0 ) {
//			System.out.println("0으로 나눌수 없습니다.");
//			System.exit(0);
//		}
//		result= x/y;    // 에러 발생
//		
//		System.out.println(result);
//	}
}