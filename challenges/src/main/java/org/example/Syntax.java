package org.example;

import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.format("Enter Person Name: ");
        String name = in.nextLine();

        System.out.format("Enter Person Age: ");
        byte age = in.nextByte();

        System.out.format("Enter Person Salary: ");
        int salary = in.nextInt();

        System.out.println("Name " + name + ", Age: " + age + " Salary: " + salary);
    }
}
