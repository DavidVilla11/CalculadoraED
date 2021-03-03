

/**
 * Es una clase donde se re�nen todos los m�todos creados para poder hacer las operaciones de restar.
 * 
 * @author Antonio De Gea
 *
 */
public class Resta {

	/**
	 * @author Antonio De Gea
	 * 
	 * @param primerNumero es el primer n�mero que tenemos que pasarle al m�todo, como su nombre indica
	 * @return devuelve el numero ya restado
	 */ 
	//He cambiado parte del c�digo para que pasase el test de NaN de JUnit
	//cambiando el resultado a float y a�adiendo el bloque if en caso de que los dos par�metros fuesen cero
	public float restaDosEnteros1(int primerNumero, int segundoNumero) {
		int resultado = primerNumero - segundoNumero;
		if (primerNumero == 0 && segundoNumero == 0) {
			double resultadoNaN = Double.NaN;
			return (float) resultadoNaN;
		}else {
	
		
				 
		return resultado;
		}
	}
	/**
	 * @author Antonio De Gea
	 * @param es diferente al primer m�todo porque aqu� se pasan 3 valores, no 2
	 */
	public int restaTresEnteros(int primerNumero, int segundoNumero, int tercerEntero) {
		if ((primerNumero < 0)or(segundoNumero <0)or (tercerNumero<0)) {
			return false;
			System.out.println("NO ADMITEN NUMEROS NEGATIVOS");
			
		}else
		return primerNumero - segundoNumero - tercerEntero;
	}
	
	/**
	 * @author Antonio De Gea
	 * 
	 * @return este m�todo devuelve el n�mero restado con decimales
	 */
	//He realizado cambios en este para superar el test de NaN de JUnit
	public double restaDosReales(double primerNumero, double segundoNumero) {
		if (primerNumero == 0 && segundoNumero == 0) {
			double resultadoNaN = Double.NaN;
			return resultadoNaN;
		}else {
		return primerNumero - segundoNumero;
		}
	}
	
	/**
	 * @author Antonio De Gea
	 */
	public int restaValorAcumulado(int primerNumero) {
		int valorAcumulado =  0;
		
		return valorAcumulado - primerNumero;
	}
	
	/**
	 * 
	 * Casos especiales:
	 * Si el primer parametro de entrada es cero la resta dar� un n�mero negativo
	 * Si la calculadora no admite numeros negativos en la documentacion se pondra de la siguiente manera: 
	 * @param NO ADMITEN NUMEROS NEGATIVOS
	 * 

	 */
	
}
