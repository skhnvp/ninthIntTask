package ru.stepup;

public class Circle extends Point implements Figure{
    private int rad;

    Circle(int x, int y, int rad) {
        super(x, y);
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(rad,2);
    }
}
