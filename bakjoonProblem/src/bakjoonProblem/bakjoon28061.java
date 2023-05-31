package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bakjoon28061 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int [n];
		
		for(int i =0; i<arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine())-arr.length+i;
			
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}	
		
}		