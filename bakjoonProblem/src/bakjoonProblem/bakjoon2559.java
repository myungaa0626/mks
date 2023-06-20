package bakjoonProblem;

import java.util.Scanner;

public class bakjoon2559 {
		
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i =1; i<=m; i++) {
			sum+=arr[i];
		}
		int maxSum = sum;

		for(int i=1; i<=n-m; i++) {
			sum = sum-arr[i]+arr[i+m];
			if(sum>maxSum) {
				maxSum =sum;
			}	
		}
		System.out.println(maxSum);
	}		
}		