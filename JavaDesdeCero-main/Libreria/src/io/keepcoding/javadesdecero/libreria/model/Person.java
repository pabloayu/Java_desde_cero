package io.keepcoding.javadesdecero.libreria.model;

/*
 * public -> publico
 * private -> privado
 * Las propiedades son privadas
 * Plain 
 * Old
 * Java
 * Object
 * 
 * getters y setters gestionan el acceso
 * */
public class Person {
	private String name;
	private int age;
	private String address;
	public String samplePublic;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name != null) {
			// Contexto del propio objeto
			this.name = name;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String showInfo() {
		// String interpolation
		return String.format("%s | %d | %s",
				name, age, address);
	}
	
	/* Ejemplo de devolución del resultado de la
	 * asignación
	 
	public boolean setName(String name) {
		if (name != null) {
			name = name;
			return true;
		} else
			return false;
	}*/
}
