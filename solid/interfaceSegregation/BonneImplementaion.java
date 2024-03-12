package solid.interfaceSegregation;

/* Cette implémentation est bonne.
 * Grâce à la ségrégation d'interfaces,
 * on n'importe que les méthodes nécessaires et on évite les implémentations inutiles
 */
public class BonneImplementaion implements  Commandes,Pedales,Volant{
    @Override
    public void clignotantDroite() {

    }

    @Override
    public void clignotantGauche() {

    }

    @Override
    public void essuiGlace(int vitesse) {

    }

    @Override
    public void appuiFrein() {

    }

    @Override
    public void appuiAccelerateur() {

    }

    @Override
    public void appuiEmbrayage() {

    }

    @Override
    public void tournerDroite(double angle) {

    }

    @Override
    public void tournerGauche(double angle) {

    }
}
