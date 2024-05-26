package org.example;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.format("Enter a number: ");

        int num = in.nextInt();

        if(num == 0) {
            System.out.format("Zero");
        } else if (num > 0) {
            System.out.format("Positive");
        } else {
            System.out.format("Negative");
        }
    }
}
