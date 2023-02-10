package tets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {

	@Test
	void testSuma() {
		
		int esperado = 8;
		int a = 5;
		int b = 3;
		
		int suma = OperadorAritmetico.suma(a, b);
		assertEquals(esperado,suma);
	}
	
	@Test
	void division() {
		int esperado = 2;
		int a = 8;
		int b= 4;
		int division;
		
		try {
			division = OperadorAritmetico.division(a, b);
			assertEquals(esperado,division);
			
			
			} catch (Exception e) {
				fail();
			}
		
	}

}
