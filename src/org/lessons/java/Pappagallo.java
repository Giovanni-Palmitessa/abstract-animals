package org.lessons.java;

public class Pappagallo extends Animale{
    public Pappagallo(String name) {
        super(name);
    }

    // OVERRIDE METodo VERSO
    @Override
    public void sound() {
        System.out.println("CRAAA CRAAA!");
    }
    // OVERRIDE METodo MANGIA
    @Override
    public void eat() {
        super.eat();
        System.out.println("Sto mangiando i semi di girasole!");
    }
}
