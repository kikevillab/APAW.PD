package es.upm.miw.pd.state.connection;

public abstract class State {
	
	private Estado estado;
	
	public abstract void open(Context context);
	
	public abstract void close(Context context);
	
	public abstract void start(Context context);
	
	public abstract void stop(Context context);
	
	public abstract void send(Context context, String msg);
	
	public abstract void fetch(Context context, int respuesta);
	
	public Estado getEstado(){
		return estado;
	}
	
	protected void setEstado(Estado estado){
		this.estado = estado;
	}
	
	
	
}
