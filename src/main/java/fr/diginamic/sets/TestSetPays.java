package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetPays {
    public static void main(String[] args) {
        Set<Pays2> paysSet = new HashSet<>();
        paysSet.add(new Pays2("USA", 331_000_000, 63_000));
        paysSet.add(new Pays2("France", 67_000_000, 43_000));
        paysSet.add(new Pays2("Allemagne", 83_000_000, 46_000));
        paysSet.add(new Pays2("UK", 66_000_000, 42_000));
        paysSet.add(new Pays2("Italie", 60_000_000, 35_000));
        paysSet.add(new Pays2("Japon", 126_000_000, 41_000));
        paysSet.add(new Pays2("Chine", 1_400_000_000, 10_000));
        paysSet.add(new Pays2("Russie", 144_000_000, 11_000));
        paysSet.add(new Pays2("Inde", 1_380_000_000, 2_000));

        // Trouver le pays avec le PIB/habitant le plus élevé
        Pays2 paysPibHabMax = paysSet.stream()
                .max((p1, p2) -> Double.compare(p1.getPibParHabitant(), p2.getPibParHabitant()))
                .orElse(null);

        System.out.println("Pays avec le PIB/habitant le plus élevé : " + paysPibHabMax);

        // Trouver le pays avec le PIB total le plus élevé
        Pays2 paysPibTotalMax = paysSet.stream()
                .max((p1, p2) -> Double.compare(p1.getPibTotal(), p2.getPibTotal()))
                .orElse(null);

        System.out.println("Pays avec le PIB total le plus élevé : " + paysPibTotalMax);

        // Trouver le pays avec le PIB total le plus faible
        Pays2 paysPibTotalMin = paysSet.stream()
                .min((p1, p2) -> Double.compare(p1.getPibTotal(), p2.getPibTotal()))
                .orElse(null);

        // Mettre en majuscule le pays avec le PIB total le plus faible
        if (paysPibTotalMin != null) {
            paysSet.remove(paysPibTotalMin);
            paysPibTotalMin.setNom(paysPibTotalMin.getNom().toUpperCase());
            paysSet.add(paysPibTotalMin);
        }

        // Supprimer le pays avec le PIB total le plus élevé
        if (paysPibTotalMax != null) {
            paysSet.remove(paysPibTotalMax);
        }

        // Affichage de l'ensemble des pays modifiés
        System.out.println("\nPays après modifications :");
        for (Pays2 pays : paysSet) {
            System.out.println(pays);
        }
    }
}
