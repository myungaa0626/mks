package bakjoonProblem;

import java.util.Arrays;
import java.util.Scanner;

public class bakjoon10818 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
			
		}
		Arrays.sort(arr);
		System.out.print(arr[0]+" ");
		System.out.println(arr[arr.length-1]);
	}	
		
}		