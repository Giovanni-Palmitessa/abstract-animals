package org.lessons.java;

public class PesceRosso extends Animale{
    //COSTRUTTORE
    public PesceRosso(String name) {
        super(name);
    }

    // OVERRIDE METodo VERSO
    @Override
    public void sound() {
        System.out.println("SPLASH SPLASH BLOB BLOB!");
    }
    // OVERRIDE METodo MANGIA
    @Override
    public void eat() {
        super.eat();
        System.out.println("Sto mangiando il mangime per pesci!");
    }
}
