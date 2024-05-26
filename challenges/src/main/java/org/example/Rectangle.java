package org.example;

import java.text.DecimalFormat;

public class Rectangle {
    private double length = 0;
    double breadth = 0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public String calculateArea() {
        double area = this.getLength() * this.getBreadth();
        DecimalFormat d = new DecimalFormat("#0.000");
        return d.format(area);
    }
}
