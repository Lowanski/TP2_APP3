package com.ece;

public class PileEntiers extends Pile {

    public void Empiler(Integer int1){
        maListe.Dernier();
        maListe.Ajouter(int1);
    }
    public Integer Depiler(){
        maListe.Dernier();
        return (Integer) maListe.Supprimer();
    }
    public void afficher(){
        for (int i = 0; i < maListe.myList.size();i++){
            System.out.print(" "+maListe.Afficher(i));
        }
    }
}
