package ScoreRankCopy;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreRankCopy {
	
	public static void main(String[] args) {
		// 7명의 성적처리
		// 진승현님
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[7];
		int[][] score= new int[7][3];
		
		
		for(int i = 0; i<7; i++) {
			
			name[i] = "test" + (i+1);
			boolean flag = false;
			
			do {
				if(flag) System.out.println("점수의 범위를 확인하고, \n"
						+name[i] + "의 점수를 '국어 영어 전산' 순으로 다시 입력해주세요 : ");
				flag = false;
				for (int j = 0; j < 3; j++) {
					
					score[i][j] = (int)(Math.random()*60+40);
					if(score[i][j] < 0 || score[i][j] > 100)flag = true;			
				}
			}while(flag);
	
			
		}
		
		int[] sum = new int[7];
		double[] avg = new double[7];
		char[] result = new char[7];
		
		for(int i = 0; i < 7; i++) {
			for (int s : score[i]) sum[i] += s;
			avg[i] = (double)sum[i] / 3;
			
			switch ((int)avg[i] / 10) {
			case 10:
			case 9:
				result[i] = 'A';
				break;
			case 8:
				result[i] = 'B';
				break;
			case 7:
				result[i] = 'C';
				break;
			case 6:
				result[i] = 'D';
				break;
			default:
				result[i] = 'F';
				break;
			}
		}
		
		
		int[] sorted = Arrays.copyOf(sum, sum.length);
		Arrays.sort(sorted);
		int[] rank = new int[7];
		for (int i = 0; i < 7; i++) {
			for(int j = 6; j>=0; j--) 
				if (sum[i] == sorted[j]) {
					rank[i] = 7-j;
					break;
				}	
		}
		
		for(int i = 0; i < 7; i++) {
			System.out.printf("%s님의 성적표***********\n", name[i]);
			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", score[i][0],score[i][1],score[i][2]);
			System.out.printf("총점 : %d, 평균 : %.2f, 평점 %c :,석차 : %d/7\n\n", sum[i],avg[i],result[i],rank[i]);
			
			
		}
	}
}
