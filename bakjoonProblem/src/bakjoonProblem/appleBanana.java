package bakjoonProblem;
import java.util.Arrays;
import java.util.Scanner;
public class appleBanana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0; // 사과 개수
		int b = 0; // 바나나 개수
		int[] arr = new int[2];
		for(int i=0; i<2; i++) { // 사과, 바나나의 개수 입력 받는 for문
			arr[i]= sc.nextInt();
		}
		
		if(arr[0]<arr[1]) {
			for(int i =1; i<arr[0]+1; i++) {// 친구의 수를 1명씩 늘림
				if(arr[0]%i==0 && arr[1]%i==0) {
					System.out.println(i+" "+arr[0]/i+" "+arr[1]/i);
				}
			}
			
		}else if(arr[0]>=arr[1]) {
			for(int i =1; i<arr[1]+1; i++) {// 친구의 수를 1명씩 늘림
				if(arr[1]%i==0 && arr[0]%i==0) {
					System.out.println(i+" "+arr[0]/i+" "+arr[1]/i);
				}
			}
		}	
		System.out.println(480%61);
	}		
}		