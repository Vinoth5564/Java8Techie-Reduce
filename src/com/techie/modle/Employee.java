package com.techie.modle;

public class Employee {

	private int id;
	private double sal ;
	private String avg;
	private String name;
	public Employee(int id, double sal, String avg, String name) {
		super();
		this.id = id;
		this.sal = sal;
		this.avg = avg;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getAvg() {
		return avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", avg=" + avg + ", name=" + name + "]";
	}
	
	
	
}
