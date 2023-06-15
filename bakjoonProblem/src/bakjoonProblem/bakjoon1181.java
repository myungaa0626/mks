package bakjoonProblem;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class bakjoon1181 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> set = new HashSet<>();
		
		LinkedList<String> list = new LinkedList<>(set);
			
			
		int n = sc.nextInt();
				
		for(int i=0; i<n; i++) {
			String str = sc.next();
			
			list.add(str);

		}
		
		Collections.sort(list);
		
	
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		
		
		
		
		
		
		
		
		
	}	
		
}		



