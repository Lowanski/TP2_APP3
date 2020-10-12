package com.ece;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        PileEntiers P1 = new PileEntiers();
        PileEntiers P2 = new PileEntiers();
        PileEntiers P3 = new PileEntiers();
        Random alea = new Random();
        int nb;

        for(int i = 0; i < 5; i++) {
            System.out.println("\n\nEtape "+ (i+1) + " :");
            nb = alea.nextInt(100);
            P1.Empiler(nb);

            System.out.println("Pile 1 : ");
            P1.afficher();

            if (nb % 2 == 0){
                P2.Empiler(nb);

                System.out.println("\nPile 2 : ");
                P2.afficher();
            }
            else {
                P3.Empiler(nb);

                System.out.println("\nPile 3 : ");
                P3.afficher();
            }
        }
        System.out.println("\n\nEtape Finale :");
        System.out.println("Pile 1 : ");
        P1.afficher();
        System.out.println("\nPile 2 : ");
        P2.afficher();
        System.out.println("\nPile 3 : ");
        P3.afficher();
    }
}
