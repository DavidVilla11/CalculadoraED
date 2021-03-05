import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {
	/**
	 * 
	 * Cuando alguna de las entradas es 0 en este caso todas la multiplicaciones darán como resultado 0.
	 * 		En cuanto a la potencia si la base es 0 será igual a 0 y si el exponente es 0 dará resultado 1
	 * <li> Si se usan numeros negativos el output del resultado sería NaN
	 * <li> La potencia si da un valor alto el output de resultado será infinito 
	 */

	@Test
	void testProductoNumerosReales() {
		Producto pro = new Producto();
		double num1 = 0.0;
		double num2 = 3.3;
		double esperado = 0.0;
		double resultado = pro.ProductoNumerosReales(num1, num2);
		assertEquals(esperado, resultado);
	}

	@Test
	void testProductoNumerosEnteros() {
		Producto pro = new Producto();
		int num1 = 0;
		int num2 = 3;
		int esperado = 0;
		int resultado = pro.ProductoNumerosEnteros(num1, num2);
		assertEquals(esperado, resultado);
	}

	@Test
	void testProductoTresNumerosReales() {
		Producto pro = new Producto();
		double num1 = 0.0;
		double num2 = 3.3;
		double num3 = 6.5;
		double esperado = 0.0;
		double resultado = pro.ProductoTresNumerosReales(num1, num2, num3);
		assertEquals(esperado, resultado);
	}

	@Test
	void potenciaExponenteACero() {
		Producto pro = new Producto();
		double num1 = 3.0;
		double num2 = 0.0;
		double esperado = 1.0;
		double resultado = pro.potencia(num1, num2);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void potenciaBaseACero() {
		Producto pro = new Producto();
		double num1 = 0.0;
		double num2 = 3.0;
		double esperado = 0.0;
		double resultado = pro.potencia(num1, num2);
		assertEquals(esperado, resultado);
	}

}
