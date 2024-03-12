package solid.liskov;

public class Cafe extends Liquide{
    public Cafe(){
        this.addVolume(500);
    }


    /* Cette méthode respecte le principe de substitution, elle fonctionne bien avec tout double
     * (même si les doubles <0 ne feront rien)
     */
    public void addVolume(double volume){
        if (volume > 0){
            super.addVolume(0);
        }
    }
}
