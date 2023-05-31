package day07_Array3D;

import java.util.Random;
import java.util.Scanner;

public class Array2DMultiply {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // 행
		int y = sc.nextInt(); // 열
		int[][] arr = new int[2][3];
		
		for(int i =0; i<arr.length; i++) {	
					//arr[i][j]=rand.nextInt(10)+1;	
				arr[i][2]= arr[i][0]*arr[i][1];
		}
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]+"  ");
			}System.out.println();
		}

	}

}
