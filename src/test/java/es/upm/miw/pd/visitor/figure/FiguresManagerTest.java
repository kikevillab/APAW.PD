package es.upm.miw.pd.visitor.figure;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class FiguresManagerTest {
	
	private FiguresManager coleccion = new FiguresManager();

	
	@Before
	public void before(){
		coleccion.add(new Circle("circulo", 1.0));
        coleccion.add(new Square("cuadrado", 2));
        coleccion.add(new Triangle("triangulo", 2, 1));
	}

	@Test
	public void testTotalArea() {
		assertEquals(8.14, coleccion.totalArea(), 0.01);
	}

	@Test
	public void testTotalNumberOfSides() {
		assertEquals(Double.POSITIVE_INFINITY, coleccion.totalNumberOfSides(), 0.0001);
	}

}
