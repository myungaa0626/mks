package ex04.For;

public class MultiFor {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=2; i++)
		{
			for(int j=0; j<=3; j++) {
				System.out.print(j+"\t");
				
			} // j end
			
			System.out.println();
			
		}// i end
		System.out.println();
		System.out.println();
	
		for(int i =1; i<=5; i++) {
			
			for(int j =1; j<=5; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i = 5; i>=1; i--) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}
