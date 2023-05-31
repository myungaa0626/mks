package bakjoonProblem;

import java.util.Scanner;

public class soin {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 예제 입력 값
		//  72     
		
		//  /2	= 36
		//  /2	= 18
		//  /2	= 9
		//  /3	= 3
		//  /3	= 1

		for(int i = 2; i<=n; i++ ) {// 2부터 나누기 시작
			if(n%i==0) { // 72 / 2 = 36
				n=n/i;

				System.out.println(i);
				i--;
			}	
		}	
	}		
}		