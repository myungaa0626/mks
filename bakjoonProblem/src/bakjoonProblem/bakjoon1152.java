package bakjoonProblem;

import java.util.Scanner;

public class bakjoon1152 {
		
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine().trim();
		String[] str = word.split(" ");
		int count = 0;
		
		for(int i = 0; i<str.length; i++) {
			
			if(word == "") {
				
				count= 0;
				
			}else {
				count++;
				
			}
		}
		System.out.println(count);
	}	
}		