package ex02.RandomClass;

public class Assignment3 {

	public static void main(String[] args) {
		
		//과제3] 1/2 + 2/3   + 3/4  + 4/5 + 5/6   + 6/7   + 7/8   +   8/9  + 9/10= 7.07 
		      //0.5 + 0.666 + 0.75 + 0.8 + 0.833 + 0.857 + 0.875 +   .888 + .9   =
			
		double answer = 0;
			
		for(int j = 1; 9 >= j; j++) {
			for(int m = 1; j >= m; m++) {
	
				answer = (double)(answer + (j/ (m+1)));	
						
			}

		} //outer for
		
		System.out.println(answer);
		
	} // method
} // class
