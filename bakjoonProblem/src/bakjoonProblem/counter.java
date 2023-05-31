package bakjoonProblem;

import java.util.Scanner;

public class counter {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%5==0) {
			System.out.println(n/5);
			
		}else if(n==1 || n==3) {
			System.out.println(-1);
		}else if((n%5 != 0) && (n%5%2==0)) {
			System.out.println((n/5)+(n%5/2));
		}else if(n%5!=0 && n%5%2 != 0) {
			System.out.println((n/5-1)+((n%5+5)/2));
		}else
			System.out.println(-1);
	}		
}		