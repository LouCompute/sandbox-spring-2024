package unittests;

import org.example.sandbox.unittests.Calcuator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcuatorTest {

    @Test
    void add() {

        //SEA
        int expected = 4;
        int actual = new Calcuator().add(2,2);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void testAdd() {
        int expected = 6;
        int actual = new Calcuator().add(3,3);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        int expected = 2;
        int actual = new Calcuator().add(4,2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int expected = 4;
        int actual = new Calcuator().add(2,2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        int expected = 8;
        int actual = new Calcuator().add(4,2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            new Calcuator().divide(0,0);
        });
    }
}