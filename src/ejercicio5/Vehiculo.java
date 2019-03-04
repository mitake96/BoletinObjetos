package ejercicio5;

public class Vehiculo {

	private String Modelo;
	private double Potencia;
	private boolean cRuedas;
	
	
	public Vehiculo(String Modelo) {
		this.Modelo=Modelo;
	}


	public double getPotencia() {
		return Potencia;
	}


	public void setPotencia(double potencia) {
		Potencia = potencia;
	}


	public boolean iscRuedas() {
		return cRuedas;
	}


	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	public String toString() {
		return String.format("Modelo: %s%nPotencia: %.2f%ncRuedas: %s", Modelo, Potencia, cRuedas?"Si":"No");
	}
}
