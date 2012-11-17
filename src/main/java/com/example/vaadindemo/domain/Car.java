package com.example.vaadindemo.domain;

public class Car {
	private String make;
	private String model;
	private int yop;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public String toString() {
		return "Marka " + make + " Model " + model;
	}
}
