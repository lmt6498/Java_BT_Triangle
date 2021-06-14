package com.codegym;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        Triangle triangle = new Triangle();
        triangle = new Triangle(3.5,2.5,4.5);
        System.out.println(triangle);
    }
}
