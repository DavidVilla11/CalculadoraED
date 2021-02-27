

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
	
	public int restaDosEnteros1(int primerNumero, int segundoNumero) {
		return primerNumero - segundoNumero;
	}
	
	/**
	 * @author Antonio De Gea
	 * @param es diferente al primer m�todo porque aqu� se pasan 3 valores, no 2
	 */
	public int restaTresEnteros(int primerNumero, int segundoNumero, int tercerEntero) {
		return primerNumero - segundoNumero;
	}
	
	/**
	 * @author Antonio De Gea
	 * 
	 * @return este m�todo devuelve el n�mero restado con decimales
	 */
	public double restaDosReales(double primerNumero, double segundoNumero) {
		return primerNumero - segundoNumero;
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
