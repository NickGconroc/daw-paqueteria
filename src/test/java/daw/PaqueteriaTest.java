
// Archivo PaqueteriaTest.java (ruta: src/test/java/daw/PaqueteriaTest.java)

// Implementar las pruebas unitarias para asegurar la calidad del código
// anterior.
// Se deben diseñar, al menos, los siguientes casos de prueba (métodos/funciones
// con @Test):

package daw;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaqueteriaTest {

    // testCalcularTarifaZonaA(): Verifica que un envío a la zona "A" de 3kg cuesta
    // 10€.

    @Test
    public void testCalcularTarifaZonaA() {
        boolean var = false;
        double resultado = Paqueteria.calcularTarifaEnvio(3, "A");
        if (resultado == 10) {
            var = true;
        }

        assertTrue(var, "El resultado deberia ser 10");

    }

    // testCalcularTarifaZonaBConSuplemento(): Verifica que un envío a la zona
    // "B" de 6kg cuesta 20€ (15 base + 5 suplemento).
    @Test
    public void testCalcularTarifaZonaBConSuplemento() {
        boolean var = false;
        double resultado = Paqueteria.calcularTarifaEnvio(6, "B");
        if (resultado == 20) {
            var = true;
        }
        assertTrue(var, "El resultado deberia ser 20");
    }
     // testCalcularTarifaPesoInvalido(): Verifica que si pasamos un peso negativo
    // (-5), el método devuelve -1.
    @Test
    public void testCalcularTarifaPesoInvalido() {
        boolean var = false;
        double resultado = Paqueteria.calcularTarifaEnvio(-5, "A");
        if (resultado == -1) {
            var = true;
        }
        assertTrue(var, "El resultado deberia ser -1");
    }

    // testValidarIdentificadorCorrecto(): Prueba con el ID "1234". Debe dar true.
    @Test
    public void testValidarIdentificadorCorrecto() {
        boolean var = false;
        boolean resultado = Paqueteria.validarIdentificador("1234");
        if (resultado == true) {
            var = true;
        }
        assertTrue(var, "El ID deberia ser valido");
    }

    // testValidarIdentificadorIncorrectoLongitud(): Prueba con "123". Debe dar
    // false.
    @Test
    public void testValidarIdentificadorIncorrectoLongitud() {
        boolean var = true;
        boolean resultado = Paqueteria.validarIdentificador("123");
        if (resultado == true) {
            var = false;
        }
        assertFalse(resultado, "El ID deberia ser invalido por longitud incorrecta");
    }

    // testValidarIdentificadorIncorrectoLetra(): Prueba con "12A4". Debe dar false.
    @Test
    public void testValidarIdentificadorIncorrectoLetra() {
        boolean var = true;
        boolean resultado = Paqueteria.validarIdentificador("12A4");
        if (resultado == true) {
            var = false;
        }
        assertFalse(resultado, "El ID deberia ser invalido por contener letras");
    }

    // testRepartirCargaCorrecta(): Repartir 10 paquetes entre 2 camiones. Debe
    // devolver 5.
    @Test
    public void testRepartirCargaCorrecta() {
        boolean var = false;
        int resultado = Paqueteria.repartirCarga(10, 2);
        if (resultado == 5) {
            var = true;
        }
        assertTrue(var, "El resultado deberia ser 5");
    }

    // testRepartirCargaConResto(): Repartir 10 paquetes entre 3 camiones. Debe
    // devolver 3 (división entera).
    @Test
    public void testRepartirCargaConResto() {
        boolean var = false;
        int resultado = Paqueteria.repartirCarga(10, 3);
        if (resultado == 3) {
            var = true;
        }
        assertTrue(var, "El resultado deberia ser 3");
    }

    // testRepartirCargaErrorCero(): Intentar repartir 50 paquetes entre 0 camiones.
    // Debe saltar al catch y devolver 0.
    @Test
    public void testRepartirCargaErrorCero() {
        boolean var = false;
        int resultado = Paqueteria.repartirCarga(50, 0);
        if (resultado == 0) {
            var = true;
        }
        assertTrue(var, "El resultado deberia ser 0");
    }

}

