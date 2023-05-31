package Algorithm;

public class DoubleFor {

	public static void main(String[] args) {
			
		for(int row =0; row<=3; row++) {
			for(int col =0; col<=2; col++) {
				
				System.out.println("col = ("+ row + ", "+ col + ")");
				if(row ==3 && col ==0)
					break;
				
			}
		}
	}

}
