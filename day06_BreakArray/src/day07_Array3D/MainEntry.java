package day07_Array3D;

import java.util.Random;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		int[] a = new int[30];
		int[][] a2 = new int[2][3];//초기화 되어 있지 않을때는 행, 열크기 생략 할 수 없다.
		int[][] a3 = new int[][] {{1,2,3},{4,5,6}};
		int[][] a4 = {{1,2,3,},{4,5,6,}};
		//int[][] a5 = {1,2,3,4,5,6,}; //error
		//int[][] a6 = new int[2][] {{1,2,3},{4,5,6,}}; //error
		int[][] a7 = {{0,},{0,}}; //{{0},{0}};
		int[][][] a8 = new int[2][2][3];//[면][행][열]
		
		// 배열 길이(크기)
		System.out.println("1차원 배열 길이 : "+a.length);//
		System.out.println("2차원 배열 행길이 : "+a2.length);
		System.out.println("2차원 배열 열길이 : "+a2[0].length);
		System.out.println();
		System.out.println("3차원 배열 면길이 : "+a8.length);
		System.out.println("3차원 배열 행길이 : "+a8[0].length);
		System.out.println("3차원 배열 열길이 : "+a8[0][0].length);
		System.out.println();
		
		// 임의적인 데이터 입력 받아서 배열 데이터값 출력하는 프로그램 작성(3차원)
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 수를 입력하시오.");
		int x = sc.nextInt(); // 면 
		System.out.println(x +" 면이 입력되었습니다.");
		int y = sc.nextInt(); // 행
		System.out.println(y +" 행이 입력되었습니다.");
		int z = sc.nextInt(); // 열 
		System.out.println(z +" 열이 입력되었습니다.");
		int[][][] arr = new int[x][y][z];
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				for(int k=0; k<arr[0][0].length;k++) {	
					arr[i][j][k]=rand.nextInt(10)+1;	
				}	
			}
		}
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				for(int k=0; k<arr[0][0].length;k++) {
					System.out.print(arr[i][j][k]+"  ");
				}	System.out.println();
			}System.out.println();
		}

		
		
	} // method

} // class
