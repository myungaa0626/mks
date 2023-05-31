package bakjoonProblem;


import java.util.Scanner;

public class bakjoon2033 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num = sc.nextInt();

		int length = (int)(Math.log10(num)+1)-1;
		
		for(int i=0; i<length; i++) {
			
			num = num / 10.0;

		}

		double newNum=Math.ceil(num);

		
		for(int i=0; i<length; i++) {
			
			newNum = newNum *10;
			
		}
		int newnewNum =0;
		newnewNum = (int)newNum;
		
		System.out.println(newnewNum);

	}		
}		