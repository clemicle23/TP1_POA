package solid.liskov;

import java.util.ArrayList;

//Client
public class Distributeur {

    private ArrayList<Liquide> liquides;

    public Distributeur(){
        liquides = new ArrayList<Liquide>(2);
        Cafe cafe = new Cafe();
        Chocolat chocolat = new Chocolat();
        liquides.add(cafe);
        liquides.add(chocolat);
    }

    public void addLiquide(Liquide liquide){
        liquides.add(liquide);
    }

    /*
     * Ici, le non-respect du principe de substitution de Liskov cause des problèmes.
     */
    public void addVolume(int index, double volume){
        if (index >= liquides.size()){
            System.out.println("Numéro de liquide trop grand");
        }
        else{
            //Ceci peut causer une erreur si volume < 0 et que le liquide est un chocolat
            liquides.get(index).addVolume(volume);
        }
    }

}