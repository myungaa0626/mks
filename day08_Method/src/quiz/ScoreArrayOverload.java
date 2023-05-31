package quiz;
import java.util.Scanner;
public class ScoreArrayOverload {
		
	

	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		int[][] score = new int[3][3];
		int[]sum = new int[] {0,0,0};
		
		for(int i =0; i<score.length; i++) {
			System.out.print((i+1)+"번째 학생 국어, 영어, 전산 점수를 입력하세요 : ");
			
			for(int j =0; j<score[0].length; j++) {
				score[i][j] = sc.nextInt();
				
				sum[i] += score[i][j];				
			}
		}
		

		for(int i =0; i < sum.length; i++) {
			double avg = sum[i]/ 3.0;
			char grade;
			switch ((int)avg /10) {
			case 10:
			case 9:
				grade= 'A';
				break;
			
			case 8:
				grade= 'B';
				break;
			
			case 7:
				grade= 'C';
				break;
			
			case 6:
				grade= 'D';
				break;
			case 5:case 4:case 3:case 2:case 1:case 0:
				grade='F';
				break;
			default:
				grade=' ';
				System.out.println("잘못된 평균이 산출되었습니다.");
				System.exit(0);
			
			}
			System.out.println(i+1+"번째 학생의 성적표 ********");
			System.out.printf("국어 : %d, 영어: %d, 전산: %d\n",score[i][0],score[i][1],score[i][2]);
			System.out.println("총점 : "+sum[i] + ", 평균 : "+avg+ ", 평점(학점) : "+ grade);		
		}
	}
	
	public static void output() {
		
		
		
	}
	
	public static void total_avg() {
		
		
	}
	
	public static void main(String[] args) {   // main
		
		input();
		output();
		total_avg();
		
	}
}


//Scanner sc = new Scanner(System.in);
//
//int[][] score = new int[3][3];
//int[]sum = new int[] {0,0,0};
//
//for(int i =0; i<score.length; i++) {
//	System.out.print((i+1)+"번째 학생 국어, 영어, 전산 점수를 입력하세요 : ");
//	
//	for(int j =0; j<score[0].length; j++) {
//		score[i][j] = sc.nextInt();
//		
//		sum[i] += score[i][j];				
//	}
//}
//
//for(int i =0; i < sum.length; i++) {
//	double avg = sum[i]/ 3.0;
//	char grade;
//	switch ((int)avg /10) {
//	case 10:
//	case 9:
//		grade= 'A';
//		break;
//	
//	case 8:
//		grade= 'B';
//		break;
//	
//	case 7:
//		grade= 'C';
//		break;
//	
//	case 6:
//		grade= 'D';
//		break;
//	case 5:case 4:case 3:case 2:case 1:case 0:
//		grade='F';
//		break;
//	default:
//		grade=' ';
//		System.out.println("잘못된 평균이 산출되었습니다.");
//		System.exit(0);
//
//	}
//	System.out.println(i+1+"번째 학생의 성적표 ********");
//	System.out.printf("국어 : %d, 영어: %d, 전산: %d\n",score[i][0],score[i][1],score[i][2]);
//	System.out.println("총점 : "+sum[i] + ", 평균 : "+avg+ ", 평점(학점) : "+ grade);		
//
//}