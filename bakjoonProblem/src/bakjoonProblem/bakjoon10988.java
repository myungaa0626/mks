package bakjoonProblem;

import java.util.Scanner;

public class bakjoon10988 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int half = input.length()/2;
		String FirstHalf = input.substring(0, half);
		
		
		 if(input.length()%2==0) { // 2로 나누어 떨어지면 좌와 우의 문자 개수가 같음
			
			String halfStr = input.substring(half);
			
			StringBuffer sb = new StringBuffer(halfStr);
			String reversedStr = sb.reverse().toString();
			
			
			int b = (FirstHalf.equals(reversedStr)) ? 1:0;
			System.out.println(b);

			
		}else if(input.length()%2!=0) {

			String halfStr = input.substring(half+1);
			
			StringBuffer sb = new StringBuffer(halfStr);
			String reversedStr = sb.reverse().toString();

			int c = (FirstHalf.equals(reversedStr)) ? 1:0;
			System.out.println(c);
			
			
		}
	}	
}		