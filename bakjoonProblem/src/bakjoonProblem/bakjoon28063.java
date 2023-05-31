package bakjoonProblem;

import java.util.Scanner;

public class bakjoon28063 {
		
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 판의 크기
		int x = sc.nextInt(); // x 좌표 값
		int y = sc.nextInt(); // y 좌표 값
		
		int[][] arr = new int[n][n]; //  4 4
		
		if(n==1 && x==1 && y==1) {
			
			System.out.println(0);
			
		}else if((x==1 && y==1) || (x==1 && y==n) || (x==n && y==1) || (x==n && y==n)){
			
			System.out.println(2);
			
			
		}else if((x==1 && y<n) || (x<n && y==1) || (x==n && y<n) || (x<n && y==n)) {
		
			System.out.println(3);
		
		}else if(x>=2 && y>= 2) {
			
			System.out.println(4);
		}	
	}		
}		