package bakjoonProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class bakjoon1764 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> set = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0; i<n; i++) {
			String nName = sc.next();
			set.add(nName);
		}
		for(int i=0; i<m; i++) {
			String mName =sc.next();
			if(set.contains(mName)) {
				list.add(mName);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i =0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}		
}		