import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author David Villa
 * Creacion de test para los casos especiales espeficados en la clase {@link Cociente}
 * 
 */

class CocienteUT {
	
	private Cociente cut;
	
	@BeforeEach
	void setUp() throws Exception {
		cut = new Cociente();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void SiLaDivisionNoDaNumeroExactoHacerCastFloatEnteros() {
		//1. Arrange - Preparar
		int num1 = 8;
		int num2 = 6;
		float esperado = 1.3333334f;
		//2. Act - Ejecutar
		float obtenido = cut.divisionNumerosEnteros(num1, num2);
		//3. Assert - Comprobar
		assertEquals(esperado, obtenido, "El resultado debe ser 1.3333334");
	}
	
	@Test
	void SiLaDivisionNoDaNumeroExactoHacerCastFloatReales() {
		//1. Arrange - Preparar
		float num1 = 8;
		float num2 = 6;
		float esperado = 1.3333334f;
		//2. Act - Ejecutar
		float obtenido = (float) cut.divisionNumerosReales(num1, num2);
		//3. Assert - Comprobar
		assertEquals(esperado, obtenido, "El resultado debe ser 1.3333334");
	}
	
	@Test
	void SiAmbasVariablesonCeroResultadoNaNEnteros() {
		//1. Arrange - Preparar
		int num1 = 0;
		int num2 = 0;
		Double esperado = Double.NaN;
		//2. Act - Ejecutar
		float obtenido = cut.divisionNumerosEnteros(num1, num2);
		//3. Assert - Comprobar
		assertEquals(esperado, obtenido, "El resultado debe ser NaN");
	}
	
	@Test
	void SiAmbasVariablesSonCeroResultadoNaNReales() {
		//1. Arrange - Preparar
		float num1 = 0;
		float num2 = 0;
		Double esperado = Double.NaN;
		//2. Act - Ejecutar
		float obtenido = cut.divisionNumerosReales(num1, num2);
		//3. Assert - Comprobar
		assertEquals(esperado, obtenido, "El resultado debe ser NaN");
	}
	
	@Test
	void SiLaPrimeraVariableEsCeroResultadoCeroEnteros() {
		//1. Arrange - Preparar
		int num1 = 0;
		int num2 = 6;
		Double esperado = 0.0;
		//2. Act - Ejecutar
		float obtenido = cut.divisionNumerosEnteros(num1, num2);
		//3. Assert - Comprobar
		assertEquals(esperado, obtenido, "El resultado debe ser 0");
	}
	
	@Test
	void SiLaPrimeraVariableEsCeroResultadoCeroReales() {
		//1. Arrange - Preparar
		float num1 = 0;
		float num2 = 6;
		float esperado = 0;
		//2. Act - Ejecutar
		float obtenido = cut.divisionNumerosReales(num1, num2);
		//3. Assert - Comprobar
		assertEquals(esperado, obtenido, "El resultado debe ser 0");
	}
	
	@Test
	void SiLaSegundaVariableEsCeroResultadoNaNEnteros() {
		//1. Arrange - Preparar
		int num1 = 5;
		int num2 = 0;
		double esperado = Double.NaN;
		//2. Act - Ejecutar
		float obtenido = cut.divisionNumerosEnteros(num1, num2);
		//3. Assert - Comprobar
		assertEquals(esperado, obtenido, "El resultado debe ser NaN");
	}
	
	
	@Test
	void SiLaSegundaVariableEsCeroResultadoNaNReales() {
		//1. Arrange - Preparar
		float num1 = 5;
		float num2 = 0;
		Double esperado = Double.NaN;
		//2. Act - Ejecutar
		float obtenido = cut.divisionNumerosReales(num1, num2);
		//3. Assert - Comprobar
		assertEquals(esperado, obtenido, "El resultado debe ser NaN");
	}

}
