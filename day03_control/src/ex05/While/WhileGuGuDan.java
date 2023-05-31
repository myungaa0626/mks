package ex05.While;

public class WhileGuGuDan {

	public static void main(String[] args) {
		
		// 다중 while문 이용해서 구구단 전체 출력
		
		int i = 1; int j = 1;
		
		do{
			i=1;
			do {
				
				//i++;
				System.out.print(j+"*"+i+"="+ j*i+"\t");
				i++;
				
			}while(i<=9);
			
			j++; //증감식
			System.out.println();
			
		}while(j<=9);
		
	}

}
