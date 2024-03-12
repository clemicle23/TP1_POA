package solid.depedencyInversion;

import java.util.ArrayList;

//Le four représente un module de haut niveau
public class Four {

    public Four(){
    }

    /*
    Cette fonction respecte le principe d'inversion de dépendances.
    Il n'est pas nécessaire de connaître les pizzas ou les gateaux pour l'utiliser.
     */
    public void cuitPreparation(Preparation preparation, double temps){
        preparation.chauffePreparation(temps);
    }

    /*
    Cette fonction ne respecte pas le principe d'inversion de dépendances.
    Elle nécessite de connaître le module de bas niveau Pizza pour être utilisée.
    Cela peut poser problème pour la maintenabilité.
     */
    public void cuitUnePizza(ArrayList<String> ingredients, double temps){
        Pizza pizza = new Pizza(ingredients);
        pizza.chauffePreparation(temps);
    }
}
