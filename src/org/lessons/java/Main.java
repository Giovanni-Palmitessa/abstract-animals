package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        // istanzio i nuovi oggetti
        Cane cane = new Cane("GianGiorgio");
        Gatto gatto = new Gatto("Genoveffa");
        Pappagallo pappagallo = new Pappagallo("Kiwi");

        Animale[] animali = {cane, gatto, pappagallo};

        for (Animale animale : animali) {
            System.out.println("Mi chiamo -> " + animale.getName());
            animale.eat();
            animale.sleep();
            animale.sound();
        }
    }
}
