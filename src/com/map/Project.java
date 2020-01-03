package com.map;

public class Project {

	private int id;
	private String name;
	private String depname;
	public Project(int id, String name, String depname) {
		super();
		this.id = id;
		this.name = name;
		this.depname = depname;
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
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", depname=" + depname + "]";
	}
	
	
}
