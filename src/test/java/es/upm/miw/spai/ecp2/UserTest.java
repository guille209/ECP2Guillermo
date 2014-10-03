package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	User user;

	@Before
	public void before() {
		user = new User(123, "Guillermo", "Miranda");
	}

	@Test
	public void testUser() {
		assertEquals(123, user.getNumber());
		assertEquals("Guillermo", user.getName());
		assertEquals("Miranda", user.getFamilyName());
	}

	@Test
	public void testInitials() {
		assertEquals("G.", user.initials());

	}

	@Test
	public void testMostrarNombreEnMayusculas() {
		assertTrue(user.mostrarNombreEnMayusculas().equals("GUILLERMO"));
	}

}
