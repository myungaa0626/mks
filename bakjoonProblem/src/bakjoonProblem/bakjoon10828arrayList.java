package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bakjoon10828arrayList {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i =0; i<n; i++ ) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			
				case "push" :
					int num = Integer.parseInt(st.nextToken());
					list.add(num);
					break;
					
				case "top" :
					if(list.size()==0) {
						sb.append(-1).append('\n');
					}else {
						sb.append(list.get(list.size()-1)).append('\n');
					}
					break;
					
				case "size" :	
					if(list.size()==0) {
						sb.append(0).append('\n');
					}else {
						sb.append(list.size()).append('\n');
					}
					break;
					
				case "empty" :
					if(list.size()==0) {
						sb.append(1).append('\n');
					}else {
						sb.append(0).append('\n');
					}
					break;
					
				case "pop" :
					if(list.size()==0) {
						sb.append(-1).append('\n');
					}else {
						sb.append(list.get(list.size()-1)).append('\n');
						list.remove(list.size()-1);
					}
					break;
			} // switch end		
		} // for end
		System.out.println(sb);
	}
}
