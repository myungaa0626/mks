package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class back10610 {
		
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		String[] n = sc.nextLine().split(""); // 입력된 숫자를 string 쪼개서 배열에 넣음
		String[] n = br.readLine().split("");

		int[] arr = new int[n.length];   // int 배열 생성 (넣어진 string의 길이 만큼)
		for(int i = 0; i<n.length; i++) {
			
			arr[i]=Integer.parseInt(n[i]);  // string으로 입력된 숫자를 형변환하여 int에 넣음
			
		}
		
		Arrays.sort(arr); // 형변환된 int를 정렬 

//		System.out.println(Arrays.toString(arr)); // 정렬된 배열을 보기위한 코드
		int sum = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++) { // 배열의 총 합
			
			sum+=arr[i];	
		}

		
		if(arr[0]!=0 || sum%3!=0) {
			
			System.out.println(-1);
			
		}else {
			
			for(int i =0; i<arr.length; i++) {
				
				sb.append(arr[arr.length-1-i]);  // 핵심 코딩
			}
		}	

//		System.out.println(wrong);
//		System.out.println(sum);
		System.out.println(sb);

	}	
}		
