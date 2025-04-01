package fr.diginamic.recensement.services;

import fr.diginamic.recensement.City;
import fr.diginamic.recensement.Recensement;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Top10VillesDepartement extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le code du département : ");
        String codeDept = scanner.nextLine();

        List<City> villesDept = recensement.getCitys().stream()
                .filter(v -> v.getCodeDepartement().equals(codeDept))
                .sorted(Comparator.comparingInt(City::getTotalPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());

        if (villesDept.isEmpty()) {
            System.out.println("Département non trouvé.");
        } else {
            System.out.println("\nTop 10 des villes les plus peuplées du département " + codeDept + " :");
            villesDept.forEach(v -> System.out.println(v.getNameCommune() + " - " + v.getTotalPopulation() + " habitants"));
        }
    }
}
