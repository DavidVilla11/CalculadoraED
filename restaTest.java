import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class restaTest {

	@Test
	void test() {
		Resta test =  new Resta();
		int resultado = test.restaDosEnteros1(6, 3);
		assertEquals(3, resultado);
		
		
		
	}
	
	@Test 
	void RestaDeTresEnteros () {
		
	 Resta test = new Resta();
	 int resultado = test.restaTresEnteros(22, 2, 1);
	 assertEquals(19,resultado);
	
	}
	
	@Test 
	void RestaReales() {
		Resta test = new Resta();
		double resultado = test.restaDosReales(33, 3);
		assertEquals(30,resultado);
	}
	
	@Test
	
	void RestaAcumulado() {
		Resta test = new Resta();
		int resultado = test.restaValorAcumulado(5);
		assertEquals (5,resultado,"El resultado obtenido debe de ser 5 ya que el valor acumulado era 10");
	}
	
	
	
	
	
	
	
}
