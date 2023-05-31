package ex03.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {

	public static void main(String[] args) throws Exception {// Throws 위임 (예외처리 위임)
		
		int x, y, result;
			
			System.out.println("x, y = ");
			x =new Scanner(System.in).nextInt( );
			y =new Scanner(System.in).nextInt( );
			
			result= x/y;   
			
			System.out.println(result);


	}

}
