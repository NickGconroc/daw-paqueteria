package daw;

public class Paqueteria {

    // Se deben implementar los siguientes 3 métodos/funciones respetando las
    // restricciones:

    // 1.) 1 Función
    // calcularTarifaEnvio(double peso, String zona){}

    // Calcula el precio del envío basándose en el peso y la zona.
    // Parámetros: peso (double), zona (String).
    // Lógica:
    // Si el peso es menor o igual a 0, debe lanzar una excepción o devolver un
    // código de error. Para simplificar esta práctica: devuelve -1.
    // Utiliza una estructura switch para evaluar la zona:
    // "A": Precio base 10€.
    // "B": Precio base 15€.
    // "C": Precio base 20€.
    // Cualquier otra zona: devuelve -1 (zona no válida).
    // Utiliza estructuras condicionales:
    // Si el peso es menor a 5kg, no hay suplemento.
    // Si el peso está entre 5kg (incluido) y 10kg (excluido), suma 5€ al precio.
    // Si el peso es mayor o igual a 10kg, suma 10€ al precio.
    // Retorno: El precio final (double).

    public static double calcularTarifaEnvio(double peso, String zona) {
        // Si el peso es menor o igual a 0, debe lanzar una excepción o devolver un
        // código de error. Para simplificar esta práctica: devuelve -1.
        if (peso <= 0) {

            return -1;
        }

        double precioBase;

        // / Utiliza una estructura switch para evaluar la zona:
        // "A": Precio base 10€.
        // "B": Precio base 15€.
        // "C": Precio base 20€.
        // Cualquier otra zona: devuelve -1 (zona no válida).
        // Utiliza estructuras condicionales:
        switch (zona) {
            case "A":
                precioBase = 10;
                break;
            case "B":
                precioBase = 15;
                break;
            case "C":
                precioBase = 20;
                break;
            default:
                return -1; // Zona no válida
        }

        // Si el peso es menor a 5kg, no hay suplemento.
        // Si el peso está entre 5kg (incluido) y 10kg (excluido), suma 5€ al precio.
        // Si el peso es mayor o igual a 10kg, suma 10€ al precio.
     
        if (peso < 5) {
            // No hay suplemento
        } else if (peso >= 5 && peso < 10) {
            precioBase += 5;
        } else { // peso >= 10
            precioBase += 10;
        }

        return precioBase;
    }

    // 2.) 2 Función
    // validarIdentificador(String id){}

    // Verifica si el identificador del paquete es válido. Un ID es válido si tiene
    // exactamente 4 caracteres y todos son dígitos (0-9).
    // Parámetros: id (String).
    // Retorno: true si es válido, false si no lo es (o si es nulo).

    public static boolean validarIdentificador(String id) {
        // Verificar nulo
        if (id == null) {
            return false;
        }

        // Verificar longitud exacta de 4 caracteres
        if (id.length() != 4) {
            return false;
        }

        // Verificar que todos los caracteres sean dígitos
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }

        return true; // Si pasa todas las validaciones
    }

    // 3.) 3 Función

    // repartirCarga(int totalPaquetes, int camiones){}

    // Se necesita saber cuántos paquetes exactos deben ir en cada camión para que
    // el reparto sea equitativo, ignorando los que sobren (división entera).
    // Parámetros: totalPaquetes (int), camiones (int).
    // Lógica:
    // Debe realizar la división de paquetes entre camiones.
    // Utilizar una estructura try-catch.
    // Java lanza una ArithmeticException si intentamos dividir un número entero por
    // cero (si no hay camiones disponibles).
    // Capturar esa excepción específica y, en caso de error, devolver 0.
    // Retorno: La cantidad de paquetes por camión (int).

    public static int repartirCarga(int totalPaquetes, int camiones) {
        try {
            // División entera; si camiones es 0, Java lanzará ArithmeticException
            return totalPaquetes / camiones;
        } catch (ArithmeticException e) {
            // Si ocurre división por cero, devolvemos 0 según las instrucciones
            return 0;
        }
    }

}
