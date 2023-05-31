package bakjoonProblem;
			
import java.util.Scanner;
			
public class appleGame {
			
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int screenSize = sc.nextInt(); // 스크린 크기         5
		int boxSize = sc.nextInt(); // 박스 사이즈            2
		int appleNum = sc.nextInt(); // 떨어지는 사과 개수      3
		
		int leftBox = 1; // 바구니 위치 최소값
		int rightBox = boxSize;
		int step = 0;
		
		for(int i = 0; i<appleNum; i++) {
			int location = sc.nextInt();
			
			if(leftBox<=location && location<=rightBox) {
				continue;
				
			}else if(leftBox>location) {
					step+=leftBox-location;
					leftBox = location;
					
					rightBox = leftBox+(boxSize-1);
				
			}else if(rightBox<location) {
					step+=location-rightBox;
					rightBox = location;
					
					leftBox = rightBox-(boxSize-1);
			}
		}	
			System.out.println(step);
	}	// end main method
} // end class		
