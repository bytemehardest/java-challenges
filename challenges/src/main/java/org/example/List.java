package org.example;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = in.nextInt();
        int[] list = new int[n];

        System.out.println("Enter " + n + " integers: ");

        for(int i = 0; i < n; i++) {
            int temp = in.nextInt();
            list[i] = temp;
        }

        int largest = list[0];

        for(int i = 0; i < n; i++) {
            if(list[i] > largest) {
                largest = list[i];
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
