package fr.diginamic.recensement.services;

import fr.diginamic.recensement.City;
import fr.diginamic.recensement.Recensement;

import java.util.*;

public class Top10Departements extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> populations = new HashMap<>();

        for (City ville : recensement.getCitys()) {
            populations.put(ville.getCodeDepartement(), populations.getOrDefault(ville.getCodeDepartement(), 0) + ville.getTotalPopulation());
        }

        List<Map.Entry<String, Integer>> sortedDepartements = new ArrayList<>(populations.entrySet());
        sortedDepartements.sort((d1, d2) -> d2.getValue().compareTo(d1.getValue())); // Tri décroissant

        System.out.println("\nTop 10 des départements les plus peuplés :");
        for (int i = 0; i < Math.min(10, sortedDepartements.size()); i++) {
            System.out.println((i + 1) + ". Département " + sortedDepartements.get(i).getKey() + " - " + sortedDepartements.get(i).getValue() + " habitants");
        }
    }
}
