package solid.singleResponsability;

import java.util.ArrayList;

public class Imprimante{

    public Imprimante(){

    }

    /*
    Cette classe respecte le principe de responsabilité unique.
    Elle ne sera modifiée que si l'on souhaite changer le comportement d'impression.
    L'ajout de plus de types de documents, ou de nouvelles encres sera géré par les autres classes dédiées à ces responsabilités.
     */
    public void imprimer(Document document, Encre encre){
        String texteActuel = document.getTexte();
        document.setTexte(encre.texteCouleur(texteActuel));
    }
}
