package Level0;

import java.util.Arrays;

public class BigNumber120899 {// 배열에서 가장 큰수와 위치값 찾기

	public static void main(String[] args) {
		
		
		//int[] answer = new int[num_list.length];
		int[] array = {1,8,3};
		//int[] array = new int[2];
		//int[] result = new int[3];

		for(int i=0; i<array.length; i++) {
			
			if(array[i]>array[0]) {
				
				
				array[0]=array[i];
				array[1]=i;
				
			}

		}
		int[] answer= {array[0],array[1]};
		
		System.out.println(Arrays.toString(answer));
		
		

	}

}




















