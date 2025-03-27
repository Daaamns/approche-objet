package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salarier = new Salarie("Hemamou", "Adam", 2400);
        salarier.afficherDonnees();

        Pigiste pigiste = new Pigiste("PasHemamou", "PasAdam", 10, 100);
        pigiste.afficherDonnees();
    }
}
