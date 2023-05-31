package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class blackJack {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i =0; i<arr.length; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for(int i =0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(i==j)continue; 
					if(i==k)continue; 
					if(j==k)continue;
					if(arr[i]+arr[j]+arr[k]<=m && arr[i]+arr[j]+arr[k]>max ) {
						
						max = arr[i]+arr[j]+arr[k];
						
					}
				}	
			}
		}
		System.out.println(max);
	}
}
