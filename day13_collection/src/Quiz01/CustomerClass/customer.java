package Quiz01.CustomerClass;

import java.util.ArrayList;

public class customer { // model
	
	protected String name;
	protected String address;
	protected String phoneNum;

	//생성자 함수
	public customer(String name, String address, String phoneNum) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "customer [이름= " + name + ", 주소 = " + address + ", 연락처= "+ phoneNum + "]";
	}
}
