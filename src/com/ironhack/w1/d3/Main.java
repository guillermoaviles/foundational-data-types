package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie lotr = new Movie("The Lord of the Rings", 220);
        Movie madMax = new Movie("Mad Max");

        System.out.println(harryPotter.getTitle());
        System.out.println(lotr.getDuration());
        System.out.println(madMax);

        Movie.displayAlert();
        System.out.println(harryPotter.IS_GOOD);

        HorrorMovie scream = new HorrorMovie("Scary Movie", 120, false);

        System.out.println(scream.getTitle() + " - " + scream.getDuration() + " - " + scream.isReallyScary());

        System.out.println(scream);
    }
}
