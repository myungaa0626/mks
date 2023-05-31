package day07_Array3D;

public class Ex05_Sort {

	public static void main(String[] args) {
		//selection sort (선택 소트)
		
		int[] a = {7, 3, 5, 2, 8};
		int temp;
		
		System.out.println("sort 전 출력");
		for(int i =0; i< a.length; i++) {
			System.out.println(a[i]+"\t");	
		}
		
		for(int i =0; i< a.length; i++) {
			for(int j =i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				} //end if
			}// j end
		}//i end
		
		System.out.println("\n\nsort 후 출력 : ");
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]+"\t");
		}
	
	} // method
} // class

/*
기준이 있다.  
 */
