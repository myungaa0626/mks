package bakjoonProblem;

import java.util.Arrays;
import java.util.Scanner;

public class bakjoon10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int h = 0;
		int w = 0;
		int n = 0;
		int[] arr = new int[x];
		
		for(int i=0; i<arr.length; i++) {
			
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			
			if(n>h) {
				if(n % h != 0) {
					
					arr[i] = (n % h * 100) + (n/h)+1; 
					
				}else if(n % h == 0) {
					
					arr[i] = h * 100 + (n/h)+1;
				}
			}else if( n<=h ) {
			
				arr[i] = n * 100 +1;
			}
			
			
			
			
			
		}
		for(int item:arr) System.out.println(item);
	}
}
