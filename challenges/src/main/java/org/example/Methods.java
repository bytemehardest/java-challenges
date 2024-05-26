package org.example;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int vowelCounter = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String sentence = in.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
                vowelCounter++;
            }
        }

        System.out.println("Total Vowels: " + vowelCounter);
    }
}
