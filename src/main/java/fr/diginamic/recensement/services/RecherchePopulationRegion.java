package fr.diginamic.recensement.services;

import fr.diginamic.recensement.City;
import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la région : ");
        String nomRegion = scanner.nextLine();

        int populationTotale = 0;
        for (City ville : recensement.getCitys()) {
            if (ville.getNameRegion().equalsIgnoreCase(nomRegion)) {
                populationTotale += ville.getTotalPopulation();
            }
        }

        if (populationTotale > 0) {
            System.out.println("Population totale de la région " + nomRegion + " : " + populationTotale + " habitants.");
        } else {
            System.out.println("Région non trouvée.");
        }
    }
}
