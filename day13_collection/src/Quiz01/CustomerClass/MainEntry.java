package Quiz01.CustomerClass;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry { // view & controller
	
	 static Scanner sc = new Scanner(System.in);
	 static ArrayList<customer> customer = new ArrayList<customer>();
	 static String name;
	 static	String address;
	 static	String phoneNum;
		
	static void addCustomer() {
		
		System.out.println("추가할 고객의 이름, 주소, 연락처를 작성하세요.");
		System.out.println("이름: ");
		name = sc.next();
		System.out.println("주소: ");
		String address = sc.next();
		System.out.println("연락처: ");
		String phoneNum = sc.next();
		customer.add(new customer(name,address,phoneNum));
		System.out.println("고객 추가 되었습니다");
		
	}
	static void deleteCustomer() {

		System.out.println("삭제할 고객의 이름을 작성하세요.");
		System.out.println("이름? : ");
		String name = sc.next();
		for(int i = 0; i<customer.size(); i++) {
			if(name.equals(customer.get(i).getName())) {
				customer.remove(i);
				System.out.println("삭제 완료");
			}else
				System.out.println("존재하지 않는 회원입니다.");
		}
	}
	static void customerList() {
		
		System.out.println("고객 리스트를 출력하겠습니다.");
		for(int i =0; i< customer.size(); i++) {
			
			System.out.println(customer.get(i));
		}
	}
	static void customerUpdate() {
		
		System.out.println("수정할 고객의 연락처을 입력하세요");
		phoneNum = sc.next();
		for(int i =0; i<customer.size();i++) {
			if(phoneNum.equals(customer.get(i).getPhoneNum())) {
				System.out.println("수정할 항목 (1. 이름, 2. 주소, 3.연락처");
				int num =sc.nextInt();
				switch(num) {
				case 1:
					System.out.println("이름 입력");
					name = sc.next();
					customer.get(i).setName(name);
					break;
				case 2:	
					System.out.println("주소 입력");
					address = sc.next();
					customer.get(i).setAddress(address);
					break;
				case 3:	
					System.out.println("연락처 입력");
					phoneNum = sc.next();
					customer.get(i).setPhoneNum(phoneNum);
					break;
					
				} // switch end	
			} // if end
			System.out.println("수정 완료");
		} // for end
	}
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("1. 고객추가 2.삭제 3.고객리스트 출력 4.수정 5.프로그램 종료");
			int num = sc.nextInt();
			
			switch(num) {
			
				case 1: addCustomer();
						break;
				case 2: 	
						deleteCustomer();
						break;
				case 3: 
						customerList();
						break;
				case 4: 
						customerUpdate();
						break;
						
				default: System.out.println("프로그램을 종료하겠습니다."); 	
						break;
	
			} // switch end
		}// while end
	}// method end 
}// class end
