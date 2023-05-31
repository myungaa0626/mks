package day05_random;

public class MainEntry {

	public static void main(String[] args) {
		
//		System.out.println(Math.random());
//		//Math.random() * n <===== 0 ~ n-1 값 추출됨
//		System.out.println(Math.random()*5); // 0~4
//		
//		System.out.println(Math.random()*5+1); // 1~4
//
//		System.out.println((int)Math.random()*5+2);
		
		int random = ((int)(Math.random()*100)+1);
		
		System.out.println(random);
	}

}
