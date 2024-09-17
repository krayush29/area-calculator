package org.example.service.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SquareTest {

    @Test
    void testSquareForLength10() {
        Square square = new Square(10.0);
        double expectedArea = 100.0;

        assertEquals(expectedArea, square.area());
    }

    @Test
    void testExceptionForLengthMinus10() {
        assertThrows(IllegalArgumentException.class, ()->{new Square(-10.0);});
    }

    @Test
    void testSquareForLengthNull() {
        assertThrows(RuntimeException.class, ()->{new Square(null);});
    }
}