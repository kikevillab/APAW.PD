package es.upm.miw.pd.state.connection;

public class Context {

	private State state;
	
	private Link link;
	
	public Context(Link link){
		this.link = link;
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public Estado getEstado(){
		return state.getEstado();
	}
	
	public void open(){
		state.open(this);
	}
	
	public void close(){
		state.close(this);
	}
	
	public void start(){
		state.start(this);
	}
	
	public void stop(){
		state.stop(this);
	}
	
	public void send(String msg){
		link.enviar(msg);
		state.send(this, msg);
	}
	
	public void fetch(int respuesta){
		state.fetch(this, respuesta);
	}
}
