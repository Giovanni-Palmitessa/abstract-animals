package org.lessons.java.creator;

public class DvdPlayer implements Device{
    //OVERRIDE METODI PALY E STOP
    @Override
    public void play() {
        System.out.println("Sono un Lettore DVD e sono in Play!");
    }
    @Override
    public void stop() {
        System.out.println("Sono un Lettore DVD e sono in Stop!");
    }
}
