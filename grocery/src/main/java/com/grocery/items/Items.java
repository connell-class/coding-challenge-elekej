package com.grocery.items;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.groceryInfoList.GroceryIL;

@Entity
@Table(name = "Item")
public class Items {
	 @Id
	 @Column(name = "ItemID")
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 
	@Column(name = "type") 
	private String ListType;
	
	@OneToOne(mappedBy = "Item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private String ListGroceryIL;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(int id, String listType, String listGroceryIL) {
		super();
		this.id = id;
		ListType = listType;
		ListGroceryIL = listGroceryIL;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListType() {
		return ListType;
	}

	public void setListType(String listType) {
		ListType = listType;
	}

	public String getListGroceryIL() {
		return ListGroceryIL;
	}

	public void setListGroceryIL(String listGroceryIL) {
		ListGroceryIL = listGroceryIL;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", ListType=" + ListType + ", ListGroceryIL=" + ListGroceryIL + "]";
	}

	
}


