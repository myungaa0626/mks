package day06_Array;

public class QuizEx1 {

	public static void main(String[] args) {
		// 배열 5개 데이터 선언하고 합을 구하시오.
		
		System.out.println("배열 5개 데이터 선언하고 합을 구하시오. {3,5,8,1,9}");
		int[] a = new int[] {3,5,8,1,9};
		
		
		int sum =0;
		
		for(int i =0; i<a.length; i++ ) {

			sum+= a[i]; // a[i] <<< 배열 i 번째에 있는 수
			
		} // for
		
		System.out.println(sum);
		
		System.out.println("배열에 7이 몇개있는지 찾아라. {7,3,7,8,1,9,7,100,12,7,33,7}");
		// 배열에 7이 몇개있는지 찾아라
		int[] b = new int[] {7,3,7,8,1,9,7,100,12,7,33,7};
		
		int countSeven = 0;
		
		for(int i = 0; i<b.length; i++) {
			if(b[i] == 7 ) { // 배열안에 7과 같은 숫자라면...
				
				countSeven = countSeven + 1; // 7의 갯수를 센다

			}//if
			
		} // for
		
		System.out.println(countSeven); // 세어진 7의 갯수를 출력
		
	} // method
	
}// class







