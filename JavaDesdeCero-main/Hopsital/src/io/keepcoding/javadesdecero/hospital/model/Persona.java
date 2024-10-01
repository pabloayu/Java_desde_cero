package io.keepcoding.javadesdecero.hospital.model;

public abstract class Persona {
	protected String dni;
	protected String name;
	protected String surname;
	
	public Persona(String dni, String name, String surname) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
