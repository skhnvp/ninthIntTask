package ru.stepup;

public class Rectangle extends Square{
    private int secondSideLen;

    Rectangle(int x, int y, int firstSideLen, int secondSideLen) {
        super(x, y, firstSideLen);
        this.secondSideLen = secondSideLen;
    }

    @Override
    public double getArea() {
        return this.getFirstSideLen() * this.secondSideLen;
    }
}
