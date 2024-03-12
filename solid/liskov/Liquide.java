package solid.liskov;

//Classe de base
public class Liquide {

    private double volume;

    public Liquide(){
        volume = 0;
    }

    //Cette méthode peut être utilisée avec tout double
    public void addVolume(double volume){
        this.volume += volume;
    }

}
