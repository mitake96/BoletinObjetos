package ejercicio4;

public class Alimento {
	
	private String nombre;
	private float lipidos;
	private float hidratos;
	private float proteinas;
	private boolean animal;
	private Contenido vitaminas;
	private Contenido minerales;
	
	// Costructores
	
	public Alimento (String nombre) {
		this.nombre=nombre;
	}
	
	public Alimento (String nombre, float lipidos, float hidratos, float proteinas, boolean animal, Contenido vitaminas, Contenido minerales) {
		this.nombre=nombre;
		this.lipidos=lipidos;
		this.hidratos=hidratos;
		this.proteinas=proteinas;
		this.animal=animal;
		this.vitaminas=vitaminas;
		this.minerales=minerales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getLipidos() {
		return lipidos;
	}

	public void setLipidos(float lipidos) {
		this.lipidos = lipidos;
	}

	public float getHidratos() {
		return hidratos;
	}

	public void setHidratos(float hidratos) {
		this.hidratos = hidratos;
	}

	public float getProteinas() {
		return proteinas;
	}

	public void setProteinas(float proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isAnimal() {
		return animal;
	}

	public void setAnimal(boolean animal) {
		this.animal = animal;
	}

	public Contenido getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(Contenido vitaminas) {
		this.vitaminas = vitaminas;
	}

	public Contenido getMinerales() {
		return minerales;
	}

	public void setMinerales(Contenido minerales) {
		this.minerales = minerales;
	}
	
	
	// Métodos: 
	
	public boolean esDietetico() {
		return lipidos<0.20*lipidos&&vitaminas!=Contenido.BAJO;
	}
	
	public double calculaContenidoEnergetico() {
		return lipidos*9.4+proteinas*5.3+hidratos*4.1;
	}
	
	public boolean esRecomendableParaDeportistas() {
		return (proteinas>=10&&proteinas<=15) && (lipidos>=30&&lipidos<=35) && (hidratos>=55&&hidratos<=65);
	}
	
	public String toString() {
		return String.format("Nombre: %s%nLípidos: %.2f%nHidratos: %.2f%nProteinas: %.2f%nAnimales: %s%nVitaminas: %s%n.Minerales: %s%nEs Dietético: %s%nContenido energético: %.2f%n¿Es recomendable para deportistas? %s", nombre, lipidos, hidratos, proteinas, animal?"Si lo es":"No lo es", vitaminas, minerales, esDietetico()?"Si lo es":"No lo es", calculaContenidoEnergetico(), esRecomendableParaDeportistas()?"Si lo es":"No lo es");
	}
	
	
	
}
