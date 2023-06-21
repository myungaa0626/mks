package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bakjoon2869new {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int dest = Integer.parseInt(st.nextToken());
		
		int ans = (dest-down)/(up-down);
		
		if( (dest-down)%(up-down)!=0) {
			
			ans= ans+1;
			
		}

		System.out.println(ans);
	}		
}	