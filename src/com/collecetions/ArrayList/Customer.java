package com.collecetions.ArrayList;

public class Customer {

	private int id;
	private String name;
	private String departName;
	public Customer(int id, String name, String departName) {
		super();
		this.id = id;
		this.name = name;
		this.departName = departName;
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
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", departName=" + departName + "]";
	}
	
	
}
