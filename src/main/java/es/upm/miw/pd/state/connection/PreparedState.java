package es.upm.miw.pd.state.connection;

public class PreparedState extends State {
	
	public PreparedState(){
		setEstado(Estado.PREPARADO);
	}

	@Override
	public void open(Context context) {
	}

	@Override
	public void close(Context context) {
		context.setState(new CloseState());
	}

	@Override
	public void start(Context context) {
	}

	@Override
	public void stop(Context context) {
		context.setState(new StopState());

	}

	@Override
	public void send(Context context, String msg) {
		context.setState(new WaitState());

	}

	@Override
	public void fetch(Context context, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
