package bakjoonProblem;
			
import java.util.Scanner;
			
public class bakjoon25166 {
			
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		int ariMoney = 1023;
		int breadPrice = sc.nextInt();
		int moneyLend = sc.nextInt();
			
		if(breadPrice <1024) {
			
			System.out.println("No thanks");
			
		}else if((breadPrice & ariMoney) == breadPrice) { //    
			
			System.out.println("Thanks");
			
		}else {
			
			System.out.println("Impossible");
		}	
	}		
}			