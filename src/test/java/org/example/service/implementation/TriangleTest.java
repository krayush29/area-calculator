package org.example.service.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class TriangleTest {

    @Test
    void testTriangleForHeight5Base10() {
        Triangle triangle = new Triangle(5.0, 10.0);
        double expectedArea = 25.0;

        assertEquals(expectedArea, triangle.area());
    }

    @Test
    void testExceptionForHeightMinus10() {
        assertThrows(IllegalArgumentException.class, ()->{new Triangle(-10.0, 5.0);});
    }

    @Test
    void testExceptionForBaseMinus5() {
        assertThrows(IllegalArgumentException.class, ()->{new Triangle(10.0, -5.0);});
    }

    @Test
    void testAreaOfTriangleGiven3Sides() {
        Triangle triangle = new Triangle(7.0, 6.0, 5.0);

        double expectedArea = 14.6969384567;
        double actualArea = triangle.area();
        double delta = 1e-10;

        assertEquals(expectedArea, actualArea, delta);
    }

    @Test
    void testExceptionForBaseMinus10() {
        assertThrows(IllegalArgumentException.class, () -> {new Triangle(10.0, -10.0);});
    }
}