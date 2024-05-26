package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Length: ");
        r.setLength(in.nextDouble());

        System.out.println("Enter Breadth: ");
        r.setBreadth(in.nextDouble());

        System.out.println("Area of the rectangle: " + r.calculateArea());
    }
}