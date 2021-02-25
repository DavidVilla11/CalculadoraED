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
	public float division (float num1,float num2) {
		float resultado =  (float) ((num1*1.0)/num2);
		return resultado;
	}
	
	
	
	/**
	 * Los par�metros ser�n n�meros enteros
	 * @param num1 Primer par�metro de la divisi�n
	 * @param num2 Segundo par�metro de la divisi�n
	 * @return la divisi�n entre el primer par�metro y el segundo
	 */
	public float division (int num1,int num2) {
		float resultado = (float) ((num1*1.0)/num2);
		return resultado;
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
	 * <li> En caso de que ambos n�meros en la divisi�n sean 0 el resultado ser� NaN
	 * <li> Si el primer argumento es 0, el resultado ser� siempre 0
	 */
	//Realizando una prueba con GitHub
	//Creando una rama

}
