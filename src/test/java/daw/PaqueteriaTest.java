
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
        Paqueteria p = new Paqueteria();
        assertEquals(10, p.calcularTarifaEnvio(3, "A"));
    }
    // testCalcularTarifaZonaBConSuplemento(): Verifica que un envío a la zona "B"
    // de 6kg cuesta 20€ (15 base + 5 suplemento).

    @Test
    public void testCalcularTarifaZonaBConSuplemento() {
        Paqueteria p = new Paqueteria();
        assertEquals(20, p.calcularTarifaEnvio(6, "B")); 
    }
    // testCalcularTarifaPesoInvalido(): Verifica que si pasamos un peso negativo
    // (-5), el método devuelve -1.
    @Test
    public void testCalcularTarifaPesoInvalido() {
        Paqueteria p = new Paqueteria();
        assertEquals(-1, p.calcularTarifaEnvio(-5, "A"));
    }
  // testValidarIdentificadorCorrecto(): Prueba con el ID "1234". Debe dar true.

    @Test
    public void testValidarIdentificadorCorrecto() {
        Paqueteria p = new Paqueteria();
        assertTrue(p.validarIdentificador("1234"));
    }
  // testValidarIdentificadorIncorrectoLongitud(): Prueba con "123". Debe dar
    // false.

    @Test
    public void testValidarIdentificadorIncorrectoLongitud() {
        Paqueteria p = new Paqueteria();
        assertFalse(p.validarIdentificador("123"));
    }
    // testValidarIdentificadorIncorrectoLetra(): Prueba con "12A4". Debe dar false.
    @Test
    public void testValidarIdentificadorIncorrectoLetra() {
        Paqueteria p = new Paqueteria();
        assertFalse(p.validarIdentificador("12A4"));
    }
  // testRepartirCargaCorrecta(): Repartir 10 paquetes entre 2 camiones. Debe
    // devolver 5.
    @Test
    public void testRepartirCargaCorrecta() {
        Paqueteria p = new Paqueteria();
        assertEquals(5, p.repartirCarga(10, 2));
    }

    // testRepartirCargaConResto(): Repartir 10 paquetes entre 3 camiones. Debe
    // devolver 3 (división entera).
    @Test
    public void testRepartirCargaConResto() {
        Paqueteria p = new Paqueteria();
        assertEquals(3, p.repartirCarga(10, 3)); // división entera
    }


    // testRepartirCargaErrorCero(): Intentar repartir 50 paquetes entre 0 camiones.
    // Debe saltar al catch y devolver 0.

    @Test
    public void testRepartirCargaErrorCero() {
        Paqueteria p = new Paqueteria();
        assertEquals(0, p.repartirCarga(50, 0));
    }
}

