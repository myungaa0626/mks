package ex04.For;

public class QuizEx1 {

	public static void main(String[] args) {
		//문제2] 1~ 100까지 3의 배수의 합과 개수를 구하는 프로그램 작성
		
		int tot = 0;
		int count = 0;
		for(int i=1; 100>=i; i++) {
				
			if(i%3 == 0) {
				
				tot+=i;
				
				count+=1;

			}

		}
		
		System.out.println(tot);
		System.out.println(count);

	}

}
