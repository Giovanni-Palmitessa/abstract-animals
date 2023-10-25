package org.lessons.java.animals;

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
    // OVERRIDE METodo MANGIA
    @Override
    public void eat() {
        super.eat();
        System.out.println("Sto mangiando il cibo umido al salmone!");
    }
}
