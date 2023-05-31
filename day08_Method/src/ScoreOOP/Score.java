package ScoreOOP;

import java.util.Scanner;

public class Score {
	
	private static String name;
	private static int kor, eng, com, total;
	private static double avg;
	private static char grade;
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Score.name = name;
	}
	public static int getKor() {
		return kor;
	}
	public static void setKor(int kor) {
		Score.kor = kor;
	}
	public static int getEng() {
		return eng;
	}
	public static void setEng(int eng) {
		Score.eng = eng;
	}
	public static int getCom() {
		return com;
	}
	public static void setCom(int com) {
		Score.com = com;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Score.total = total;
	}
	public static double getAvg() {
		return avg;
	}
	public static void setAvg(double avg) {
		Score.avg = avg;
	}
	public static char getGrade() {
		return grade;
	}
	public static void setGrade(char grade) {
		Score.grade = grade;
	}
	
	public void input() {
		
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

	public void output() {
		
		total = kor+eng+com;
		avg= ((double)total/3);

		System.out.println("이름: "+name);
		System.out.print("국어: "+kor+"\t\t");
		System.out.print("영어: "+eng+"\t\t");
		System.out.println("전산: "+com+"\t");
		System.out.print("총합: "+(total)+"\t");
		System.out.printf("\t평균 :%.2f", avg);
	}
	
	public void grade() {
		
		switch((int)avg / 10) {
		case 10:
		case 9:
			grade = 'A';break;
		
		case 8:
			grade = 'B';break;
		case 7:
			grade = 'C';break;
		case 6:
			grade = 'C';break;
			
		case 5:
			grade = 'D';break;
		
		default:
			grade = 'F';
			break;
		
		}

		System.out.println("\t학점: "+ grade);

	}
	
	
	
	
	
}
