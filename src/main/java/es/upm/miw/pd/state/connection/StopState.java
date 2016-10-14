package es.upm.miw.pd.state.connection;

public class StopState extends State {
	
	public StopState(){
		setEstado(Estado.PARADO);
	}

	@Override
	public void open(Context context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void close(Context context) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void start(Context context) {
		context.setState(new PreparedState());

	}

	@Override
	public void stop(Context context) {
	}

	@Override
	public void send(Context context, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void fetch(Context context, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
