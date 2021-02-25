package Calculadora;

/**
 * 
 * @author David
 *
 * @version 1.0
 * @since 20/01/2021
 * {@link Producto}
 * 
 * 
 */



public class Producto {
			
	public Producto() {
		
	}
	
	/**
	 * 
	 * <p> Metodo que usaremos para multiplicar dos numeros reales </p>
	 * @param num1 ser� la primera variable con la que operamos
	 * @param num2 ser� la segunda variable con la que operamos
	 * @param resultado ser� el resultado de la operaci�n num1 * num2
	 * @return resultado de la operaci�n
	 * 
	 */
	public double ProductoNumerosReales(double num1, double num2) {
		double resultado = num1 * num2;
		return resultado;	
	}
	
	/**
	 * 
	 * <p> Metodo que usaremos para multiplicar dos numeros enteros </p>
	 * @param num1 ser� la primera variable con la que operamos
	 * @param num2 ser� la segunda variable con la que operamos
	 * @param resultado ser� el resultado de la operaci�n num1 * num2
	 * @return resultado de la operaci�n
	 * 
	 */
	public int ProductoNumerosEnteros(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;	
	}
	
	/**
	 * 
	 * <p> Metodo que usaremos para multiplicar tres numeros enteros </p>
	 * @param num1 ser� la primera variable con la que operamos
	 * @param num2 ser� la segunda variable con la que operamos
	 * @param num3 ser� la tercera variable con la que operamos
	 * @param resultado ser� el resultado de la operaci�n num1 * num2 * num3
	 * @return resultado de la operaci�n
	 * 
	 */
	public double ProductoTresNumerosReales(double num1, double num2, double num3) {
		double resultado = num1 * num2 * num3;
		return resultado;	
	}
	
	/**
	 * 
	 * <p> Metodo que usaremos para saber la potencia de un numero </p>
	 * @param num1 ser� la variables con la que operaremos. num1 = base.
	 * @param num2 ser� la variables con la que operaremos. num2 = exponente.
	 * @param resultado ser� el resultado de la operaci�n (num1)^num2
	 * @return resultado de la operaci�n
	 * 
	 */
	public double potencia(double num1, double num2) {
		double resultado = (double) Math.pow(num1, num2);
		return resultado;	
	}
	
	/**
	 * 
	 * Casos espaciales:
	 * <u1>
	 * <li> Cuando alguna de las entradas es 0 en este caso todas la multiplicaciones dar�n como resultado 0.
	 * 		En cuanto a la potencia si la base es 0 ser� igual a 0 y si el exponente es 0 dar� resultado 1
	 * <li> Si se usan numeros negativos el output del resultado ser�a NaN
	 * <li> La potencia si da un valor alto el output de resultado ser� infinito 
	 *
	 */
	
	

}
