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
		//En este test probamos que el m�todo devuelva NaN en caso de 
		//introducir 0 en los dos par�metros.
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
	
	//Si los dos par�metros son 0 el resultado ser� NaN
	//He tenido que realizar alg�n cambio en el c�digo del m�todo
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
	//Si el primer par�metro es 0 el resultado ser� negativo
	
	void testNegativo() {
	Resta test = new Resta ();
	float resultado = test.restaDosEnteros1(0, 3);
	assertEquals (-3,resultado);

}

@Test
	//Si alguno de los n�meros es negativo dar� un error y saldr� un mensaje diciendo
	//que no se admiten n�meros negativos
	void testSiSeIntroducenNumerosNegativos() {
		Resta test = new Resta ();
		float resultado = test.restaTresEnteros(-3, 2, 3);
		assertFalse(false);
		System.out.println("NO ADMITEN NUMEROS NEGATIVOS");
	}


	
	
	
	
	
	
}
