package solid.openClosed;

public class Stylo {

    private String style;

    public Stylo(){
    }

    public String styleTexte(String texte){
        return(texte + style);
    }

    public void setStyle(String style){
        this.style = style;
    }
}
