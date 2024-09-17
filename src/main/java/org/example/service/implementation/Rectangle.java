package org.example.service.implementation;

import org.example.service.Shape;
import org.example.util.Utils;

public class Rectangle implements Shape {

    private final Double length;
    private final Double width;

    public Rectangle(Double length, Double width) {
        if(Utils.isNullOrNegative(length) || Utils.isNullOrNegative(width)) throw new IllegalArgumentException("Length or Width cannot be null or negative");
        this.length = length;
        this.width = width;
    }

    @Override
    public Double area() {
        return length * width;
    }
}
