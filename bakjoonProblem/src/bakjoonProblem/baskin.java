package bakjoonProblem;
import java.util.Arrays;
import java.util.Scanner;
public class baskin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 게임 판수 
		int[] arr = new int[n];
		int i = 0;
		for(i = 0; i<n; i++) {// (j-1)/(1+m)= x    ...  r    r + (m+1)*i, r + (m+1)*i ......
			int j = sc.nextInt(); // 배스킨라빈스31 길이 
			int m = sc.nextInt(); // 배스킨라빈스 1~m
                arr[i]= (((j-1)/(m+1))+1)*2;
		}	
		int min = arr[0];
        int minIndex = 0;
		for(i=0; i<n; i++) {

			if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
		}
		System.out.print(minIndex+1+" ");
//		Arrays.sort(arr);
		
		System.out.println(min);
	}
}