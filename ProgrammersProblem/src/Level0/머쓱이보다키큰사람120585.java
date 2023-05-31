package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class 머쓱이보다키큰사람120585 {

public static void main(String[] args) {
		
		
		int height = 167;
//		int height1 =190;
		int count = 0;
		int[] arr = {149, 180, 192, 170};
//		int[] arr1= {180,120,140};
		
        for(int i =0; i<arr.length; i++) {
        	if(arr[i]>height) {
        		
        		count++;
        	}
 
        }
        
		System.out.println(count);
		
	
	}

}
