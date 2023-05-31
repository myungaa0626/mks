package day06_Array;

import java.util.Random;
import java.util.Scanner;

public class QuizEx02 {

	public static void main(String[] args) {
		// 비가 온 날에 대한 강수량 평균(소수점 2자리까지 출력)
		//int SU = 30;
		System.out.println("배열 크기는? ");
		Scanner sc = new Scanner(System.in);
		int NUM = sc.nextInt();
		double[] arr = new double[NUM];
		Random rand = new Random();
		double sum = 0;
		for(int i =0; i<arr.length; i++) {
			arr[i] = rand.nextDouble(10);
			sum = sum+arr[i];
			
			System.out.print(arr[i]+"\t");
			if(i%3==2) {
				System.out.println();
			}
			
		}
	
		System.out.printf("평균 : %.2f",sum/NUM);
	}

}

/*
 * 문제] 기상청 출근했어요 (단, 특정월(4월) 30일 기준)
 *  비가 온 날에 대한 강수량 평균 (소수점 2자리까지 출력) 구하는 프로그램 작성
 */

