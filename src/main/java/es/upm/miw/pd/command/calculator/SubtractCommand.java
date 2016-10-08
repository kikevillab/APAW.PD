package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends Operation implements Comando {

	public SubtractCommand(Calculator calc){
		super(calc, "subtract");
	}

	@Override
	public void execute() {
		int valor = IO.getIO().readInt("introduzca el valor a restar");			
		getCalculator().subtract(valor);		
	}

}
