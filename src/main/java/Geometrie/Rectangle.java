package Geometrie;

public class Rectangle implements ObjetGeometrique{
    private double largeur;
    private double longueur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }
}
