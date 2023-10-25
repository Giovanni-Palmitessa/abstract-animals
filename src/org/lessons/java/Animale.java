package org.lessons.java;

public abstract class Animale {
    // ATTRIBUTI
    private String name;

    //COSTRUTTORE
    public Animale(String name) {
        this.name = name;
    }

    //GETTER E SETTER
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //METODI
    public void sleep() {
        System.out.println("Sto dormendo...Zzz");
    }
    public void eat(String food) {
        System.out.println("Sto mangiando..." + food);
    }

    public abstract void sound();
}
