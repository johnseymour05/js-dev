package com.seymour.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {

	@Id
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_nm")
	private String itemNm;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemNm) {
		super();
		this.itemId = itemId;
		this.itemNm = itemNm;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}
	
	
}
