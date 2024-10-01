package io.keepcoding.javadesdecero.hospital.model;

public class Medico extends Enfermero {

	public Medico(String dni, String name, String surname) {
		super(dni, name, surname);
	}
	
	public void prescribirMedicamento() {
		System.out.println("Mover paciente");
	}
}
