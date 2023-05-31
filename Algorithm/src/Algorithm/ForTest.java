package Algorithm;

public class ForTest {

	public static void main(String[] args) {
		
		//1~100까지의 합
		
		int tot = 0;
		
		for(int i =1; 100>=i; i++) {
			
			
			tot=tot+i;
			
			
		}
		
		System.out.println(tot);
		
		// 1~100까지 짝수의 합
		
		int totEven = 0;
		
		for(int i = 1; 100>=i; i++) {
			if(i%2==0) {
				
				totEven = totEven + i;
				
			}
			
		}
		System.out.println(totEven);
		
		

	}

}
