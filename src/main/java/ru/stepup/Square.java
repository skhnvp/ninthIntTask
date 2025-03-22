package ru.stepup;

public class Square extends Point implements Figure {
    private int firstSideLen;

    Square(int x, int y, int firstSideLen) {
        super(x, y);
        this.firstSideLen = firstSideLen;
    }

    @Override
    public double getArea() {
        return Math.pow(firstSideLen,2);
    }

    public int getFirstSideLen() {
        return firstSideLen;
    }
}
