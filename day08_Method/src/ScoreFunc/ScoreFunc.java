package ScoreFunc;

import java.util.Scanner;

public class ScoreFunc {
	
	
	private static String name;
	private static int kor, eng, com, total;
	private static double avg;
	private static char grade;
	
	
	
	
	public static void input() {
		
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("이름을 입력하시오.");
		name = sc.next();
		System.out.println(name);
		System.out.println("국어 점수 입력: ");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력: ");
		eng = sc.nextInt();
		System.out.println("전산 점수 입력: ");
		com = sc.nextInt();
	}

	public static void output() {
		
		total = kor+eng+com;
		avg= ((double)total/3);

		
		System.out.println("이름: "+name);
		System.out.print("국어: "+kor+"\t\t");
		System.out.print("영어: "+eng+"\t\t");
		System.out.println("전산: "+com+"\t");
		System.out.print("총합: "+(total));
		System.out.printf("\t평균 :%.2f", avg);
	}
	
	
	
	
	
	
	public static void grade() {
		
		switch((int)avg / 10) {
		case 10:
		case 9:
			grade = 'A';break;
		
		case 8:
			grade = 'B';break;
		case 7:
			grade = 'C';break;
		case 5:
			grade = 'D';break;
		
		default:
			grade = 'F';
			break;
		
		}

		System.out.println("\t학점: "+ grade);

	}

	public static void main(String[] args) {
		
		
		input();
		output();
		grade();
	}

}
