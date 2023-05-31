package ex02_runnable;

public class UserRunnable implements Runnable {
	
	String name;
	
	public UserRunnable(String name) {
		
		this.name=name;
	}
	
	
	@Override
	public void run() {
		for(int i =0; i<=10; i++) {
			
			if(i==3) {
				try {
					Thread.sleep(3000); // 1/1000 ==> 1초
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} 
				System.out.println(name);
			} // if end
			System.out.println(i);
		} // for end
		
	}






}
