package Quiz.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class quiz1 {

	public static void main(String[] args) 
							throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		
		System.out.println("input = ");
		int su1 = Integer.parseInt(br.readLine());
		
		System.out.println("input = ");
		int su2 = Integer.parseInt(br.readLine());
		
		
		System.out.println(" (+, -, *, /) 중 고르시오 (사칙연산)");
		
		char op = br.readLine().charAt(0);
		
		if(op == '+') {
			
			System.out.println(su1 +" + "+su2+" = "+(su1+su2));
	
		}else if(op == '-') {
			
			System.out.println(su1 +" - "+su2+" = "+(su1-su2));
		}else if(op == '*') {
			
			System.out.println(su1 +" * "+su2+" = "+(su1*su2));
		}else if(op == '/')
			System.out.println(su1 +" / "+su2+" = "+(double)su1/su2);
		
		else 
			System.out.println("잘못된 사칙연산입니다.");


	}

}
