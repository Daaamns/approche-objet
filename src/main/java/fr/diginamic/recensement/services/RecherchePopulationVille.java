package fr.diginamic.recensement.services;

import fr.diginamic.recensement.City;
import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la ville : ");
        String nomVille = scanner.nextLine();

        for (City ville : recensement.getCitys()) {
            if (ville.getNameCommune().equalsIgnoreCase(nomVille)) {
                System.out.println("Population de " + nomVille + " : " + ville.getTotalPopulation() + " habitants.");
                return;
            }
        }
        System.out.println("Ville non trouvée.");
    }
}
