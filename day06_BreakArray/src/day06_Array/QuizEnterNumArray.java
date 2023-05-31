package day06_Array;

import java.util.Random;
import java.util.Scanner;

public class QuizEnterNumArray {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[7];
		int seek = rand.nextInt(10)+1;
		int cnt = 0;
		
		for(int i =0; i<arr.length; i++) {
			arr[i]=rand.nextInt(10)+1;
			if(seek == arr[i]) cnt++;
		}
		
		
		System.out.println(seek+ "의 개수 : "+ cnt);
		System.out.print("배열 : ");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(", ");
			}
		}
	} // method
} // class
