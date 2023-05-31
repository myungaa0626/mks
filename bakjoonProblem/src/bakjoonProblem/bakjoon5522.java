package bakjoonProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bakjoon5522 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int sum = 0;
		
		for(int i =0; i<5; i++) {
			
			sum += br.read();
	
		}
		System.out.println(sum);
	}
}
