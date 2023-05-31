package bakjoonProblem;

import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 학생 수
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int countYes = 0; // 찬성 투표
		int countNo = 0; // 반대 투표
		int countMu = 0; // 무효표
		
		for(int i =0; i<n; i++) {
			if(arr[i]==1) countYes++;
			if(arr[i]==-1) countNo++;
			if(arr[i]==0) countMu++;
		}
		
		if(countMu>=(countYes+countNo)) {
			
			System.out.println("INVALID");
			
		}else if((countMu+countYes)<=countNo  ) {
			
			System.out.println("REJECTED");
		}
		
		else if(countYes>(countNo+countMu)) {
			System.out.println("APPROVED");
		}
	}
}
