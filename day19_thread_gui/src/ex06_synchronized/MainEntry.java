package ex06_synchronized;
import java.util.Iterator;
class Atm {
	private int money;
	public Atm(int money) { // 생성자함수
		this.money = money;
	}
	// 입금함수
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액 "+amount);	
	}
	// 출금함수
	public void withdraw(int amount, String name) {
			synchronized (this){
				if((money - amount)>0) {
					
					
					Thread.yield(); //
					
					
					money -= amount;
					System.out.println(name + " : 출금금액 "+amount);
					
				}else {
					System.out.println(name +" : 출금못함 (잔액 부족~~~) ");
				
				}
		}
	}
	
	

	//통장 잔고 함수
	public void getMoney() {
		System.out.println("                      잔액은 : "+ money);
	}	
}// Atm end
class UserAtm extends Thread {
	Atm obj;
	boolean flag;
	public UserAtm(Atm obj, String name) {
		super(name); // super는 부모의 인스턴스를 호출
		this.obj = obj;
		this.flag =flag;
	}
	@Override
	public void run() { // 스레드 실행부 (구현부)
		for (int i = 0; i < 2; i++) {
			try {sleep(50);} catch (InterruptedException e) {e.printStackTrace(); }
			if(flag) {
				obj.deposit((int)(Math.random()*10+2)*100, getName());
			}else {
				obj.withdraw((int)(Math.random()*10+2)*100, getName());
			} // if end
			flag =true;
			obj.getMoney();
		}// for end
	}// run() end	
}// UserAtm end

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "박정희");
		UserAtm user2 = new UserAtm(at, "전두환");
		UserAtm user3 = new UserAtm(at, "노태우");
		user1.start();
		user2.start();
		user3.start();
	}

}











