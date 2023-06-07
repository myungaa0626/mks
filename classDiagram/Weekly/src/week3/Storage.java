package week3;

import java.util.*;
public class Storage {
	private String name, address, phone;
	private ArrayList<Stock> stock;
	
	public Storage(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		
		stock = new ArrayList<>();
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

	public ArrayList<Stock> getStock() {
		return stock;
	}	
	public void showStocks() {
		StringBuilder sb = new StringBuilder();
		for (Stock s : stock) {
			sb.append(s);
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public int findStock(String name) {
		Collections.sort(stock);
		int ret = -1,
			s = 0,
			e = stock.size() - 1;
				
		while (s <= e) {
			int m = (s + e) / 2;
			Stock curr = stock.get(m);
			if (curr.getItem().getName().compareTo(name) == 0) {
				ret = m;
				break;
			}
			else if (curr.getItem().getName().compareTo(name) < 0) s = m + 1;
			else e = m - 1;
		}
		
		return ret;
	}
	@Override
	public String toString() {
		return String.format("%-12s| %-20s| %s", name, phone, address);
	}
	
}
