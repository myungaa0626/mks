package day06_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreArraySortRank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//				// ArraySortTest 에 스캐너를 추가한 업그레이드 버젼
//				//스캐너를 이용하여 배열을 생성후 입력 된 배열의 오름차순, 내림차순 출력
//				
//				Scanner sc = new Scanner(System.in);
//				// 1. 배열생성
//				System.out.println("입력할 정수 개수 입력");
//				int n = sc.nextInt();
//				int[] arr = new int[n];
//				
//				System.out.println("sort 할 정수 " + n + "개 입력");
//				for(int i =0; i< arr.length; i++) {
//					arr[i] = sc.nextInt();		
//				}
//
//				Arrays.sort(arr);
//
//				System.out.println("\n\n오름차순 sort 후 출력 : ");
//				for(int i =0; i<arr.length; i++) {
//					System.out.print(arr[i]+"\t");
//				}
//				
//				System.out.println("\n\n내림차순 sort 후 출력 : ");
//				for(int i =arr.length-1; i>=0; i--) {
//					System.out.print(arr[i]+"\t");
//				}
		
	      String[] name = new String[7]; // 이름
	      int[][] score; // 국,영,수,총합
	      double[] avg; // 평균
	      char[] grade; // 학점
	     
 
	      System.out.print("학생 수? : ");
	      int n = sc.nextInt(); // 학생 수
	      int[] rank = new int[n]; // 등수  <<<< 입력된 학생수 만큼 1등에서 n등까지 배열 생성?
	      
	      name = new String[n];
	      score = new int[n][4];
	      avg = new double[n];
	      grade = new char[n];
	      rank = new int[n]; //등수
	      
	      // 연산
	      for(int i=0;i<n;i++) {
	         System.out.println();
	         System.out.print("이름 : ");
	         name[i] = sc.next();
	         for(int j=0;j<score[i].length-1;j++) {
	            System.out.print("점수" + (j+1) + " : ");
	            score[i][j] = sc.nextInt(); // 국,영,수 입력
	            score[i][3] += score[i][j]; // 국영수 합계   총점
	         }
	         avg[i] = score[i][3]/3.0; // 석차를 구할수 있는 평균 점수 << 이걸 이용해서 석차를 구한다
	         
	         
	         switch((int)avg[i]/10) {
	         case 10 : case 9 :
	            grade[i] = 'A'; break;
	         case 8 : 
	            grade[i] = 'B'; break;
	         case 7 : 
	            grade[i] = 'C'; break;
	         case 6 : 
	            grade[i] = 'D'; break;
	         case 5 :
	            grade[i] = 'E'; break;
	         default : 
	            grade[i] = 'F'; break;
	         }
	      }
	      sc.close();
	      
	      
	      System.out.println();
	      System.out.println("===========출력=============");
	      //출력
	      for(int i = 0;i<n;i++) {
	         System.out.println("이름 : " + name[i]);
	         System.out.print("국어 : " + score[i][0]+"\t");
	         System.out.print("영어 : " + score[i][1]+"\t");
	         System.out.print("수학 : " + score[i][2]+"\t");
	         System.out.println("합계 : " + score[i][3]);
	         System.out.printf("평균 : %.2f\t", avg[i]);
	         System.out.print("학점 : " + grade[i]);
	         System.out.println();
	      }
	      
	// 출력 결과 + 석차(등수)
//	      int[] a = {7, 3, 5, 2, 8};
//			
//			System.out.println("sort 전 출력");
//			for(int i =0; i< a.length; i++) {
//				System.out.println(a[i]+"\t");	
//			}
//			Arrays.sort(a);
//			System.out.println(a);
//			
//			System.out.println("\n\n오름차순 sort 후 출력 : ");   //a.length 를 
//			for(int i =0; i<a.length; i++) {
//				System.out.println(a[i]+"\t");
//			}
//			
//			System.out.println("\n\n내림차순 sort 후 출력 : ");
//			for(int i =a.length-1; i>=0; i--) {
//				System.out.println(a[i]+"\t");
//			}
	}
}
