package day06_Array;

public class Quiz2DArrayMultiply {

	public static void main(String[] args) {
		
		// {1,2,?}  ? = 1*2 = 2
		// {5,7,?}  ? = 5*7 = 35
		
		int[][] a = new int[][] {{1,2,0},     // 1*2 = 2
								 {5,7,0}};	  // 5*7 = 35
																
		for(int i=0; i<a.length; i++) {
			a[i][2] = a[i][0]*a[i][1];
			
		} // for

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			} 
			System.out.println();
		}	
	} //method
} //class
