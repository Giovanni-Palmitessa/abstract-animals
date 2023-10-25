package org.lessons.java.creator;

public class Creator {
    //metodo create
    public Device create(String type){
        // se scelta è dvd creo nuovo DVD
        if (type.equalsIgnoreCase("Lettore DVD")) {
            return new DvdPlayer();
            // se scelta è playstation creo playstation
        } else if (type.equalsIgnoreCase("Playstation")) {
            return new Playstation();
        } else {
            return  null;
        }
    }
}
