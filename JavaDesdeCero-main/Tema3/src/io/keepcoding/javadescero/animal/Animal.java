package io.keepcoding.javadescero.animal;

public abstract class Animal {
	
	protected Long adn;
	
	public Animal(Long adn) {
		this.adn = adn;
	}
	
	public abstract void hacerSonido();
	
	@Override
	public String toString() {
		return "Animal";
	}
}
