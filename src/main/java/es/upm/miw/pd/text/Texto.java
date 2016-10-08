package es.upm.miw.pd.text;

public class Texto extends ConjuntoCaracteres{

	@Override
	public String dibujar(boolean mayus){
		String dibujo = super.dibujar(mayus);
		return dibujo + "---o---\n";
	}
}
