package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        // istanzio i nuovi oggetti
        Cane cane = new Cane("GianGiorgio");
        Gatto gatto = new Gatto("Genoveffa");
        Pappagallo pappagallo = new Pappagallo("Kiwi");

        // Array di Animali
        Animale[] animali = {cane, gatto, pappagallo};

        // Ciclo per stampare i metodi
        for (Animale animale : animali) {
            System.out.println("Mi chiamo -> " + animale.getName());
            animale.eat();
            animale.sleep();
            animale.sound();
        }
    }
}
