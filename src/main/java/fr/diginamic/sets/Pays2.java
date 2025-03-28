package fr.diginamic.sets;

public class Pays2 {
    private String nom;
    private int nbHabitants;
    private double pibParHabitant;

    public Pays2(String nom, int nbHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHabitant = pibParHabitant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public double getPibParHabitant() {
        return pibParHabitant;
    }

    public double getPibTotal() {
        return nbHabitants * pibParHabitant;
    }

    @Override
    public String toString() {
        return nom + " - Habitants: " + nbHabitants + " - PIB/Hab: " + pibParHabitant + " - PIB Total: " + getPibTotal();
    }
}
