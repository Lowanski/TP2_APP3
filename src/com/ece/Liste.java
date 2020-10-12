package com.ece;

import java.util.ArrayList;

public class Liste {
    private
    int selecteur = 0;
    ArrayList myList;

    Liste(){
        myList = new ArrayList();
    }

    public void Premier(){
        selecteur = 0;
    }

    public void Dernier(){
        selecteur = myList.size()-1;
    }

    public void Suivant(){
        if(selecteur < myList.size()){
            selecteur++;
        }
    }

    public Object Supprimer(){
        myList.remove(selecteur);
        selecteur--;
        return myList.get(selecteur);
    }

    public void Ajouter(Object obj){
        myList.add(selecteur,obj);
    }

    public Object Afficher(int i){
        return myList.get(i);
    }
}
