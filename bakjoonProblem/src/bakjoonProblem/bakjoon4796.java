package bakjoonProblem;

import java.util.Scanner;

public class bakjoon4796 {
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int i =1;
         
		while(true) {
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();

			if(L==0 && V == 0 && P ==0) break;
				

				int total = L * (V / P) + Math.min(L, (V % P));
				
				sb.append("Case "+i+": " + total+ "\n");
				 
				i++;
			
		}
		
		System.out.println(sb);
	
	}	
		
}		