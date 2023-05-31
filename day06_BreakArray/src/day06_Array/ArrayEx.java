package day06_Array;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] a = new int[] {7,3,7,8,1,9,7,10,12,7,33,7};
		
		//1. 해당 출력하기
	
		// for(자료형 변수명: 컬렉션명 또는 배열명) { 반복구문 ; }
		int loop =8;
		
		for(int item: a) {
			
			
			if(loop ==item) break;
			System.out.println(item);
		}
		
		//2. 홀수 인덱스 위치 데이터만 출력
		
		for(int i =0; i<a.length; i++) {
			
			if(i%2==0) continue;
			System.out.println("a["+i+"] = " + a[i]+"\n");
			
		}

	}

}
