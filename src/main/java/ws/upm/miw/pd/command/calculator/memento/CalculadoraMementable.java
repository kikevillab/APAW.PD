package ws.upm.miw.pd.command.calculator.memento;

import java.util.HashMap;
import java.util.Map;

import es.upm.miw.pd.command.calculator.Calculator;

public class CalculadoraMementable extends Calculator{

	Map<String, MementoCalculadora> mementos;
	
	public CalculadoraMementable(){
		super();
		mementos = new HashMap<String, MementoCalculadora>();
	}
	
	public void addMemento(MementoCalculadora memento){
		mementos.put(memento.getName(), memento);
	}
	
	public String[] getMementosNames(){
		return this.mementos.keySet().toArray(new String[0]);
	}
	
	public MementoCalculadora getMemento(String name){
		return mementos.get(name);
	}
	
	public void applyMemento(MementoCalculadora memento){
		setTotal(memento.getTotal());
	}
	
	
}
