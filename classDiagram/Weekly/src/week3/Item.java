package week3;

import java.util.*;
public class Item {
	private int num, price;
	private String name;
	private ArrayList<Stock> stock;
	private ArrayList<OrderDetail> orderList;
	
	public Item(int num, String name, int price) {
		super();
		this.num = num;
		this.price = price;
		this.name = name;
		stock = new ArrayList<>();
		orderList = new ArrayList<>();
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public ArrayList<Stock> getStock() {
		return stock;
	}
	public ArrayList<OrderDetail> getOrderList() {
		return orderList;
	}
	
}
