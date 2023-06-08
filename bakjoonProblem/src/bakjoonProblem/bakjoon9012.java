package bakjoonProblem;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class bakjoon9012 {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Stack<Character> stack = new Stack<>();

		
		
		for(int i =0; i<n; i++) {
			
			String str = sc.next();
			
			for(int j =0; j<str.length(); j++) {
				
				char c = str.charAt(j);
				
				if(c=='(') {
					
					stack.push(c);
					
					
				}else if(stack.empty()) {
					
					System.out.println("NO");
				}else {
					stack.pop();
					
				 }	
			} // inner for end
			
			
			if(stack.empty()) {
				
				System.out.println("YES");
				
			}else {
				System.out.println("NO");
			}
			
			
		} // outer for end
		
		for(int i =0; i<n; i++) {
			
			System.out.println(stack);
		}
		
		
	} // method end	
} // class end		



