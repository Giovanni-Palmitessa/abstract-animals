package org.lessons.java.animals;

public class PesceRosso extends Animale implements CanSwim{
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

    @Override
    public void swim() {
        System.out.println("Sono un Pesce Rosso e sto Nuotando!");
    }
}
