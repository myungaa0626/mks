package bakjoonProblem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bakjoon14659 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0; // 죽인 적의 수
		int max = 0; 
		int ans = 0;    
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max ) {
				max=arr[i];
				cnt=0;      // 카운트를 초기화
			}else {
				cnt++;
			}
			ans = Math.max(ans, cnt); // 가장 높은 값을 저장
		}
		System.out.println(ans);
	}	
}		