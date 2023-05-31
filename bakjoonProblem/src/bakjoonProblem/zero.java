package bakjoonProblem;
		
import java.util.ArrayList;
import java.util.Scanner;
		
public class zero {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 배열에 수 입력 횟수 값
//		int[] arr = new int[num];
		
		for(int i = 0; i<num; i++) { //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9 << 10개의 숫자 입력 가능
			
			int[] arr = new int[num];
			
			int numInput = sc.nextInt(); // 입력될 값
//			System.out.println(numInput);
			if(numInput == 0 ) { // 입력된 값이 0 이라면
				
				arr[i-1]=0;     // 앞에있는 숫자를 0으로 만듬
				System.out.println(arr[i-1]); //앞에 있는 값을 출력

			}
			else {
				arr[i]=numInput;
				
				System.out.println(arr[i]);
			}
			
			int total =+ arr[i];
			System.out.println(total);
			
		}	
		// 배열의 합을 출력하는 출력문을 만들어야함 확인하기 위해
	}		
}		
		