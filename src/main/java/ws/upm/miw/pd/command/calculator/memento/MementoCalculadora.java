package ws.upm.miw.pd.command.calculator.memento;

public class MementoCalculadora {

	private int total;
	private String name;
	
	public MementoCalculadora(String name, int total){
		this.total = total;
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public String toString(){
		return name;
	}
	
	public String getName(){
		return name;
	}
	
	
}
