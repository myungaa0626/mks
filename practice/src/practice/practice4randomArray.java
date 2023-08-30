package practice;

import java.util.Random;

public class practice4randomArray {

	public static void main(String[] args) {

		 int[][] arr = new int[3][4];
	        Random rand = new Random();

	        for(int i = 0; i < arr.length; i++) {
	            int sum = 0;
	            for(int j = 0; j < arr[i].length - 1; j++) {
	                arr[i][j] = rand.nextInt(10);
	                sum += arr[i][j];
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.print(" = "+ sum + "\n");
	        }
	}

}
