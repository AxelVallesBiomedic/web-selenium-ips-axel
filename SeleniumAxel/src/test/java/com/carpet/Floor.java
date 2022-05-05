package com.carpet;

public class Floor {

		double width;
		double length;
	
		public Floor(double width,double length ) {
			
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

			public double getlength() {
			return length;
		}

		public void setlength(double length) {	
			if(length<0)
				length = 0;
			this.length = length;
		}
	//////////////////////////////////////////////////////////////
		
		public double getArea()	{
				
			return (width * length);
		}
	}