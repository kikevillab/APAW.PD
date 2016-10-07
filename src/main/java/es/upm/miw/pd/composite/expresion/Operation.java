package es.upm.miw.pd.composite.expresion;

public class Operation extends Expresion{

	protected Expresion e1, e2;
	
	protected String operator;
	
	public Operation(Expresion e1, Expresion e2, String operator){
		this.e1 = e1;
		this.e2 = e2;
		this.operator = operator;
	}

	@Override
	public int operar(){
		return 0;
	}

	@Override
	public String toString() {
		return "("+e1.toString()+operator+e2.toString()+")";
	}
	

}
