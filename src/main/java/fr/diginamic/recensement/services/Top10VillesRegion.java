package fr.diginamic.recensement.services;

import fr.diginamic.recensement.City;
import fr.diginamic.recensement.Recensement;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Top10VillesRegion extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la région : ");
        String nomRegion = scanner.nextLine();

        List<City> villesRegion = recensement.getCitys().stream()
                .filter(v -> v.getNameRegion().equalsIgnoreCase(nomRegion))
                .sorted(Comparator.comparingInt(City::getTotalPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());

        if (villesRegion.isEmpty()) {
            System.out.println("Région non trouvée.");
        } else {
            System.out.println("\nTop 10 des villes les plus peuplées de la région " + nomRegion + " :");
            villesRegion.forEach(v -> System.out.println(v.getNameCommune() + " - " + v.getTotalPopulation() + " habitants"));
        }
    }
}
