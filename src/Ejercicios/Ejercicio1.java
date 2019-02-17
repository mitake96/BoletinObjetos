package Ejercicios;



public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Solicitar un valor al usuario
		
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		System.out.println("Introduce un nombre");
		persona.setNombre(Keyboard1.lecturaString());
		// Que lo introduzca en el atributo nombre y mostrarlo por patalla
		System.out.println(persona.getNombre());
		
		// 1.2 Completar el programa con el funcionamiento de los nuevos métodos
		
		System.out.println("Introduce la edad");
		persona.setEdad(Keyboard1.lecturaInt());
		System.out.println(persona.getEdad());
		System.out.println("Introduce la altura");
		persona.setAltura(Keyboard1.lecturaFloat());
		System.out.println(persona.getAltura());
		System.out.println("Introduce la ocupación");
		persona.setOcupacion(Keyboard1.lecturaString());
		System.out.println(persona.getOcupacion());
		
		// 1.3 Declarar un objeto de tipo Persona utilizando el constructor y mostrar el contenido en pantalla
		
		System.out.println("Persona creada por el apartado 1.3: \n");
	    System.out.printf("Nombre: %s %n",persona2.getNombre());
	    System.out.printf("Edad: %d %n",persona2.getEdad());
	    System.out.printf("Altura: %.2f %n", persona2.getAltura());
	    System.out.printf("Ocupación: %s %n", persona2.getOcupacion());
		
	    // 1.4
	    
	    // 1.5
	    
	    // 1.6 
	    
	    System.out.println("Ingrese el sueldo: ");
	    persona.setSueldo(Keyboard1.lecturaFloat());
	}

	
	
	
	
	
}
