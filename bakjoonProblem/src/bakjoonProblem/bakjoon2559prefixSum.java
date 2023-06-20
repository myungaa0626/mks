package bakjoonProblem;

import java.util.Scanner;

public class bakjoon2559prefixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			
			arr[i]=arr[i-1]+sc.nextInt();
		}
		int max = -10000001;
		for(int i =m; i<=n; i++) {
			int sum = arr[i]-arr[i-m];
			if(max <sum) {
				max=sum;
			}
			
			
		}
		
		System.out.println(max);

	}

}
