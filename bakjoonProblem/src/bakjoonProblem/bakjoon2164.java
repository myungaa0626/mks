package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bakjoon2164 {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			Scanner sc = new Scanner(System.in);
			Queue<Integer> q = new LinkedList<>();
			for(int i =1; i<=n; i++) {
				q.add(i);
			}	
			while(q.size()>1) {
				q.poll();
				q.offer(q.poll());
			}
			System.out.println(q.poll());
	}	
}		