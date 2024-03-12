package solid.singleResponsability;

public class Document {
    private String type;
    private String texte;

    public void setTexte(String texte){
        this.texte = texte;
    }

    public String getTexte(){
        return this.texte;
    }
}
