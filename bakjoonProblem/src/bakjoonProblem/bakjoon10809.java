package bakjoonProblem;

import java.util.Arrays;
import java.util.Scanner;

public class bakjoon10809 {
		
	public static void main(String[] args) {
		
		// 영문 소문자 = 97 ~ 122
		char[] arr = new char[26];  // 알파벳 배열 선언
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (char)(97+i);
		}

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		char[] charArr = new char[s.length()]; // 입력값 배열 선언
		
		for(int i =0; i<s.length(); i++) { // 입력 string char로 전환
			charArr[i]= s.charAt(i);
		}
		
		System.out.println(charArr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(charArr));
	

		for(int i =0; i<arr.length; i++) { // 26
			
			
			
			
			
			
		}
		
		
		
		for(int item:arr) System.out.println(item+" ");
		
		
		
		
		
		
	}	
		
}		


























