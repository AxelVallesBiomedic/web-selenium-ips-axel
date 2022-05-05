package com.swimming;

public class Rectangle {

	double width;
	double length;
	
	public Rectangle() {}
	
	public Rectangle(double width,double length ) {
		
		this.width = width;
		this.length = length;		
	}

	/// Getter & Setter ///////////////////////////////////////
		public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width<0)
			width = 0;
		this.width = width;		
	}

		public double getLength() {
		return length;
	}

	public void setHeight(double length) {	
		if(length<0)
			length = 0;
		this.length = length;
	}
//////////////////////////////////////////////////////////////
	
	public double getArea()	{
			
		return (width * length);
	}
}