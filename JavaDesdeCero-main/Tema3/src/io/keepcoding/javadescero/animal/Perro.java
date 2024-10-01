package io.keepcoding.javadescero.animal;

public class Perro extends Animal {

	public Perro() {
		this(1L);
	}
	
	public Perro(Long adn) {
		super(adn);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Ladrar");
	}
}
