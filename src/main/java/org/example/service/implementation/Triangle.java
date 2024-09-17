package org.example.service.implementation;

import org.example.service.Shape;
import org.example.util.Utils;

public class Triangle implements Shape {

    private final Double height;
    private final Double base;
    private final Double side1;
    private final Double side2;
    private final Double side3;

    public Triangle(Double height, Double base) {
        if(Utils.isNullOrNegative(height) || Utils.isNullOrNegative(base)) throw new IllegalArgumentException("Height or Base cannot be null or negative");
        this.height = height;
        this.base = base;
        this.side1 = null;
        this.side2 = null;
        this.side3 = null;
    }

    public Triangle(Double side1, Double side2, Double side3) {
        if(Utils.isNullOrNegative(side1) || Utils.isNullOrNegative(side2) || Utils.isNullOrNegative(side3)) throw new IllegalArgumentException("Sides cannot be null or negative");
        this.height = null;
        this.base = null;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public Double area() {
        if(height == null){
            Double semiPerimeter = (side1 + side2 + side3)/2;
            //Formula = √[s × (s – a) × (s – b) × (s – c)]
            return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        }

        return (height*base)/2;
    }
}