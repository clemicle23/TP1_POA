package solid.liskov;

import java.util.ArrayList;

public class Distributeur {

    private ArrayList<Liquide> liquides;

    public Distributeur(){
        Cafe cafe = new Cafe();
        Chocolat chocolat = new Chocolat();
        liquides.add(cafe);
        liquides.add(chocolat);
    }

    public void addLiquide(Liquide liquide){
        liquides.add(liquide);
    }

}