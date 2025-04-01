package fr.diginamic.recensement.services;

import fr.diginamic.recensement.City;
import fr.diginamic.recensement.Recensement;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Top10VillesFrance extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<City> topVilles = recensement.getCitys().stream()
                .sorted(Comparator.comparingInt(City::getTotalPopulation).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("\nTop 10 des villes les plus peuplées de France :");
        topVilles.forEach(v -> System.out.println(v.getNameCommune() + " - " + v.getTotalPopulation() + " habitants"));
    }
}
