package bakjoonProblem;
import java.util.LinkedList;
import java.util.Scanner;

public class zero1 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++) {
			int numInput = sc.nextInt();
			list.add(numInput);
					
			if(numInput==0) {
				
				list.removeLast();
				list.removeLast();

			}
		}
		int sum =0;
		for(Integer integer : list) {
			
			sum+= integer;
		}
		System.out.println(sum);
	}
}	