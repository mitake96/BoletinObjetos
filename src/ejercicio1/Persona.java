package Ejercicios;

public class Persona {

	private String nombre;
	private int edad;
	private float altura, sueldo;
	private String ocupacion;
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	// 1.2 Añadir los métodos que faltan para poder consultar y modificar el valor de todos los atributos
	
	int getEdad() {
		return edad;
	}
	void setEdad(int edad) {
		this.edad=edad;
	}
	
	float getAltura() {
		return altura;
	}
	
	void setAltura(float altura) {
		this.altura=altura;
	}
	String getOcupacion() {
		return ocupacion;
	}
	void setOcupacion(String ocupacion) {
		this.ocupacion=ocupacion;
	}
	
	// 1.3 Crear método constructor para asignar valores
	
	public Persona() {
		nombre = "Sin nombre";
		edad = 0;
		altura = 0.0f;
		ocupacion = "Sin ocupación";
	}
	
	// 1.4 Crea un constructor con parámetros que inicialize los atributos del objeto con los valores indicados en los parámetros
	
	
	public Persona(String nombre, int edad, float altura, String ocupacion) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.altura=altura;
		this.ocupacion=ocupacion;
		
	}
	
	public String toString(){
		
		return String.format("Nombre= %s%nEdad= %d%nAltura= %.2f%%nOcupacion= %s", nombre, edad, altura, ocupacion);
		
	}
	
	
	//1.5
	
	
	//1.6 Añade un atributo decimal a la clase Persona
	
	void setSueldo(float sueldo) {
		this.sueldo=sueldo;
	}
	
	void sumarSueldo(Persona persona) {
		
		sueldo += persona.sueldo;
	}
	
	void doblarSueldo(Persona persona) {
		
		sumarSueldo(this);
	}
	
	
	
}
