package es.upm.miw.pd.composite.expresion;

public class Numero extends Expresion {

	private int number;
	
	public Numero(int number){
		this.number = number;
	}
	
	public int operar(){
		return number;
	}
	
	public String toString(){
		return ""+number;
	}
}
