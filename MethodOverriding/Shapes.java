package com.company.MethodOverriding;

//overriding
public class Shapes {
    int side;

    public void makeShape(int side) {
        System.out.println("Creating the shape");
    }
}


class Rectangle extends Shapes {
    int side;

    @Override
    public void makeShape(int side) {
        System.out.println("Creating rectangle");
    }
}
