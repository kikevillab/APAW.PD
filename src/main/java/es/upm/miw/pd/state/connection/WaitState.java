package es.upm.miw.pd.state.connection;

public class WaitState extends State {
	
	public WaitState(){
		setEstado(Estado.ESPERANDO);
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
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void stop(Context context) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void send(Context context, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void fetch(Context context, int respuesta) {
		context.setState(respuesta == 0 ? new PreparedState() : new CloseState());
	}

}
