package day06_Array;

public class Quiz2DArrayAddition {

	public static void main(String[] args) {
		//2차원, 3차원 배열
		
		//  {3,8,5,10}
		//  {7,1,2,3 }     +
		//  ------------
		// {10,9,7,13}
		
				// 1.

				int[][] a = new int[][] {{3,8,5,10}, // 배열 위치 선언
										 {7,1,2,3},
				                         {0,0,0,0}};
				                          
				for(int j =0; j<a[0].length; j++) { // 1열과 2열 더해서 
													// 3열을 구하는 알고리즘
					
					a[2][j]= a[0][j] + a[1][j];
					
				}
				
				for(int i=0; i<a.length; i++) {// 계산된 알고리즘을 배열로 화면에 출력
					for(int j=0; j<a[0].length; j++) {
						
						System.out.print(a[i][j]+"\t"); // 가로측 (3 8 5 10) 
					}
					System.out.println(); // 세로측
				}
		
	}

}
