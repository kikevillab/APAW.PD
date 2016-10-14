package es.upm.miw.pd.command.calculator;

public class ResetCommand extends Operation implements Comando{
	
	public ResetCommand(Calculator calc){
		super(calc, "reset");
	}

	@Override
	public void execute() {
		getCalculator().reset();		
	}


	
}
