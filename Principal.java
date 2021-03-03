
public class Principal {

	public static void main(String[] args) {
		
		//Clase Principal para hacer pruebas
		Resta r1 = new Resta ();
		
		System.out.println(r1.restaDosEnteros1(4, 2));
		
		//Prueba clase producto
		Producto p1 = new Producto();
		
		System.out.println(p1.ProductoNumerosEnteros(4, 6));
		System.out.println(p1.ProductoNumerosReales(6.4, 2.5));
		System.out.println(p1.ProductoTresNumerosReales(4.2, 2, 0.5));
		System.out.println(p1.potencia(5, 7));
		
		//Prueba de la clase Cociente
		
		Cociente c1 = new Cociente();
		System.out.println(c1.division(10, 2));
		System.out.println(c1.raizCuadrada(27));
		System.out.println(c1.inverso(4));
		
	}

}
