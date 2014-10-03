package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	Fraction fraccion;

	@Before
	public void before() {
		fraccion = new Fraction(2, 3);
	}

	@Test
	public void testFractionIntInt() {
		assertEquals(2, fraccion.getNumerator());
		assertEquals(3, fraccion.getDenominator());
	}

	@Test
	public void testFraction() {
		fraccion = new Fraction();
		assertEquals(1, fraccion.getNumerator());
		assertEquals(1, fraccion.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(0.66, fraccion.decimal(), 10e-3);
	}
	
	@Test
	public void testSumar(){
	    Fraction fraccion2 = new Fraction(1,3);
        assertEquals( 1 ,fraccion.sumar(fraccion2).decimal(), 0.001);
	}
	
	@Test
	public void testMultiplicar(){
	    Fraction multiplo = new Fraction(2,2);        
        assertEquals(fraccion.multiplicar(multiplo).getNumerator(), multiplo.getNumerator() * fraccion.getNumerator(), 0.5);
        assertEquals(fraccion.multiplicar(multiplo).getDenominator(), multiplo.getDenominator() * fraccion.getDenominator(), 0.5);
	}
	
	@Test
	public void testMostrar(){
	    assertEquals("2/3", fraccion.mostrar());
	}

}
