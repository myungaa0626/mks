package ex05.While;

public class DoWhileMain {

	public static void main(String[] args) {
		
//		int a = 1;
//		
//		do {
//			//a++;
//			System.out.println(a);
//			a++;
//			
//		}while(a<11); // 문장 종결

		int a = 1, b = 1;
		do {
			b=1; // 다중 while, do~while 문에서는 안쪽에 있는 변수의 초기화
			do {
				System.out.println(b+ "\t");
				b++; // 증감식
			}while(b <= 3); //조건
			
			//b=1;
			a++; //증감식
			System.out.println();
			
		}while(a <=2); //조건, 문장종결기호
		
		
	}

}
