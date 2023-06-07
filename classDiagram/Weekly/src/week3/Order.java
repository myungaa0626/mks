package week3;

import java.util.*;
public class Order implements Comparable<Order>{
	private int orderNum, customerNum;
	private Date orderDate;
	private ArrayList<OrderDetail> orderDetailList;
	
	public Order(int orderNum, int customerNum, Date orderDate) {
		this.orderNum = orderNum;
		this.customerNum = customerNum;
		this.orderDate = orderDate;
		orderDetailList = new ArrayList<>();
	}

	public int getOrderNum() {
		return orderNum;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public ArrayList<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}
	
	public int compareTo(Order o) {
		return Integer.compare(orderNum, o.orderNum);
	}

	public void showDetail() {
		StringBuilder sb = new StringBuilder();
		sb.append("주문 목록");
		for (OrderDetail od : orderDetailList) {
			sb.append(od);
			sb.append("\n");
		}
		System.out.print(sb);
	}
	@Override
	public String toString() {
		return String.format("%-10d| %-10d| %s", orderNum, customerNum, orderDate.toGMTString());
	}
	
}
