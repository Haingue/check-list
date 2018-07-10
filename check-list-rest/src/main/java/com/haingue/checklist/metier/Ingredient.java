package com.haingue.checklist.metier;

public class Ingredient {
	
	private int id, receipt;
	private String name;
	private float amount;

	public Ingredient() {
		super();
	}
	
	public Ingredient(int id, int receipt, String name, float amount) {
		super();
		this.id = id;
		this.receipt = receipt;
		this.name = name;
		this.amount = amount;
	}

	//-- GUETTERS --//
	public int getId() {
		return id;
	}

	public int getReceipt() {
		return receipt;
	}

	public String getName() {
		return name;
	}

	public float getAmount() {
		return amount;
	}

	//-- SETTERS --//
	public void setId(int id) {
		this.id = id;
	}

	public void setReceipt(int receipt) {
		this.receipt = receipt;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}
