package solid.singleResponsability;

public class Encre {
    private String couleur;

    public Encre(){

    }

    public String texteCouleur(String texte){
        return(texte + " " + couleur);
    }
}
