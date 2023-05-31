package Algorithm;

import java.util.Scanner;

public class ArrayAdditionPractice {

	public static void main(String[] args) {
		// 스캐너를 이용하여 [i]와 [j]값을 더하여 [k] 값을 출력하라
		// 
		// [3][2][5]
		// [1][7][8]
		
		Scanner sc = new Scanner(System.in);
							// i  j
		int[][] arr = new int [2][3];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length-1; j++) {

				arr[i][j] = sc.nextInt();

			}
		}
//		int[][]arr = {{1,2,0}, //  0= 3
//					  {4,5,0}}; // 0= 9
//		
//		
//		System.out.println(arr[0][2] = arr[0][0]+arr[0][1]);
//		System.out.println(arr[1][2] = arr[1][0]+arr[1][1]);

	}
}
