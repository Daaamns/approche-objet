package fr.diginamic.recensement.services;

import fr.diginamic.recensement.City;
import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le code du département : ");
        String codeDept = scanner.nextLine();

        int populationTotale = 0;
        for (City ville : recensement.getCitys()) {
            if (ville.getCodeDepartement().equals(codeDept)) {
                populationTotale += ville.getTotalPopulation();
            }
        }

        if (populationTotale > 0) {
            System.out.println("Population totale du département " + codeDept + " : " + populationTotale + " habitants.");
        } else {
            System.out.println("Département non trouvé.");
        }
    }
}
