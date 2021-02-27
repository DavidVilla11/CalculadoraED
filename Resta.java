

/**
 * Es una clase donde se reúnen todos los métodos creados para poder hacer las operaciones de restar.
 * 
 * @author Antonio De Gea
 *
 */
public class Resta {

	/**
	 * @author Antonio De Gea
	 * 
	 * @param primerNumero es el primer número que tenemos que pasarle al método, como su nombre indica
	 * @return devuelve el numero ya restado
	 */ 
	
	public int restaDosEnteros1(int primerNumero, int segundoNumero) {
		return primerNumero - segundoNumero;
	}
	
	/**
	 * @author Antonio De Gea
	 * @param es diferente al primer método porque aquí se pasan 3 valores, no 2
	 */
	public int restaTresEnteros(int primerNumero, int segundoNumero, int tercerEntero) {
		return primerNumero - segundoNumero;
	}
	
	/**
	 * @author Antonio De Gea
	 * 
	 * @return este método devuelve el número restado con decimales
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
	 * Si el primer parametro de entrada es cero la resta dará un número negativo
	 * Si la calculadora no admite numeros negativos en la documentacion se pondra de la siguiente manera: 
	 * @param NO ADMITEN NUMEROS NEGATIVOS
	 * 

	 */
	
}
