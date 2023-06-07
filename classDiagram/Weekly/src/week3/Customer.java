package week3;

import java.util.*;
public class Customer implements Comparable<Customer> {
	protected int num;
	protected String name, address, phone;
	protected ArrayList<Order> orderList;
	
	public Customer(int num, String name, String address, String phone) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.phone = phone;
		orderList = new ArrayList<>();
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getNum() {
		return num;
	}

	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	@Override
	public String toString() {
		return String.format("%-8d| %-12s| %-20s| %s", num, name, phone, address);
	}
	
	public int compareTo(Customer c) {
		return Integer.compare(num, c.num);
	}
}
	