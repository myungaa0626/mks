package bakjoonProblem;

import java.util.Arrays;
import java.util.Scanner;

public class triangle {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
//		int n = sc.nextInt();    // 입력될 삼각형 개수
		
		for(int i =0; i<3; i++) {
			
				
				arr[i] = sc.nextInt();
				
				

		} // end for
		Arrays.sort(arr);
		
		
		
		
		if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
			
			System.out.println("");
		}else if(arr[0]==arr[1]&&arr[1]==arr[2]&&arr[0]==arr[2]) {
			System.out.println("Equilateral"); // 모든 변이 길이가 같을때
			
		}else if(arr[0]+arr[1]<=arr[2]) { 
			
			System.out.println("Invalid");
			
		}else if(arr[0]+arr[1]>arr[2] && arr[0] != arr[1] && arr[1]!=arr[2] &&
				arr[2]!=arr[0]) {
			
			System.out.println("Scalene");
		}else if(arr[0]==arr[1] && arr[1]!=arr[2] || arr[1]==arr[2] && arr[1]!=arr[0]) {
			
			System.out.println("Isosceles");
		}
		
		

		
	}	// end main
		
} // end class
