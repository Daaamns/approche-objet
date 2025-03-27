package entites;

public class Theatre {
    public String nom;
    public int maxCapacity;
    public int totalClient;
    public double recette;

    public Theatre(String nom, int maxCapacity, int totalClient, double recette) {
        this.nom = nom;
        this.maxCapacity = maxCapacity;
        this.totalClient = totalClient;
        this.recette = recette;
    }

    public void inscrire(int nbClient, int prixPlace) {
        if (totalClient + nbClient <= maxCapacity) {
            totalClient += nbClient;
            recette += nbClient * prixPlace;
            System.out.println(nbClient + " clients inscrits avec succès !");
        } else {
            System.out.println("Erreur : Capacité maximale atteinte. Impossible d'inscrire " + nbClient + " clients.");
        }
    }

    public int getTotalClient() {
        return totalClient;
    }

    public double getRecette() {
        return recette;
    }
}
