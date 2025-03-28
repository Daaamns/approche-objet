package entites;

public class Pays {
    private String nom;
    private int nbHabitant;
    private String continent;

    public Pays(String nom, int nbHabitant, String continent) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public String getContinent() {
        return continent;
    }
}
