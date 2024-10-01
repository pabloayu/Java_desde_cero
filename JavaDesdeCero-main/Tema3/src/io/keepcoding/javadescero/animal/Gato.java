package io.keepcoding.javadescero.animal;

public class Gato 
extends Animal implements Mascota {
	
	// Todos los constructores deben llamar
	// al constructor de la clase padre
	public Gato() {
		super(0L);
	}
	
	@Override
	public void hacerSonido() {
		// acceso a una propiedad protected
		System.out.println(adn);
		System.out.println("Silencio");
	}

	@Override
	public void jugarConElDueño() {
		System.out.println("Ronronear");
	}
}
