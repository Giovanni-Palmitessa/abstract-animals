package org.lessons.java.creator;

public class Main {
    public static void main(String[] args) {
        // istanzio il creator
        Creator creator = new Creator();

        // creo il primo dispositivo
        Device device1 = creator.create("Lettore DVD");
        device1.play();
        device1.stop();

        // creo il secondo dispositivo
        Device device2 = creator.create("Playstation");
        device2.play();
        device2.stop();

    }
}
