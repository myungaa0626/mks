package bakjoonProblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class bakjoon1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n]; 
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {

			arr[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int answer=0;
			int left = 0;
			int right = arr.length - 1;
			int num = Integer.parseInt(st.nextToken());
			while(left<=right) {
				int mid = (left+right)/2;
				
				if(arr[mid]==num) {
					answer = 1;
					break;
				}
				if(arr[mid]<num) {
					left = mid + 1;
					
				}else if(arr[mid]>num) {
					right = mid - 1;
				}
			}
			System.out.println(answer);
		}
	}		
}		