package solid.interfaceSegregation;

/*
* Cette interface est mauvaise.
* Elle regroupe trop de fonctionnalités qui sont indépendantes (essui-glace et frein par exemple)
* */
public interface MauvaiseInterface {
    public void appuiFrein();
    public void appuiAccelerateur();
    public void appuiEmbrayage();
    public void clignotantDroite();
    public void clignotantGauche();
    public void essuiGlace(int vitesse);
    public void tournerDroite(double angle);
    public void tournerGauche(double angle);
}
