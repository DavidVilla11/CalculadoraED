 /**
  * 
  * @author david
  * 
  * @version 1.0
  * @since 21/01/2012
  * {@link Cociente}
  * En caso de que la divisi�n no de un n�mero exacto deberemos hacer un cast a float o bien multiplicar uno de los n�meros x 1.0
  * 
  *
  */
public class Cociente {
	
	/**
	 * 
	 * Los par�metros son n�meros reales
	 * @param num1 Primer par�metro de la divisi�n
	 * @param num2 Segundo par�metro de la divisi�n
	 * @return la divisi�n entre el primer par�metro y el segundo
	 */
	public float divisionNumerosReales(float num1, float num2) {

		// Si ambos parametros de entrada son cero el resultado ser� NaN
		if (num1 == 0 && num2 == 0) {
			double resultado = Double.NaN;
			return (float) resultado;
		// Si el primer parametro es cero y el segundo diferente a cero el resultado ser� cero
		} else if (num1 == 0 && num2 != 0) {
			double resultado = 0;
			return (float) resultado;
		// Si el primer parametro es diferente cero y el segundo es cero el resultado ser� NaN
		} else if (num1 != 0 && num2 == 0) {
			double resultado = Double.NaN;
			return (float) resultado;
		// En el resto de casos el resultado ser� cast a float
		} else {
			float resultado = (float) num1 / num2;
			return resultado;
		}

	}
	
	
	
	/**
	 * Los par�metros ser�n n�meros enteros
	 * @param num1 Primer par�metro de la divisi�n
	 * @param num2 Segundo par�metro de la divisi�n
	 * @return la divisi�n entre el primer par�metro y el segundo
	 */
	public float divisionNumerosEnteros(int num1, int num2) {

		// Si ambos parametros de entrada son cero el resultado ser� NaN
		if (num1 == 0 && num2 == 0) {
			double resultado = Double.NaN;
			return (float) resultado;
		// Si el primer parametro es cero y el segundo diferente a cero el resultado ser� cero
		} else if (num1 == 0 && num2 != 0) {
			float resultado = 0;
			return resultado;
		// Si el primer parametro es diferente cero y el segundo es cero el resultado ser� NaN
		} else if (num1 != 0 && num2 == 0) {
			double resultado = Double.NaN;
			return (float) resultado;
		// En el resto de casos el resultado ser� cast a float
		} else {
			float resultado = (float) num1/num2;
			return resultado;
		}

	}
	
	
	
	/**
	 * 
	 * @param num Par�metro del que se quiere hayar el n�mero inverso
	 * @return Devuelve el n�mero inverso
	 */
	public float inverso(int num) {
		int resto;
		int invertido =0;
		while (num>0) {
			resto = num %10;
			invertido = invertido *10 +resto;
			num /= 10;
		}
		return invertido;
		
	}
	
	
	/**
	 * 
	 * @param num1 Ser� el par�metro del que se hayar� la ra�z cuadrada
	 * @return Devuelve la ra�z cuadrada del n�mero
	 */
	public double raizCuadrada (int num1) {
		double resultado = Math.sqrt(num1);
		return resultado;
	}
	/**
	 * Casos especiales:
	 * <ul>
	 * <li>  En caso de que la divisi�n no de un n�mero exacto deberemos hacer un cast a float o bien multiplicar uno de los n�meros x 1.0
	 * <li> En caso de que ambos n�meros en la divisi�n sean 0 *A�ADIDO HACIENDO PRUEBAS* y en el caso que el num1 != 0 y el num2 = 0 *A�ADIDO HACIENDO PRUEBAS* el resultado ser� NaN
	 * <li> Si el primer argumento es 0, el resultado ser� siempre 0
	 */
	//Realizando una prueba con GitHub
	//Creando una rama

}
//Creacion de nueva rama llamada otraRama


