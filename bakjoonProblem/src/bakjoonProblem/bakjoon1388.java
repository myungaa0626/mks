package bakjoonProblem;

import java.util.Scanner;

public class bakjoon1388 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char [][] arr = new char[n][m];
		
		for(int i=0; i<n; i++) {
			String row = sc.next();
			for(int j = 0; j<m; j++) {
				arr[i][j] = row.charAt(j);
			}
		}
		int cnt = 0;
		for(int i =0; i<n; i++) {
			int tmp =0;
			for(int j =0; j<m; j++) {
				if(arr[i][j] =='|') {
					tmp=0;
				}else if(++tmp ==1) {
					cnt++;
				}
			}
		}
		for(int j=0; j<m; j++) {
			int tmp=0;
			for(int i =0; i<n; i++) {
				if(arr[i][j] == '-') {
					tmp=0;
				}else if(++tmp ==1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);	
	}	
}		































