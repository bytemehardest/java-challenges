package org.example;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.format("Enter a number: ");
        int a = in.nextInt();

        System.out.format("Enter another number: ");
        int b = in.nextInt();

        int sum = a + b;
        int differ = a - b;
        int multi = a * b;
        int div = a / b;

        System.out.println(sum);
        System.out.println(differ);
        System.out.println(multi);
        System.out.println(div);
    }
}
