package solid.interfaceSegregation;

//Cette interface ne regroupe que les commandes de l'ordinateur de bord
public interface Commandes {
    public void clignotantDroite();
    public void clignotantGauche();
    public void essuiGlace(int vitesse);
}
