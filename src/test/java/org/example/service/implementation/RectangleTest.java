package org.example.service.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class RectangleTest {

    @Test
    void testRectangleForLength5Width10() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        double expectedArea = 50.0;

        assertEquals(expectedArea, rectangle.area());
    }

    @Test
    void testExceptionForLengthMinus10() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(-10.0, 5.0);});
    }

    @Test
    void testExceptionForWidthMinus5() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(10.0, -5.0);});
    }

    @Test
    void testRectangleForLengthNull() {
        assertThrows(IllegalArgumentException.class, ()->{new Rectangle(null, 10.0);});
    }
}