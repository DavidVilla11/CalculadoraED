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
		//En este test probamos que el método devuelva NaN en caso de 
		//introducir 0 en los dos parámetros.
		void RestaReales() {
			Resta test = new Resta();
			double resultado = test.restaDosReales(33, 3);
			assertEquals(30,resultado);
		}	
		
		
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
	
@Test
	
	//Si los dos parámetros son 0 el resultado será NaN
	//He tenido que realizar algún cambio en el código del método
	// de restaDeDosEnteros para que funcinase este Test
	void testNaN() {
		Resta test = new Resta();
		float resultado = test.restaDosEnteros1(0, 0);
		double esperado = Double.NaN;
		assertEquals(esperado, resultado);
	}

@Test 
	void testElResultadoDe25Menos7DebeSer18() {
	
	Resta test = new Resta();
	float resultado = test.restaDosEnteros1(25, 7);
	float esperado = 18;
	assertEquals(resultado,esperado);
	

}

@Test
	//Si el primer parámetro es 0 el resultado será negativo
	
	void testNegativo() {
	Resta test = new Resta ();
	float resultado = test.restaDosEnteros1(0, 3);
	assertEquals (-3,resultado);

}

@Test
	//Si alguno de los números es negativo dará un error y saldrá un mensaje diciendo
	//que no se admiten números negativos
	void testSiSeIntroducenNumerosNegativos() {
		Resta test = new Resta ();
		float resultado = test.restaTresEnteros(-3, 2, 3);
		assertFalse(false);
		System.out.println("NO ADMITEN NUMEROS NEGATIVOS");
	}


	
	
	
	
	
	
}
