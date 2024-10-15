package com.bharat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pizza {
	
	@Id
	@Column(name="code")
	private int Sno;
	@Column(name="category")
	private String Category;
	@Column(name="variant")
	private String Variant;
	@Column(name="size")
	private String Size;
	@Column(name="crust")
	private String Crust;
	@Column(name="price")
	private int Price;
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		this.Sno = sno;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getVariant() {
		return Variant;
	}
	public void setVariant(String variant) {
		Variant = variant;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getCrust() {
		return Crust;
	}
	public void setCrust(String crust) {
		Crust = crust;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Pizza_project [sno=" + Sno + ", Category=" + Category + ", Variant=" + Variant + ", Size=" + Size
				+ ", Crust=" + Crust + ", Price=" + Price + "]";
	}
	
	
}
