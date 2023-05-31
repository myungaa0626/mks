package bakjoonProblem;
import java.util.Arrays;
import java.util.Scanner;
public class bakjoon1546 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		double[] arr = new double[n];
		double total = 0;
		
		for(int i =0; i<n; i++) {
			
			arr[i]=sc.nextInt();
			total+=arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println((total/arr[arr.length-1])/n*100);
	}	
		
}		