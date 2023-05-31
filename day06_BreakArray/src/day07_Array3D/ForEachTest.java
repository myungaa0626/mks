package day07_Array3D;

public class ForEachTest {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,100,88,99};
		
		// for (자료형 변수명 : 컬렉션명 또는 배열명) {
		System.out.println("오름차순 출력");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+"\t");
			if(i==3)break;
		}
		
		
		System.out.println("==============================");
		System.out.println("내림차순");
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]+"\t");
			
			
		}

		System.out.println();
		for (int item : a) {
			System.out.println(item);
			
		}
	}

}
