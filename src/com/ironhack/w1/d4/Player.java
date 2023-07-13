package com.ironhack.w1.d4;

public abstract class Player {

    private double volume;
    private int currentSong;

    public Player(double volume, int currentSong) {
        this.volume = volume;
        this.currentSong = currentSong;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(int currentSong) {
        this.currentSong = currentSong;
    }

    public abstract void close ();
}
