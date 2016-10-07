package es.upm.miw.pd.composite.expresion;

public class Suma extends Operation{
	
	public Suma(Expresion e1, Expresion e2){
		super(e1, e2, "+");
	}
	
	@Override
	public int operar(){
		return getExpresion1().operar() + getExpresion2().operar();
	}
	
}
