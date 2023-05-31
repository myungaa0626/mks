package bakjoonProblem;
import java.util.Arrays;
import java.util.Scanner;
		
public class bakjoon10811 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i]=i+1;
		}
		int m = sc.nextInt(); 
		for(int i = 0; i<m; i++) {
			int a = sc.nextInt(); 
			int b = sc.nextInt(); 
			for(int j =0; j<=(b-a)/2; j++) {
				int temp = arr[a-1+j];    
				arr[a-1+j] = arr[b-1-j]; 
				arr[b-1-j]=temp;
			}
		}
//		for(int i =0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}	
		for(int item:arr) System.out.print(item+" ");
	}		
}		