package CodingTest;

import java.util.Scanner;

public class CodingTest2 {
	static final int MOD = 1000000007;
	static int AnswerN;
//	static int N = 10;

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();

	        for (int t = 1; t <= T; t++) {
	            int N = sc.nextInt();
	            int[] A = new int[N + 1];
	            for (int i = 1; i <= N; i++) {
	                A[i] = sc.nextInt();
	            }

	            int[] D = new int[N + 1];
	            int answer = 0;

	            for (int i = 1; i <= N; i++) {
	                D[i] = Math.max(D[i - 1], 0) + A[i];

	                for (int b = 1; b <= i - 2; b++) {
	                    D[i] -= Math.min(D[i - b], 0);
	                }

	                answer = Math.max(answer, D[i]);
	            }

	            System.out.printf("#%d %d\n", t, Math.abs(answer) % MOD);
	        }

	        sc.close();
	}

}
