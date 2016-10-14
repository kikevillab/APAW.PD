package es.upm.miw.pd.command.calculator;

public abstract class Operation {

	private Calculator calculator;
	
	private String name;
	
	protected Operation(Calculator calculator, String name){
		this.calculator = calculator;
		this.name = name;
	}
	
	protected Calculator getCalculator(){
		return calculator;
	}
	
	public String name(){
		return name;
	}
	
}
