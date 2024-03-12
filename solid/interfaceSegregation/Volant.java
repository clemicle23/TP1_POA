package solid.interfaceSegregation;

//Cette interface ne regroupe que les contrôles directs du volant
public interface Volant {
    public void tournerDroite(double angle);
    public void tournerGauche(double angle);
}
