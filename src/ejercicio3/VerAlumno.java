package ejercicio3;

import keyboard.Keyboard1;

public class VerAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alumno = new Alumno();
		
		System.out.println("Escribe un nombre: ");
		alumno.setNombre(Keyboard1.lecturaString());
		System.out.println("Matrícula: ");
		alumno.setMatricula(Keyboard1.lecturaInt());
		alumno.ponNota(8,6);
		System.out.println(alumno);
	}

}
