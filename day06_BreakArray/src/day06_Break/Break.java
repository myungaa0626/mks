package day06_Break;

public class Break {

	public static void main(String[] args) {
		for(int i=1; i<11; i++) {
			
			if (i ==7 ) continue; //시작점으로 돌린다. for -> 증감식으로, while/do~while-> 조건식으로 이동
			System.out.println(i);

		}
		
		for(int i =1; 101>i; i++) {
			if(i%2==0) continue; //continue가 없으면  짝수가 나오고 있으면 홀수가 나옴
				System.out.println(i+"\t");
		}
		

	}

}
