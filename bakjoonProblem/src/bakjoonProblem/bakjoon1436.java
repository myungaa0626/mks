package bakjoonProblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bakjoon1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt =0;
		int num =665;
		while (n!=cnt) {
			num++;
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
	}	
}