package Ejercicios;

public class Ejercicio4 {
	
	
	public enum Contenido {
		Alto('A'), Medio('M'), Bajo('B');
		private char codigo;
		Contenido(char codigo) {
			this.codigo=codigo;
		}
		public char getCodigo() {
			return codigo;
		}
		
	}
	public class Alimento {
		private String nombre;
		private float lipidos, hidratos, proteinas;
		private boolean origenanimal;
		private Contenido vitaminas;
		private Contenido minerales;
		public Alimento(String nombre) {
			this.nombre=nombre;
			vitaminas=Contenido.Medio;
			minerales=Contenido.Medio;
		}
	}
	
	// Poner getter y setter
	//----------------------------------------
	
	// EsDietetico: retorna true si el alimento contiene menos del 20%
	
	public boolean esDietetico() {
		boolean verdad = false;
		if (lipidos<20&&vitaminas!=Contenido.Bajo) {
			verdad=true;
		}
		return verdad;
	}
	
	public String toString() {
		
		// poner printF con todas las cosas anteriores
		
	}
	
	
	// apartado calculacontenidoenergetico
	
	public float calculaContenidoEnergetico() {
		float energia = 0;
		energia+=9.4*lipidos/100;
		energia+=9.4*proteinas/100;
		energia+=9.4*hidratos/100;
		return energia;
	}

	public boolean esRecomendableParaDeportistas() {
		boolean verdad = false;
				
				//icompleto
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
