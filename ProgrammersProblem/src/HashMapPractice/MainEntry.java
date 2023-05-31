package HashMapPractice;

import java.util.HashMap;
import java.util.Scanner;

public class MainEntry {
	
	
	
	public static void main(String[] args) {
		
			HashMap<Integer, Video> video = new HashMap<>();
			
			
			String videoTitle;
			String videoGenre;
					
			int key = 0;
			
			while(true) {

				System.out.println("1. 비디오 추가 2. 비디오 삭제 3. 비디오 수정 4. 리스트 출력 5. 프로그램 종료");
				
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				
				switch(num) {
				
				
				case 1:// 1. 비디오 추가
					System.out.println("비디오 제목, 장르를 입력해주세요.");
					System.out.println("비디오 제목은?");
					
					video.put(key++, new Video(videoTitle, videoGenre,lend, lendName, date));
					
					
				
				
				case 2:	// 2. 비디오 삭제
					
					
					
				case 3: // 3. 비디오 수정
					
					
					
				case 4: // 4. 비디오 출력
					
					
				
				default: // 5. 프로그램 종료 

				
				}
				
	
				
			}
		

		
	} // method end
	
	
} // class end
