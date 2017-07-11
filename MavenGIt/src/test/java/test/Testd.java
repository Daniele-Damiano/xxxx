package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mavengitTest.Calcolatrice;

public class Testd {
	private Calcolatrice cd,cd1;
	
	@Before
	public void setup(){
		cd = new  Calcolatrice();
		cd1 = new Calcolatrice();
	}
	
	
	@Test
	public void testMoltiplicazione() {
		int risultato = cd.moltiplicazione(2, 2);
		assertEquals(4,risultato);
	}

	@Test
	public void testDivisione() {
		float risultato = cd.divisione(4, 2);
		assertEquals(1,risultato,1);
	}

	@Test
	public void testAddizione() {
		int risultato = cd.addizione(2, 3);
		assertEquals(5, risultato);
		
	}

	@Test
	public void testSottrazione() {
		int risultato = cd.sottrazione(4, 4);
		assertEquals(0,risultato);
	}
	@Test
	public void testObject(){
		cd1 = null;
		assertNotNull(cd1);
	}

}
