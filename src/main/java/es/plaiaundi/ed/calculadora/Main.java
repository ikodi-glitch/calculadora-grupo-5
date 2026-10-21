package es.plaiaundi.ed.calculadora;

/**
 * Punto de entrada: muestra una demostracion de cada operacion.
 */
public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("=== Calculadora del equipo ===");
        // Demostraciones: cada persona anade AQUI debajo su linea
        System.out.println("7 + 5 = " + calc.sumar(7, 5));
        System.out.println("7 x 5 = " + calc.multiplicar(7, 5));
    }
}
