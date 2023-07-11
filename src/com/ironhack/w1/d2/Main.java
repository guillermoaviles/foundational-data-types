package com.ironhack.w1.d2;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // ARRAYS

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[2]);
        System.out.println(subjectsArray.length);

        // FOR LOOP

        for (int i = 0; i < subjectsArray.length; i++) {
            if (subjectsArray[i].equals("Language")) continue;
            System.out.println(i + " " + subjectsArray[i]);
            if (subjectsArray[i].equals("History")) break;
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[j] = i;
                j++;
            }
        }

        System.out.println(Arrays.toString(evenNumbers));

        // FOR EACH LOOP

        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }
    public static String[] createSubjectsArray() {
        String[] subjects = new String[5];
        subjects[0] = "Math";
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";

        return subjects;
    }
}