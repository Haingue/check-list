package com.haingue.checklist.metier;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
	
	private int id;
	private String name;
	private User creator;
	private List<Ingredient> ingredients;
	
	public Receipt() {
		super();
	}

	public Receipt(int id, String name, User creator, List<Ingredient> ingredients) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.ingredients = ingredients;
	}

	public Receipt(int id, String name, User creator) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.ingredients = new ArrayList<Ingredient>();
	}
	
	

}
