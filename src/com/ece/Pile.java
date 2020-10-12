package com.ece;

public class Pile {
    protected
    Liste maListe;

    Pile(){
        maListe = new Liste();
    }

    public void Empiler(Object obj){
        maListe.Dernier();
        maListe.Ajouter(obj);
    }
    public Object Depiler(){
        maListe.Dernier();
        return maListe.Supprimer();
    }
}
