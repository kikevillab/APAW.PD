package es.upm.miw.pd.text;

public class Parrafo extends ConjuntoCaracteres{

	@Override
	public void add(ConjuntoCaracteres c){
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String dibujar(boolean mayus){
		String dibujo = super.dibujar(mayus);
		return dibujo + "\n";
	}
}
