package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args ) throws IOException {
        System.out.println("Normal output");
        System.err.println("Error output");

        // SCANNER CLASS

        Scanner scanner = new Scanner(System.in);

        String name;
        do {
            System.out.println("Please write your name");
            name = scanner.nextLine();
        } while (name.length() < 3);

        System.out.println("Your name is: " + name);

        int age;
        boolean isValidAge = true;
        do {
            System.out.println("Please write your age");
            while(!scanner.hasNextInt()) {
                System.err.println("Value not accepted. Please enter a number:");
                scanner.next();
            }
            age = scanner.nextInt();
            if (!(age <= 120 && age > 0)) {
                System.err.println("Not a valid age. Please try again:");
                isValidAge = false;
            }
        } while (!isValidAge);

        System.out.println("Your age is: " + age);

        scanner.close();


        // FILE HANDLING


        String filePath = "src/com/ironhack/w1/d3/file.txt";

        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("File has been created");
        } else {
            System.out.println("File already exists");
        }

        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write("Written");
        fileWriter.close();

        Scanner fileScanner = new Scanner(file);
        String str = "";
        while (fileScanner.hasNextLine()) {
            str += fileScanner.nextLine() + "\n";
        }
        fileScanner.close();

        System.out.println(str);

    }

}