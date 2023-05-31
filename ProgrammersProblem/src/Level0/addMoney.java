package Level0;

public class addMoney {

	public static void main(String[] args) {
		
		int price = 3;      // 1   2   4   8    =  15
		int money = 20;    
		int count = 4;
		int result = 0;
		int total = 0;
		
		for(int i = 1; i <=count; i++) {
			
			total += price * i;   //    
			
		}
		
		if((total-money)>=0) {
			
			System.out.println(total-money);
			
			
		}else
			System.out.println(0);
		

	}

}
