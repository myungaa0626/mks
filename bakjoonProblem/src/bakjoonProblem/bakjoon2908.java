package bakjoonProblem;
		
import java.util.Scanner;
		
public class bakjoon2908 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] a = sc.next().split("");
		String[] b = sc.next().split("");
		
//		int[] arrA = new int[3];
//		int[] arrB = new int[3];
		
		StringBuilder sb = new StringBuilder();

		
		// 437  398		437
		// 122  132		132
		// 938  732		938
		
		for(int i =0; i<a.length; i++) {
			
			sb.append(a[a.length-1-i]);	
		}
		

		
		for(int i =0; i<b.length; i++) {
			
			sb.append(b[b.length-1-i]);
		}
		
		sb.insert(3, " ");
		System.out.println(sb);
		
		
		
		
		
	}	
}		
		
		
		
		
		
		
		
		
		
		























