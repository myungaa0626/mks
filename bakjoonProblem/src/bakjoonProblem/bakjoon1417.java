package bakjoonProblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class bakjoon1417 {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		

		if(n == 1) {
			
			System.out.println("0");
			System.exit(0);
			// return;
			
		}
		int dasom = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n-1];
		
		for(int i = 0; i < n-1; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		
		}
		int count = 0;
		while(true) {
			Arrays.sort(arr);
			
			if(arr[n-2]<dasom)
				break;
			count++;
			arr[n-2]--;
			dasom++;
	
		}
		System.out.println(count);

	}	
}		