package bakjoonProblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
public class bakjoon26069 {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		HashMap<String, Integer> map = new HashMap<>();
		HashSet<String> set = new HashSet<>();
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;	
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			String str2 = st.nextToken();
			
			set.add(str);
			set.add(str2);
			
			if(map.containsKey(str)) {
				if(map.get(str)==1) {
					
					map.put(str2, 1);
					continue;
				}
			}
			if(map.containsKey(str2)) {
				if(map.get(str2)==1) {
	
					map.put(str, 1);
					continue;
				}
			}
			if(str.equals("ChongChong")) {
				map.put(str, 1);
				map.put(str2, 1);

			}else if(str2.equals("ChongChong")) {
				map.put(str, 1);
				map.put(str2, 1);
				
			}else {
				
				map.put(str, 0);
				map.put(str2, 0);
			}
		}
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			if(map.get(it.next())==1) {
				
				cnt++;
			}
		}
		System.out.println(cnt);
	}	
}