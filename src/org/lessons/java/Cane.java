package org.lessons.java;

public class Cane extends Animale{
    // COSTRUTTORE
    public Cane(String name) {
        super(name);
    }

    // OVERRIDE METodo VERSO
    @Override
    public void sound() {
        System.out.println("BAU BAU, WOF WOF!");
    }
}
