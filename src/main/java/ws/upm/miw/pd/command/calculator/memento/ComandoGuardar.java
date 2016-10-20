package ws.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Comando;
import es.upm.miw.pd.command.calculator.Operation;

public class ComandoGuardar extends Operation implements Comando{
	
	private CalculadoraMementable calcM;
	
	public ComandoGuardar(CalculadoraMementable calc){
		super(calc, "save");
		calcM = calc;
		
	}

	@Override
	public void execute() {
		String name = IO.getIO().readString("Introduzca un identificador para el punto de restauración");
				
		MementoCalculadora memento = new MementoCalculadora(name, getCalculator().getTotal());
		calcM.addMemento(memento);
		
		
	}

}
