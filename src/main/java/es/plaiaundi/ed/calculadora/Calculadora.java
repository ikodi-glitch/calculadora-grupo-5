package es.plaiaundi.ed.calculadora;

import java.util.Scanner;

/**
 * Calculadora basica del equipo.
 * Cada operacion la implementa una persona distinta, en su propia rama.
 */
public class Calculadora {

    /**
     * Suma dos numeros enteros.
     * Responsable: Persona A (rama feature/suma).
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return a + b
     */
    public int sumar(int a, int b) {
        // TODO Persona A: implementar la suma
        throw new UnsupportedOperationException("sumar() pendiente de implementar");
    }

    /**
     * Resta dos numeros enteros.
     * Responsable: Persona B (rama feature/resta).
     *
     * @param a minuendo
     * @param b sustraendo
     * @return a - b
     */
    public int restar(int a, int b) {
        // TODO Persona B: implementar la resta
        throw new UnsupportedOperationException("restar() pendiente de implementar");
    }

    /**
     * Multiplica dos numeros enteros.
     * Responsable: Persona C (rama feature/multiplicacion).
     *
     * @param a primer factor
     * @param b segundo factor
     * @return a * b
     */
    public int multiplicar(int a, int b) {
    	Scanner sc = new Scanner(System.in);
//    	int a = sc.nextInt();
//    	int b = sc.nextInt();
    	int mult = a * b ;
    	return mult;
        
    }
}
