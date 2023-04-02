package trdung.model;


public class cartItem {
	private int prdid;
	private String name;
	private double price;
	private int qty;
	public cartItem() {
	}
	public cartItem(int prdid, String name, double price, int qty) {
		this.prdid = prdid;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public int getPrdid() {
		return prdid;
	}
	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "cartItem [prdid=" + prdid + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}

	
	
}
