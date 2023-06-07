package week3;

import java.util.*;
import java.io.*;
public class OrderCreaterUI {
	private ArrayList<Order> orderList;
	
	private ArrayList<Item> itemList;
	private ArrayList<Storage> storageList;
	private ArrayList<Customer> customerList;
	private	boolean isEdited;
	
	public OrderCreaterUI() {
		orderList = new ArrayList<>();
		
		itemList = new ArrayList<>();
		storageList = new ArrayList<>();
		customerList = new ArrayList<>();
		isEdited = false;
	}

	
	public ArrayList<Order> getOrderList() {
		return orderList;
	}
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public ArrayList<Storage> getStorageList() {
		return storageList;
	}
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	
	public int findOrder(int orderNum) {
		if (isEdited) {
			Collections.sort(orderList);
			isEdited = false;
		}
		
		int ret = -1,
			s = 0,
			e = orderList.size() - 1;
		
		while (s <= e) {
			int m = (s + e) / 2;
			Order curr = orderList.get(m);
			if (curr.getOrderNum() == orderNum) {
				ret = m;
				break;
			}
			else if (curr.getOrderNum() < orderNum) s = m + 1;
			else e = m - 1;
		}
		
		return ret;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Order o : orderList) {
			sb.append(o);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
	
	public void showCustomers() {
		System.out.println();
		System.out.println(String.format("%-6s| %-10s| %-16s| %s", "번호", "이름", "전화번호", "주소"));
		System.out.println("-----------------------------------------------------------------------------");
		for (Customer c : customerList)
			System.out.println(c);
		System.out.println();
	}
	public void addCustomer(int num, String name, String address, String phone) {
		customerList.add(new Customer(num, name, address, phone));
	}
	public void showVip() {
		System.out.println();
		System.out.println(String.format("%-6s| %-6s| %-10s| %-16s| %s","고객번호", "번호", "이름", "전화번호", "주소"));
		System.out.println("-----------------------------------------------------------------------------");
		for (Customer c : customerList) {
			if (c instanceof Vip) 
				System.out.println(((Vip) c).vipInfo());
		}
		System.out.println();
	}
	public void addVip(int customerNum, int vipNum, String name, String address, String phone) {
		customerList.add(new Vip(customerNum, vipNum, name, address, phone));
	}
	public void showStorages() {
		System.out.println();
		System.out.println(String.format("%-6s| %-10s| %-16s| %s", "번호", "이름", "전화번호", "주소"));
		System.out.println("-----------------------------------------------------------------------------");
		int idx = 0;
		for (Storage storage : storageList) {
			System.out.printf("%-8d| ", idx++);
			System.out.println(storage);
		}
		System.out.println();
	}
	public void addStorage(String name, String address, String phone) {
		storageList.add(new Storage(name, address, phone));
	}
	public void showItems(int storageIdx) {
		System.out.println();
		System.out.println(String.format("%-10s| %-8s| %s", "상품", "가격", "수량"));
		System.out.println("-----------------------------------------------------------------------------");
		for (Stock stock : storageList.get(storageIdx).getStock()) {
			System.out.println(stock);
		}
		System.out.println();
	}
	public void addItem(int itemNum, int storageIdx, String name, int price, int qty) {
		int stockIdx = storageList.get(storageIdx).findStock(name);
		if (stockIdx == -1) {
			Item i = new Item(itemNum, name, price);
			itemList.add(i);
			Stock stock = new Stock(qty, i, storageList.get(storageIdx));
			i.getStock().add(stock);
			storageList.get(storageIdx).getStock().add(stock);
		}
		else {
			Stock stock = storageList.get(storageIdx).getStock().get(stockIdx);
			stock.setQty(stock.getQty() + qty);
		}
	}
	public void showOrder() {
		System.out.println();
		System.out.println(String.format("%-6s| %-6s| %s", "주문번호", "고객번호", "주문날짜"));
		System.out.println("-----------------------------------------------------------------------------");
		for (Order o : orderList) {
			System.out.println(o);
		}
		System.out.println();
	}
	public boolean inputOrder(int orderNum, int customerNum) {
		// 마지막으로 추가한 주문의 index 반환
		if (customerNum >= customerList.size()) {
			System.out.println("없는 고객입니다");
			return false;
		}
		
		orderList.add(new Order(orderNum, customerNum, new Date()));
		isEdited = true;
		return true;
	}
	public void enrollOrder(int storageIdx) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Order order = orderList.get(orderList.size() - 1);
		while (true) {
			showItems(storageIdx);
			System.out.println("상품이름 수량 순서로 입력해주세요 (n 입력시 종료)");
			String str = br.readLine();
			if (str.toLowerCase().equals("n")) break;
			
			st = new StringTokenizer(str);
			String inputName = st.nextToken();
			int qty = Integer.parseInt(st.nextToken());
			int stockIdx = storageList.get(storageIdx).findStock(inputName);
			if (stockIdx == -1) {
				System.out.println("없는 상품입니다");
				continue;
			}
			Stock stock = storageList.get(storageIdx).getStock().get(stockIdx);
			
			if (stock.getQty() < qty) {
				System.out.println("수량이 부족합니다");
				continue;
			}
			stock.setQty(stock.getQty() - qty);
			order.getOrderDetailList().add(new OrderDetail(qty, stock.getItem(), stock.getStorage()));
		}
	}
	public void cancelOrder(int orderNum) {
		int idx = findOrder(orderNum);
		if (idx == -1) {
			System.out.println("없는 주문 번호입니다");
			return;
		}
		for (OrderDetail od : orderList.get(idx).getOrderDetailList()) {
			int stockIdx = od.getStorage().findStock(od.getItem().getName());
			Stock stock = od.getStorage().getStock().get(stockIdx);
			stock.setQty(stock.getQty() + od.getQty());
		}
		isEdited = true;
		orderList.remove(idx);
	}
	public void showOrderDetails(int orderNum) {
		int idx;
		if ((idx = findOrder(orderNum)) == -1) {
			System.out.println("잘못된 번호입니다");
			return;
		}
		
		System.out.println();
		System.out.println(String.format("%-6s| %-6s| %-8s| %s", "상품", "수량", "할인율", "총액"));
		System.out.println("-----------------------------------------------------------------------------");
		for (OrderDetail od : orderList.get(idx).getOrderDetailList()) {
			System.out.println(od);
		}
		System.out.println();
	}
}
