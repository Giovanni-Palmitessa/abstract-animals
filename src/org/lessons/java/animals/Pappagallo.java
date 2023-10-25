package org.lessons.java.animals;

public class Pappagallo extends Animale implements CanFly{
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

    @Override
    public void fly() {
        System.out.println("Sono un Pappagallo e sto volando!");
    }
}
