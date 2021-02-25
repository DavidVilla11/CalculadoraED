 /**
  * 
  * @author david
  * 
  * @version 1.0
  * @since 21/01/2012
  * {@link Cociente}
  * En caso de que la división no de un número exacto deberemos hacer un cast a float o bien multiplicar uno de los números x 1.0
  * 
  *
  */
public class Cociente {
	
	/**
	 * 
	 * Los parámetros son números reales
	 * @param num1 Primer parámetro de la división
	 * @param num2 Segundo parámetro de la división
	 * @return la división entre el primer parámetro y el segundo
	 */
	public float division (float num1,float num2) {
		float resultado =  (float) ((num1*1.0)/num2);
		return resultado;
	}
	
	
	
	/**
	 * Los parámetros serán números enteros
	 * @param num1 Primer parámetro de la división
	 * @param num2 Segundo parámetro de la división
	 * @return la división entre el primer parámetro y el segundo
	 */
	public float division (int num1,int num2) {
		float resultado = (float) ((num1*1.0)/num2);
		return resultado;
	}
	
	
	
	/**
	 * 
	 * @param num Parámetro del que se quiere hayar el número inverso
	 * @return Devuelve el número inverso
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
	 * @param num1 Será el parámetro del que se hayará la raíz cuadrada
	 * @return Devuelve la raíz cuadrada del número
	 */
	public double raizCuadrada (int num1) {
		double resultado = Math.sqrt(num1);
		return resultado;
	}
	/**
	 * Casos especiales:
	 * <ul>
	 * <li>  En caso de que la división no de un número exacto deberemos hacer un cast a float o bien multiplicar uno de los números x 1.0
	 * <li> En caso de que ambos números en la división sean 0 el resultado será NaN
	 * <li> Si el primer argumento es 0, el resultado será siempre 0
	 */
	//Realizando una prueba con GitHub
	//Creando una rama

}
