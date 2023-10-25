package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        // istanzio i nuovi oggetti
        Cane cane = new Cane("GianGiorgio");
        Gatto gatto = new Gatto("Genoveffa");
        Pappagallo pappagallo = new Pappagallo("Kiwi");
        PesceRosso pesceRosso = new PesceRosso("GinoBuonVino");

        // Array di Animali
        Animale[] animali = {cane, gatto, pappagallo, pesceRosso};

        // Ciclo per stampare i metodi
        for (Animale animale : animali) {
            System.out.println("Mi chiamo -> " + animale.getName());
            animale.eat();
            animale.sleep();
            animale.sound();
            if (animale instanceof CanSwim) {
//                ((CanSwim) animale).swim();
                faiNuotare((CanSwim) animale);
            }
            if (animale instanceof CanFly) {
//                ((CanFly) animale).fly();
                faiVolare((CanFly) animale);
            }
        }
    }

    public static void faiVolare(CanFly animale) {
        animale.fly();
    }

    public static void faiNuotare(CanSwim animale) {
        animale.swim();
    }
}
