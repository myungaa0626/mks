package bakjoonProblem;

import java.util.Scanner;

public class bakjoon2869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int up =sc.nextInt();	 // 올라가는 거리
		int down =sc.nextInt();	 // 내려가는 거리
		int dest = sc.nextInt(); // 도착지점
		int zero = 0; 			 // 시작지점
		int cnt = 0;		
		int total = 0;
		
		while(true) {
			
			up = zero + up;
			total=up-down;
			
			if(dest<=total) {
				

				break;
				
			}else
				
				cnt++;
		
		}
		
		System.out.println(cnt);
	}	
}		