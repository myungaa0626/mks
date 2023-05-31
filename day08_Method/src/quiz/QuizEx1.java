package quiz;

public class QuizEx1 {
	public static void main(String[] args) {
		add(30,20);
		message();
		sum(1,2,3,4);
	}
	public static void add(int a, int b) {
		int sum = a+ b;
		System.out.println(sum);
	}
	public static void message() {
		System.out.println("안녕하세요.");
	}
	public static void sum(int i,int j, int k, int l) {
	int sum = i+j+k+l;
	System.out.println(sum);
	}
}
//add(int,int), sub(1,2,3,...) , message(){ 인사말 출력 } 