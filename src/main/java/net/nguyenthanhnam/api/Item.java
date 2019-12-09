package net.nguyenthanhnam.api;

public class Item {
	int amount;
	String name;
	
	public Item(int amount, String name) {
		super();
		this.amount = amount;
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
