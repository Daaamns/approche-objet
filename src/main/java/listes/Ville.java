package listes;

public class Ville implements Comparable<Ville>{
    String nom;
    int nbHabitant;

    public Ville(String nom, int nbHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    @Override
    public String toString() {
        return nom + " avec " + nbHabitant + " habitants";
    }

    @Override
    public int compareTo(Ville ville) {
//       return this.nom.compareTo(ville.nom);
         return Integer.compare(this.nbHabitant, ville.nbHabitant);
    }
}
