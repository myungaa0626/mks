package day07_Array3D;

public class BubbleSort {

	public static void main(String[] args) {
		
		//Bubble sort (버블 소트)
		
		int[] a = {7, 3, 5, 2, 8};
		int temp;
		
		System.out.println("sort 전 출력");
		for(int i =0; i< a.length; i++) {
			System.out.println(a[i]+"\t");	
		}
		
		//sort
		for(int i =0; i<a.length; i++) { // 4
			for(int j =0; j<a.length-i-1; j++) { // 4-i-1
				
		
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				
				}
			}// j end
		}// i end
		
		
		System.out.println("\n\nsort 후 출력 : ");
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]+"\t");
		}
		

	}

}
