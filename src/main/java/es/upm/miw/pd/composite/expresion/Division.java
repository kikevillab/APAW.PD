package es.upm.miw.pd.composite.expresion;

public class Division extends Operation{

	public Division(Expresion e1, Expresion e2){
		super(e1, e2, "/");
	}
	
	@Override
	public int operar(){
		return e1.operar() / e2.operar();
	}
}
