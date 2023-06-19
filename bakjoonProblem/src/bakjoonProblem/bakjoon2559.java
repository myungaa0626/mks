package bakjoonProblem;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bakjoon2559 {
		
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum=0;
		int maxSum = sum;
		int[] arr = new int[n+1];

		for(int i=1; i<=n; i++) {
			
			arr[i] = sc.nextInt();

		}
		
		
		for(int i =1; i<=m; i++) {
			
			sum+=arr[i];
		}
		System.out.println(sum);
		for(int i=1; i<=n-m; i++) {
			sum = sum-arr[i]+arr[i+m];
			if(sum>maxSum) {
				maxSum =sum;
			}	
		}
		System.out.println(maxSum);
		
	
	}		
}		