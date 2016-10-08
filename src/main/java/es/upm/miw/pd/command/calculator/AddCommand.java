package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand extends Operation implements Comando{
	
	public AddCommand(Calculator calc){
		super(calc, "add");
	}

	@Override
	public void execute() {
		int valor = IO.getIO().readInt("introduzca el valor a sumar");			
		getCalculator().add(valor);		
	}

}
