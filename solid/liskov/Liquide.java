package solid.liskov;

public class Liquide {

    private double volume;

    public Liquide(){
        volume = 0;
    }

    public void addVolume(double volume){
        this.volume += volume;
    }

}
