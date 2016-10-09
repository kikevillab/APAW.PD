package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberManagerTest {
	
	NaturalNumberCreator creator;
	
	NaturalNumber number;
	

	@Test
	public void testCreateNaturalNumberEs() {
		creator = new NaturalNumberCreatorEs();		
		assertEquals("cuatro", creator.createNaturalNumber(4).getTextValue());
	}
	
	@Test
	public void testCreateNaturalNumberEn() {
		creator = new NaturalNumberCreatorEn();		
		assertEquals("four", creator.createNaturalNumber(4).getTextValue());
	}
	
	@Test
	public void testCreateNaturalNumberFr() {
		creator = new NaturalNumberCreatorFr();		
		assertEquals("quatre", creator.createNaturalNumber(4).getTextValue());
	}




}
