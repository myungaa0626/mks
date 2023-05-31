package ex04.For;

public class QuizGuGuDan {

	public static void main(String[] args) {
		// 구구단 전체 출력 프로그램 작성
		
		for(int i = 1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				
				
				System.out.print(j+"*"+i +"="+(i*j)+" \t" );
				
			}
			System.out.println();
		}
	
	}

}
