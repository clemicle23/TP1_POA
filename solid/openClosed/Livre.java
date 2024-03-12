package solid.openClosed;

public class Livre {

    private String texte;

    public Livre(){

    }

    /*
     Cette fonction respecte le principe ouvert/fermé
     l'ajout d'un style est possible en créant un nouveau stylo sans changer cette classe
     */
    public void bienEcrire(Stylo stylo, String texte){
        this.texte = stylo.styleTexte(texte);
    }

    /*
    Cette fonction en respecte pas le principe ouvert-fermé.
    Afin de changer le style d'écriture, il serait nécessaire de modifier la fonction, ou d'en créer une nouvelle.
    En bref, il faudrait modifier cette classe.
     */
    public void malEcrire(String texte){
        this.texte = texte + " pas de style";
    }
}
