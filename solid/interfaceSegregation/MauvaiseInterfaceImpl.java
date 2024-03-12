package solid.interfaceSegregation;

/*Cette mauvaise implémentation n'a pas besoin de toutes les méthodes,
* mais doit les importer et les implémenter en raison d'une mauvaise interface
*/
 public class MauvaiseInterfaceImpl implements MauvaiseInterface{

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
    public void clignotantDroite() {

    }

    @Override
    public void clignotantGauche() {

    }

    @Override
    public void essuiGlace(int vitesse) {

    }

    //La classe n'a pas besoin de cette fonction, mais elle doit être implémentée
    @Override
    public void tournerDroite(double angle) {

    }

    //La classe n'a pas besoin de cette fonction, mais elle doit être implémentée
    @Override
    public void tournerGauche(double angle) {

    }
}
