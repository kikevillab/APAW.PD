package ws.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Comando;
import es.upm.miw.pd.command.calculator.Operation;

public class ComandoDeshacer extends Operation implements Comando{
	
	private CalculadoraMementable calcM;
	
	public ComandoDeshacer(CalculadoraMementable calc){
		super(calc, "deshacer");	
		calcM = calc;
	}

	@Override
	public void execute() {
		
		calcM.setTotal(getCalculator().getTotal());	
		String key = (String) IO.getIO().select(calcM.getMementosNames());
		
		calcM.applyMemento(calcM.getMemento(key));
		getCalculator().reset();
		getCalculator().add(calcM.getTotal());
		
	}

}
