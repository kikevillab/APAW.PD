package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends Operation implements Comando{

	public PrintCommand(Calculator calc) {
		super(calc, "print");
	}

	@Override
	public void execute() {
		IO.getIO().print(getCalculator().getTotal());
		
	}

	
}
