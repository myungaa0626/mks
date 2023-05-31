package Algorithm;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		while(i<30) {
			if(i==25) break; 
			
			System.out.println("반복");
			i++;
			
		}
		
		System.out.println("done");
		
		
		

	}

}
