package io.keepcoding.javadesdecero.hospital.model;

public class Auxiliar extends Persona {

	public Auxiliar(String dni, String name, String surname) {
		super(dni, name, surname);
	}
	
	public void moverPaciente() {
		System.out.println("Mover paciente");
	}
}
