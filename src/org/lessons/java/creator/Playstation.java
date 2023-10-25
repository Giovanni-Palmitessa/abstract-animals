package org.lessons.java.creator;

public class Playstation implements Device{
    //Metodi
    @Override
    public void play() {
        System.out.println("Sono una Playstation e sono in Play!");
    }

    @Override
    public void stop() {
        System.out.println("Sono una playstation e sono in Stop!");
    }
}
