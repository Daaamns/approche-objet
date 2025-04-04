package fr.diginamic.sets;

import fr.diginamic.annotations.StringUtils;
import fr.diginamic.annotations.ToString;

import java.lang.reflect.Field;

public class Pays2 {
    @ToString(uppercase = false, separator = " -> ")
    private String nom;
    @ToString(separator = " hab.")
    private int nbHabitants;
    @ToString(separator = " $")
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
        return StringUtils.generateToString(this);
    }
}
