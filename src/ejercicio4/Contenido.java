package ejercicio4;

public enum Contenido {
	
		ALTO('A'),MEDIO('M'),BAJO('B');
		private char codigo;
		
		Contenido (char codigo){
			this.codigo=codigo;
		}
		
		public char getCodigo () {
			return codigo;
	}
		
}
