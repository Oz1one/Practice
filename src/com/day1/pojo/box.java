package com.day1.pojo;

public class box {
	private double length;
	private double width;
	private double height;
	public box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return (length)*(height)*(width);
	}
	public boolean ifSameVolume(box b1, box b2) {
		return b1.length*b1.width*b1.height==b2.length*b2.width*b2.height;
	}
	

}
