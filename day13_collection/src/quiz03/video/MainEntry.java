package quiz03.video;

import java.util.Scanner;

public class MainEntry {  // view
	
	public static void main(String[] args) {
			while(true) {
				System.out.print(""
						+ "<1>비디오정보추가 <2>대여정보 출력 <3>대여정보 수정 <4>비디오 삭제 <5>EXIT : ");
				
				switch( new Scanner(System.in).nextInt() ) {
						case 1 :	videoManager.insert(); break;
						case 2 :	videoManager.print();	break;
						case 3 : 	videoManager.modify(); break;
						case 4 :	videoManager.delete(); break;
						case 5 :	System.out.println("See You!!!");
									System.exit(0);  break;
						default: System.out.println("없는 번호 입니다. 선택은 1~5까지 중에서.....");
				} // switch end		
			} // while end
	}
}
