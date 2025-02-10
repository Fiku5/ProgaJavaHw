package HomeWork3.models;

import java.awt.*;

public class Ellipse extends GeometricShape {
    private double semiMajorAxis; // Большая полуось
    private double semiMinorAxis; // Малая полуось

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    @Override
    public double getPerimeter() {
        // Формула Рамануджана
        double h = Math.pow((semiMajorAxis - semiMinorAxis) / (semiMajorAxis + semiMinorAxis), 2);
        return Math.PI * (semiMajorAxis + semiMinorAxis) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }
}
