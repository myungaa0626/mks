package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bakjoon2751 {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		
		
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
			
		}	
		
		Arrays.sort(arr);
		
		
		for(int i =0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		
		
		
		
	}		
}		