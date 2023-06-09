package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bakjoon10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Deque<Integer> deq = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i =0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch (st.nextToken()) {
			
				case "push_back": 
					int num = Integer.parseInt(st.nextToken());
					deq.addLast(num);
					break;
				
				case "push_front":
					num = Integer.parseInt(st.nextToken());
					deq.addFirst(num);
					break;
					
				case "front":
					if(deq.size()==0) {
						sb.append(-1).append('\n');
					}else {
						sb.append(deq.getFirst()).append('\n');
					}
					break;
					
				case "back":
					if(deq.size()==0) {
						sb.append(-1).append('\n');
					}else {
						sb.append(deq.getLast()).append('\n');
					}
					break;

				case "size":
					sb.append(deq.size()).append('\n');
					break;
				
				case "empty":
					if(deq.size()==0) {
						sb.append(1).append('\n');
					}else {
						sb.append(0).append('\n');
					}
					break;
				
				case "pop_front":
					if(deq.size()==0) {
						sb.append(-1).append('\n');
					}else {
						
						sb.append(deq.getFirst()).append('\n');
						deq.removeFirst();
					}
					break;
					
				case "pop_back":
					if(deq.size()==0) {
						sb.append(-1).append('\n');
					}else {
						sb.append(deq.getLast()).append('\n');
						deq.removeLast();
					}
					break;
			}
		}
		System.out.println(sb);
	}
}