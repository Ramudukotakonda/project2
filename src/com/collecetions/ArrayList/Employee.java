package com.collecetions.ArrayList;

public class Employee {

	private int id;
	private String name;
	private String Deport;
	
	public Employee(int id, String name, String deport) {
		super();
		this.id = id;
		this.name = name;
		Deport = deport;
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
	
	
	
	public String getDeport() {
		return Deport;
	}
	public void setDeport(String deport) {
		Deport = deport;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Deport=" + Deport + "]";
	}
	
	
	
}
