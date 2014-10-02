package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

	DecimalCollection decimalCollection;

	@Before
	public void before() {
		decimalCollection = new DecimalCollection();
		decimalCollection.add(0.1);
		decimalCollection.add(0.2);
		decimalCollection.add(0.3);
	}

	@Test
	public void testDecimalCollectionSize() {
		decimalCollection = new DecimalCollection();
		assertEquals(0, decimalCollection.size());
	}

	@Test
	public void testAddSum() {
		assertEquals(0.6, decimalCollection.sum(), 10e-3);
	}

	@Test
	public void testHigher() {
		assertEquals(0.3, decimalCollection.higher(), 10e-3);
	}

}
