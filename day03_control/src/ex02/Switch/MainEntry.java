//*

package ex02.Switch;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		System.out.println("도시를 선택하세요(s,d,b,j) = ");
		Scanner sc = new Scanner(System.in);
		
//		String str = "korea";
//		char ch = sc.next().charAt(0);
//		System.out.println(ch);
//		String ch = sc.next(); //문자열 입력받기
		
		char ch = sc.next().charAt(0);
		
//		char op =ch.charAt(0); // 문자열 함수 중에 문자열에서 charAt(index)
		//인덱스번호 문자 가져오는 함수
		
		switch( ch ) {
			case 's' : System.out.print("서울"); break;
			case 'd' : System.out.print("대구"); break;
			case 'b' : System.out.print("부산"); break;
			case 'j' : System.out.print("제주"); break;
			
			default:
				System.out.println("잘못 눌렀습니다. (s,d,b,j)중에서만 선택하세요....");
				System.exit(0); // 프로그램 강제 종료
		}// switch end
		
		System.out.println("를(을) 선택하셨습니다.");

	}

}
//*
/*

package ex02.Switch;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		System.out.println("point = ? (1,2,3) ");
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {  //long형 제외한 정수형, 문자형 올 수 있다.
			case 1:     // 값 - 숫자, '문자', "문자열"
				System.out.println("포인트 점수 1점 입니다.");
				break;
				
			case 2: 	
				System.out.println("포인트 점수 2점 입니다.");
				break;
			case 3:
				System.out.println("포인트 점수 3점 입니다.");
				break;
				
			default: // 생략가능함 - 에러처리 메세지
				System.out.println("없는 포인트 넣으셨네요. 1,2,3중에서 선택하세요.");
		
		
		} // switch end
		
		System.out.println("main end!!");
		
		
		

	}

}
*/