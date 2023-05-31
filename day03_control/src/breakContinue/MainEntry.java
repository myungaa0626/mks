package breakContinue;

public class MainEntry {

	public static void main(String[] args) {
		//break, continue	
		
//		for( int i=1; i<11; i++) {
//		
//			if( i == 7 ) continue;   // 1~ 10 에서 7이 없다
//			
//			System.out.println(i);
//		
//		}
		
		for( int i=1; i<11; i++) {
			
			if( i == 7 ) break; // 1에서 11까지 가는데 7전인 6에서 멈춤
			System.out.println(i);
			
		}
		
//		for( int i=1; i<5; i++) {
//			System.out.println("나는 i 다");
//			for(int j =1; j<10; j++) {
//				System.out.println("i = " + i);
//				System.out.println("j = " + j);
//			} // j end
//			System.out.println();
//			
//		}// i end
	}

}
