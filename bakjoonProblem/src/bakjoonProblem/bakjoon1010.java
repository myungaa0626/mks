package bakjoonProblem;

import java.math.BigInteger;
import java.util.Scanner;

public class bakjoon1010 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int num = sc.nextInt();
		
		for(int i =0; i<num; i++) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			long result = 1l;
			
			for(int j =0; j < n; j++) {
				
				result *= (m-j);
				result /= (j+1);
				
			}
			
			System.out.println(result);
		}
	}	
}		