package com.ironhack.w1.d3;

public class HorrorMovie extends Movie {
    private boolean isReallyScary;

    public HorrorMovie(String title, int duration, boolean isReallyScary) {
        super(title, duration);
        this.isReallyScary = isReallyScary;
    }

    public boolean isReallyScary() {
        return isReallyScary;
    }

    public void setReallyScary(boolean reallyScary) {
        isReallyScary = reallyScary;
    }

    public void play() {
        System.out.println("Playing scary movie");
    }

    @Override
    public String toString() {
        return "HorrorMovie: " +
                super.getTitle() + ", " +
                super.getDuration() + " mins, " +
                "isReallyScary=" + isReallyScary +
                '.';
    }
}
