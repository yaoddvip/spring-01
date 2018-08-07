package com.mr.model;

import java.util.Set;

public class Car {

	private Integer id;
	private String name;
	private Set<String> functions;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getFunctions() {
		return functions;
	}
	public void setFunctions(Set<String> functions) {
		this.functions = functions;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", functions=" + functions + "]";
	}
	
}
