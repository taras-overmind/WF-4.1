package com.code;
public class Equilateral_triangle extends Triangle{
    protected double square;
    public Equilateral_triangle(double side) {
        super(side, side, side);
    }
    double calcSquare(){
        square = Math.sqrt(3)*side1*side1/4;
        return square;
    }
}
