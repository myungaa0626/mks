package bakjoonProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bakjoon11866 {
		
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 사람수
		int k = sc.nextInt(); // k번째 사람 제거
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++) {
			
			q.add(i);
		}
		
		System.out.println(q);
		
		
		
		
		
		
		
		
		
		
		
	}	
		
}		