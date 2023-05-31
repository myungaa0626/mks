package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class milkStore {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<n; i++) {
			
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		int milkCount = 0;
		for(int i = 0; i<n; i++) {
			if(milkCount%3 == arr[i]){
				
				milkCount++;
				
			}
			
			
		}
		
		
		
		
		System.out.println(milkCount);
		
		
		
	}
}
