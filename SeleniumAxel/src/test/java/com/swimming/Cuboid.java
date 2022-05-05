package com.swimming;

public class Cuboid extends Rectangle {

	double height;
	
	public Cuboid(double width, double length, double height) {
		
		super( width, length);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height < 0)
			height = 0;
		this.height = height;
	}
	
	public double getVolume() {
		return (getArea() * height);
	}	
}