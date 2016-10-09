package ws.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Comando;
import es.upm.miw.pd.command.calculator.Operation;

public class ComandoDeshacer extends Operation implements Comando{
	
	private CalculadoraMementable calcM;
	
	public ComandoDeshacer(CalculadoraMementable calc){
		super(calc, "deshacer");	
	}

	@Override
	public void execute() {
		
		CalculadoraMementable calc = (CalculadoraMementable) getCalculator();	
		String key = (String) IO.getIO().select(calc.getMementosNames());
		
		calc.applyMemento(calc.getMemento(key));
		
	}

}
