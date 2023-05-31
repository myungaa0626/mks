package bakjoonProblem;
import java.util.Scanner;
public class voting2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 투표자 수
		int[] arr = new int[n];
		
		int count = 0; // 무효표
		int result = 0;
		
		for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
				result+= arr[i]; // 0 외의 숫자를 카운트함
				if(arr[i]==0) count++;	// for문을 이용하여 0의 개수를 카운트함
		}
		if(count>=n*0.5) {
			System.out.println("INVALID");	
		}
		else if(result>0 && (count<n*0.5)) {
			System.out.println("APPROVED");
		}
		else if(result<=0 && (count<n*0.5) )
			System.out.println("REJECTED");
	} // end main method
} // end class
