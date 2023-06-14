package bakjoonProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class bakjoon1302 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map =new HashMap<>();
		
		int n = sc.nextInt();
		int max =0;
		for(int i=0; i<n; i++) {
			String str = sc.next();
			map.put(str, map.getOrDefault(str, 0)+1);
			max = Math.max(max, map.get(str));	
		}
	
		
		
		

	}		
}		