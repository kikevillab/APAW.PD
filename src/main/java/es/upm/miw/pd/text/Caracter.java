package es.upm.miw.pd.text;

public class Caracter extends Componente {
	
	private char caracter;

	public Caracter(char caracter){
		this.caracter = caracter;
	}
	
	@Override
	public String dibujar(boolean mayus){
		if(mayus)
			return (""+caracter).toUpperCase();
		
		return ""+caracter;
	}
	
	public boolean equals(Caracter c){
		if(c == null)
			return false;
		if(getClass() != c.getClass())
			return false;
		if(getClass() == c.getClass())
			return caracter == c.caracter;
		else
			return false;
		
	}
	
}
