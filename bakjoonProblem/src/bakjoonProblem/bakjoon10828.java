package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bakjoon10828 {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++ ) {
			st = new StringTokenizer(br.readLine());
			
			
			switch(st.nextToken()) {
			
				case "push" :
					int num = Integer.parseInt(st.nextToken());
					arr[i] = num;
					sb.append(arr[i]).append('\n');
					break;
					
				case "top" :
					if(arr.length==0) {
						
						sb.append(-1).append('\n');
					}else {
						
						sb.append(false); // ????
					}

					break;
					
				case "size" :	
					
					
					
					break;
					
				case "empty" :
					
					if(arr.length==0) {
						
						sb.append(1).append('\n');
						
					}else {
						sb.append(0).append('\n');
					}
					break;
					
				case "pop" :
					if(arr.length==0) {
						
						sb.append(-1).append('\n');
						
					}else {
						
					}
					
					
					
					break;
					
					
					
					
			
			} // switch end		
		} // for end
		
		System.out.println(Arrays.toString(arr));
		System.out.println(sb);
		
	} // end method
} // end class		