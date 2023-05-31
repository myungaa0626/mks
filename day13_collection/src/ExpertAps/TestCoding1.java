package ExpertAps;

import java.util.Scanner;

public class TestCoding1 {

	public static void main(String[] args) {
		
		
//		장기판에서 포가 먹을 수 있는 알의 수를 구하여라 바둑판은 8<=N<= 100 이다 .
//				이동이 가능한포는 X 로 표기된다 .
//				이동이 불가능한 다른 포는 Y 로 표기된다 일반 알은 H 로 표기되며 , 빈칸은 L 로 표기된다.
//				포 X 는 다른 포 Y 를 넘을 수 없으며 , 한 알을 넘어야 다른 알을 먹을 수 있다.
//				빈칸은 넘어간다 테스트케이스는 10 개가 주어지며 , 모두 통과해야 PASS 이고 , 일부 혹은 전부 오답일 경우 FAIL 이다.
//
//				[입력]
//				Input은 첫 줄에 Test case 의 개수 두 번째 줄에 바둑판의 크기 N 이 주어지고
//				다음 줄부터 N개씩 N 줄로 알이 표시된다
//
//				[출력]
//				출력은 테스트케이스 번호가 나오고 한 칸 옆에 답이 표시된다.
//
		
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt(); // 장기판 크기
		
		
		char X = 'X'; // 움직임
		char H = 'H'; // 넘을수 있음, 먹을수있음
		char L = 'L'; // 빈칸
		char Y = 'Y'; // 못움직임, 못넘음
		
		char[][] N =  {{L,L,H,L,L,L,L,L},
					   {L,L,H,L,L,L,L,L},
		               {L,L,Y,L,L,L,L,L},
		               {H,H,X,L,L,L,H,H},
		               {L,L,L,L,L,L,L,L},
		               {L,L,Y,L,L,L,L,L},
		               {L,L,Y,L,L,L,L,L},
		               {L,L,L,L,L,L,L,L}
										};
		
		
		
		
		for(int i =0; i<N.length; i++) {
			

			for(int j =0; j<N[0].length; j++) {
				
//				if(N[j][i]=='L') {
//
//					System.out.print(((char) N[j][i])+" ");
//
//				}else if(N[j][i]=='H') {
//					
//					System.out.print((L = (char)N[j][i])+" ");
//					//L = (char)N[0][i];
//				
//				}else if(N[j][i]=='Y') {
//					
//					System.out.print((Y = (char)N[j][i])+" ");
//				
//				}else if(N[j][i]=='X'){
//					
//					System.out.print((X = (char)N[j][i])+" ");
//					
//				}
				
				System.out.print(N[i][j]+" ");
				

			}
			System.out.println();
			
		}
		
		
		
		
		

	}

}
