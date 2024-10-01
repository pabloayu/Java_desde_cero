package io.keepcoding.javadesdecero.hospital.model;

public class Enfermero extends Auxiliar {

	public Enfermero(String dni, String name, String surname) {
		super(dni, name, surname);
	}
	
	public void suministrarMedicamento() {
		System.out.println("Mover paciente");
	}
}
