package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoCaracteres extends Componente{

	private List<Componente> caracteres;
	
	public ConjuntoCaracteres(){
		caracteres = new ArrayList<Componente>();
	}
		
	@Override
	public String dibujar(boolean mayus){
		String dibujo = "";
		for(Componente component : caracteres){
			dibujo += component.dibujar(mayus);
		}
		
		return dibujo;
	}
	
	private void addC(Componente c){
		caracteres.add(c);
	}

	public void add(ConjuntoCaracteres c) {
		this.addC(c);
	}
	
	public void add(Componente component){
		this.addC(component);
	}
}
