package fr.diginamic.recensement.services;

import fr.diginamic.recensement.City;
import fr.diginamic.recensement.Recensement;

import java.util.*;

public class Top10Regions extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> populations = new HashMap<>();

        for (City ville : recensement.getCitys()) {
            populations.put(ville.getNameRegion(), populations.getOrDefault(ville.getNameRegion(), 0) + ville.getTotalPopulation());
        }

        List<Map.Entry<String, Integer>> sortedRegions = new ArrayList<>(populations.entrySet());
        sortedRegions.sort((r1, r2) -> r2.getValue().compareTo(r1.getValue()));

        System.out.println("\nTop 10 des régions les plus peuplées :");
        for (int i = 0; i < Math.min(10, sortedRegions.size()); i++) {
            System.out.println((i + 1) + ". " + sortedRegions.get(i).getKey() + " - " + sortedRegions.get(i).getValue() + " habitants");
        }
    }
}
