package solid.liskov;

import java.security.InvalidParameterException;

/*
* Cette classe ne respecte pas le principe de substitution de Liskov.
* Elle ajoute une précondition plus forte à la méthode liquide (volume >= 0),
* ce qui peut créer des effets indésirables ou même casser le programme.
* */
public class Chocolat extends Liquide{

    public Chocolat(){
        this.addVolume(500);
    }

    /* Cette méthode ajoute une précondition + restrictive et lance une exception qui n'est pas un sous-type
     * d'une exception de la méthode addVolume de Liquide (puisqu'elle n'en lance pas).
     * Elle ne respecte donc pas le principe de substitution de Liskov*/
    public void addVolume(double volume) throws InvalidParameterException {
        if (volume < 0){
            throw new InvalidParameterException();
        }
        else{
            super.addVolume(volume);
        }
    }
}
