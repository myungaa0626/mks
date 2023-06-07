package week3;

import java.util.*;
public class Stock implements Comparable<Stock>{
	private int qty;
	private Item item;
	private Storage storage;
	
	public Stock(int qty, Item item, Storage storage) {
		this.qty = qty;
		this.item = item;
		this.storage = storage;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Item getItem() {
		return item;
	}
	public Storage getStorage() {
		return storage;
	}
	
	@Override
	public int compareTo(Stock s) {
		return item.getName().compareTo(s.getItem().getName());
	}
	@Override
	public String toString() {
		return String.format("%-12s| %-10d| %d", item.getName(), item.getPrice(), qty);
	}
}
