import java.awt.*;

//deze klasse pas je niet aan!
public class Schijf {
    private double x,y,r;
    private Color kleur;

    public Schijf(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.kleur = Color.BLACK;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public double getOmtrek(){
        return 2*r*Math.PI;
    }

    public double getOppervlakte(){
        return r*r*Math.PI;
    }

    public Color getKleur() {
        return kleur;
    }

    public void setKleur(Color kleur) {
        this.kleur = kleur;
    }
}
