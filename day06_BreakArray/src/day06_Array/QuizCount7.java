package day06_Array;

public class QuizCount7 {

	public static void main(String[] args) {
		
		int[] arr = {1,7,3,7,99,7,8,55,7,90,7};
		int seek =7, count =0;
		
		
		for(int i=0; i<arr.length; i++) {
			if(seek==arr[i])count++; 
			
		}
		System.out.println("{1, 7, 3, 7, 99, 7, 8 ,55, 7, 90, 7}에서 7의 개수 : "+count+"\n");
		System.out.println(count);
		
		
		//해당 데이터 있는 위치(인덱스)는?
		System.out.println("\n\n위치(인덱스) : ");
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==7)System.out.print(i+1+"\t");
		}
			
		
		
		
		

	}

}
