package org.lessons.java;

public class Gatto extends Animale{
    // COSTRUTTORE
    public Gatto(String name) {
        super(name);
    }
    // OVERRIDE METodo VERSO
    @Override
    public void sound() {
        System.out.println("MIAO MIAO!");
    }
}
