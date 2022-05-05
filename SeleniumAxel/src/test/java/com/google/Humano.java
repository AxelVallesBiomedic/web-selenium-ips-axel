package com.google;

public class Humano {
		 
		// Classes
	 
		/*
		 * Modifiers
		 * Class keyword
		 * class name
		 * Superclasses (if any)
		 * interfaces (if any)
		 * body
		 */
	 
		// OBJETOS
	 
		/*
		 * State: Atributos
		 * Behavior: representado por los metodos
		 * identity
		 */
	 
		int numOjos, numManos, numPiernas;
		String colorOjos, colorCabello;
		double altura;
	 
		// Constructor default
		public Humano() {
	 
		}
	 
		// Constructor
		public Humano(int numOjos, int numManos, int numPiernas, String colorOjos, String colorCabello, double altura) {
			this.numOjos = numOjos;
			this.numManos = numManos;
			this.numPiernas = numPiernas;
			this.colorOjos = colorOjos;
			this.colorCabello = colorCabello;
			this.altura = altura;
		}
	 
		public Humano(String colorOjos, String colorCabello, double altura) {
			this.numOjos = 2;
			this.numManos = 2;
			this.numPiernas = 2;
			this.colorOjos = colorOjos;
			this.colorCabello = colorCabello;
			this.altura = altura;
		}
}