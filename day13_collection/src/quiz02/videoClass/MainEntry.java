package quiz02.videoClass;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		HashMap<Integer, videoClass> map = new HashMap<>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/HH/mm/ss");
		
		while(true) {
			
			System.out.println("1. 비디오 추가, 2. 삭제, 3. 비디오 리스트 출력, 4. 수정, 5. 프로그램 종료");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int key = 0;
			
			switch(num) {
				
				case 1:
					
						System.out.println("추가할 비디오의 제목, 장르, 대여자를 입력하세요.");
						Date date = new Date();
						System.out.println("비디오 제목: ");
						String videoTitle = sc.next();
						System.out.println("비디오 장르: ");
						String videoGenre = sc.next();
						System.out.println("대여자 이름: ");
						String lendName = sc.next();
						
						
						map.put(key++, new videoClass(videoTitle, videoGenre,false, lendName,simpleDateFormat.format(date)));
						
					
						break;
					
				case 2:
						System.out.println("삭제할 비디오의 제목을 입력하세요.");
						System.out.println("비디오 제목? ");
						videoTitle = sc.next();
						
						
						if(map.containsKey(videoTitle)) map.remove(videoTitle);
							
						System.out.println(videoTitle+"가 지워졌습니다.");	
							
						
						
//						for(int i = 0; i<videoClass.size(i);i++) {
//						map.remove(videoClass.get(i));
//						}
			
						break;
				case 3:

						System.out.println("\n"+map);
						
				
						break;
				case 4:
						System.out.println("수정할 비디오의 제목을 입력하세요.");
						videoTitle = sc.next();
//						int num = sc.nextInt();
						
						
						
						
						map.get(videoTitle).setVideoGenre("");
						
						
						
						break;
				
				default:
	
			}
	
		}

	}

}
