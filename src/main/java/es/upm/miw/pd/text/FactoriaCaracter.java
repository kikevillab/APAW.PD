package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

	private static FactoriaCaracter factory;
	
	private Map<Character, Caracter> caracterList;
	
	private FactoriaCaracter(){
		caracterList = new HashMap<Character, Caracter>();
	}
	
	public static FactoriaCaracter getFactoria(){
		if(factory == null)
			factory = new FactoriaCaracter();
		
		return factory;
	}
	
	public Caracter get(char caracter){
		if(!caracterList.containsKey(caracter))
			caracterList.put(caracter, new Caracter(caracter));
		
		return caracterList.get(caracter);
	}
}
