package com.ironhack.w1.d1;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Default Values
        int value_int = 20;
        String value_string = "Java";
        double value_double = 23.63;
        double ten = 10.2;
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        // Prints
        System.out.println("value_int: " + value_int);
        System.out.println("value_string: " + value_string);
        System.out.println("value_double: " + value_double);



        if ((ten % 1) == 0) {
            System.out.println("It's not a double.");
        }
        else {
            System.out.println("It's a double.");
        }

        // Task 1
        int smallest;

        if (num1 >= num2) {
            smallest = num2;
        } else {
            smallest = num1;
        }

        if (smallest <= num3) {
            System.out.println(smallest);
        } else {
            smallest = num3;
            System.out.println(smallest);
        }

        System.out.println(productFormatter("Air Pods Max", "10/07/2023"));

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        // Outputs Volvo

        int[] numbers = { 4, 2, 7 };
        Arrays.sort(numbers);
        String result = Arrays.toString(numbers);
        System.out.println(result);

        String[] names = {"Guillermo", "Sofia", "Leonardo", "Maria", "Carlos"};

        // FOR LOOP
        System.out.println("==== For ====");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // FOR EACH LOOP
        System.out.println("==== For each ====");
        for (String name : names) {
            System.out.println(name);
        }

        // WHILE LOOP

        System.out.println("==== While ====");
        int i = 1;
        while (i < 5) {
            System.out.println(i); i++;
        }

        // DO WHILE

        System.out.println("==== Do While ====");
        int j = 0;
        do {
            System.out.println(names[j++]);
        } while (j < names.length);

    }

    public static String productFormatter(String productName, String date) {
        return productName.trim().toUpperCase().replace(" ", "-") + " " + date;
    }
}