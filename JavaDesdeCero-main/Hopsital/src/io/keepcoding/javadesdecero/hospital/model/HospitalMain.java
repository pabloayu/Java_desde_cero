package io.keepcoding.javadesdecero.hospital.model;

public class HospitalMain {
	
	public static void main(String [] args) {
		Persona p = new Enfermero(
				"12345678",
				"Alejandro",
				"Traver"
				);
		if (p instanceof Enfermero) {
			// casting -> forzado de tipo
			((Enfermero) p).suministrarMedicamento();
		}
		// Esto puede fallar
		// ((Medico) p).suministrarMedicamento();
	}
}
