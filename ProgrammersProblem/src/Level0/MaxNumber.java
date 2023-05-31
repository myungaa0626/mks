package Level0;

import java.util.Arrays;
import java.util.Collections;

public class MaxNumber { // 프로그래머스 최댓값 만들기(1) 120847

	public static void main(String[] args) {
		
		int[] numbers= {5,2,9,8,15};
		int answer = 0;
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		
		
		
		answer = numbers[numbers.length-1]*numbers[numbers.length-2];
		
		System.out.println(answer);
		
//		System.out.println(numbers[numbers.length-1]*numbers[numbers.length-2]);
		
		
		
	}

}
