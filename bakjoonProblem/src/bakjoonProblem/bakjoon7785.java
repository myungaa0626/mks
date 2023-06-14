package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bakjoon7785 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Map<String, String> emp = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		for(int i =0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status =st.nextToken();
			emp.put(name, status);
	    	if(emp.containsValue("leave")) {
	    		emp.values().remove("leave");
	    	}
		}

        List<String> keySet = new ArrayList<>(emp.keySet());
        Collections.reverse(keySet);
        for (String key : keySet) {
            System.out.print(key+"\n");
        }
	}
}