package com.example.groceryInfoList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.grocery.items.Items;

@Entity
@Table(name = "Grocery stuff")
public class GroceryIL {
	
	@Id
	 @Column(name = "groceryId")
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	 @Column(name = "groceryName")
	private String name;

//	
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="Items")
	private Items item;

	public GroceryIL() {
		super();
	}

	public GroceryIL(int id, String name, Items item) {
		super();
		this.id = id;
		this.name = name;

		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "GroceryIL [id=" + id + ", name=" + name + ",  item=" + item + "]";
	}
	
	
	
	
	 
    
	
}
