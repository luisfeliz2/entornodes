package tets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscripcionTest {

	
	@Test
	void testPrecioPorMes() {
		double esperado = 1;
		Subscripcion s = new Subscripcion(200,2);
		double resultado = s.precioPorMes();
		assertEquals(esperado,resultado,0);
		
	}

}
