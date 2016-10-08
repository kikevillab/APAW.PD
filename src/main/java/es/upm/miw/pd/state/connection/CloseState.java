package es.upm.miw.pd.state.connection;

public class CloseState extends State{
	
	public CloseState(){
		setEstado(Estado.CERRADO);
	}

	@Override
	public void open(Context context) {
		context.setState(new PreparedState());
		
	}

	@Override
	public void close(Context context) {		
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
		 throw new UnsupportedOperationException("Acción no permitida... ");		
	}


	
}
