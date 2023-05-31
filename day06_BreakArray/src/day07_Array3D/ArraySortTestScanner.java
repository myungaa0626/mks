package day07_Array3D;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortTestScanner {

	public static void main(String[] args) {
		
		// ArraySortTest 에 스캐너를 추가한 업그레이드 버젼
		//스캐너를 이용하여 배열을 생성후 입력 된 배열의 오름차순, 내림차순 출력
		
		Scanner sc = new Scanner(System.in);
		// 1. 배열생성
		System.out.println("입력할 정수 개수 입력");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("sort 할 정수 " + n + "개 입력");
		for(int i =0; i< arr.length; i++) {
			arr[i] = sc.nextInt();		
		}

		Arrays.sort(arr);

		System.out.println("\n\n오름차순 sort 후 출력 : ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println("\n\n내림차순 sort 후 출력 : ");
		for(int i =arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+"\t");
		}
	}
}
