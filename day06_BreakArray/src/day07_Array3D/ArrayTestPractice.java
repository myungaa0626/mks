package day07_Array3D;

import java.util.ArrayList;

public class ArrayTestPractice {

	public static void main(String[] args) {
		
		
		int height = 167;
		int height1 =190;
		int count = 0;
//		int[] arr = {149, 180, 192, 170};
		int[] arr1= {180,120,140};
		
        for(int i =0; i<arr1.length; i++) {
        	if(arr1[i]>height1) {
        		
        		count++;
        	}
 
        }
        
		System.out.println(count);
		
	
	}

}
