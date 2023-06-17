package bakjoonProblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class bakjoon11659 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int start = 0;
		int end = 0;
		int sum =0;
		int[] arr = new int[n];
		int[] temp = new int[m];
		for(int i = 0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			for(int j = start; j<=end; j++) {
				sum += arr[j-1];
			} // inner for end
			temp[i]=sum;
			sum=0;
		} // outer for end
		for(int item:temp)System.out.println(item);
	}	
}		