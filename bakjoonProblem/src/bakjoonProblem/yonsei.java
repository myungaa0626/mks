package bakjoonProblem;

import java.util.Scanner;

public class yonsei {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int totalFire = sc.nextInt(); // 총 불꽃 개수
		// 1 + i*i 
		
		
		for(int fireNum =1; fireNum<totalFire; fireNum++) { // 출력될 값 큰 불꽃 1개가 작은 불꽃으로 파생될 경우 몇번 파생되는지
			if(totalFire==(1+fireNum+(fireNum*fireNum))) {
				
				System.out.println(fireNum);
				
			}
		}
	}
}
