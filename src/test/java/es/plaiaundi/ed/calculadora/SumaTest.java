package es.plaiaundi.ed.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Suma (Persona A)")
class SumaTest {

    private final Calculadora calc = new Calculadora();

    @Test
    @DisplayName("2 + 3 = 5")
    void sumaDosPositivos() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    @DisplayName("-3 + -4 = -7")
    void sumaDosNegativos() {
        assertEquals(-7, calc.sumar(-3, -4));
    }

    @Test
    @DisplayName("9 + 0 = 9")
    void sumaConCero() {
        assertEquals(9, calc.sumar(9, 0));
    }

    @Test
    @DisplayName("7 + -7 = 0")
    void sumaNumerosOpuestos() {
        assertEquals(0, calc.sumar(7, -7));
    }
}
