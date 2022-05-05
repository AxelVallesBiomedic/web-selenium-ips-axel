package com.carpet;

public class Carpet {

		double cost;
		
		public Carpet(double cost) {	
			this.cost = cost;		
		}

		/// Getter & Setter ///////////////////////////////////////		
		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			if(cost < 0)
				cost = 0;
			this.cost = cost;
		}
		//////////////////////////////////////////////////////////////	
	}