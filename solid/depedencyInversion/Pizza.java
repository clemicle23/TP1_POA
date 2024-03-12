package solid.depedencyInversion;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Module de bas niveau
public class Pizza extends Preparation{
    private ArrayList<String> ingredients;

    public Pizza(ArrayList<String> ingredients){
        this.ingredients = ingredients;

    }
}
