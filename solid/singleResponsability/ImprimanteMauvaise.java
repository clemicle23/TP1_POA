package solid.singleResponsability;

public class ImprimanteMauvaise {

    public ImprimanteMauvaise(){

    }

    /*
    Cette classe ne respecte pas le principe de responsabilité unique.
    La méthode devra être modifiée si l'on veut ajouter de nouveaux types de documents
    ou modifier un comportement pour un type en particulier.
    Elle devra également être modifiée si on veut rajouter des encres ou changer leur comportement.
    Enfin, elle devra être modifiée si l'on souhaite changer le code servant à imprimer.
     */
    public void imprimer(String document, String encre){
        switch(document){
            case "PDF":
                //Code spécifique aux PDF
                break;
            case "ODT":
                //Code spécifique au format ODT
                break;
            default:
                //Code par défaut
                break;
        }
        switch(encre){
            case "N&B":
                //Code pour faire du noir et blanc
                break;
            case "couleur":
               //Code pour imprimer en couleur
               break;
            case "negatif":
                //Code pour imprimer en négatif
                break;
            default:
                //Code par défaut
                break;
        }
        //Code pour imprimer
    }
}
