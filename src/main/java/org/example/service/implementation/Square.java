package org.example.service.implementation;

import org.example.service.Shape;
import org.example.util.Utils;

public class Square implements Shape {

    private final Double length;

    public Square(Double length) {
        if(Utils.isNullOrNegative(length)) throw new IllegalArgumentException("Length cannot be null or negative");
        this.length = length;
    }

    @Override
    public Double area() {
        return length * length;
    }
}
