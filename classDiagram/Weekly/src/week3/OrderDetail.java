package week3;

public class OrderDetail {
	private int qty;
	private Item item;
	private Storage storage;
	private double discount;

	public OrderDetail(int qty, Item item, Storage storage) {
		this.qty = qty;
		this.item = item;
		this.storage = storage;
		if (qty < 10) {
			discount = 0;
		}
		else if (qty < 30) {
			discount = 0.1;
		}
		else discount = 0.2;
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
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {		
		return String.format("%-8s| %-8d| %-11.2f| %d", item.getName(), qty, discount*100, (int)(qty*item.getPrice()*(discount + 1))); 
	}
	
}
