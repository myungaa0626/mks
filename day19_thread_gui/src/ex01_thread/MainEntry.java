package ex01_thread;

public class MainEntry {

	public static void main(String[] args) {
		
//		Thread t1 = new Thread("t1");
		
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		t1.setPriority(Thread.MIN_PRIORITY);   // 1   우선순위가 가장 낮음
		t2.setPriority(Thread.NORM_PRIORITY);   // 5
		t3.setPriority(Thread.MAX_PRIORITY);   // 10  숫자가 클수록 우선순위가 높다
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());

		
////		t1.run(); // X
		t1.start(); // run() 메소드 유도한다.
		t2.start();
		t3.start();

	}
}
