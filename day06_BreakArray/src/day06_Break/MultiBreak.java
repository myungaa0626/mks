package day06_Break;

public class MultiBreak {

	public static void main(String[] args) {
		
		
		boolean flag = true;
		
		first:{
			
			second:{	
				
				third:{
					
					int k = 100;
					System.out.println("Before the break");  // 1
					
					if(flag) break second; // break 식별자; 식별자 위치까지 탈출
					
					System.out.println("This won't execute"); // 2
					
				} //end third
				
				System.out.println("대보반 홧팅!!!"); // 3
				
			} //second
			System.out.println("This is after second break"); // 4
		}// first
		System.out.println("1234556"); // 5
	}

}


/*
 *  식별자 1: {
 * 		식별자 2:{
 * 
 * 
 * 			break 식별자1; // 가까운 식별자만 빠져나옴. 지금은 식별자 2를 나옴
 * 
 *      }
 *  }
 * 
 */

