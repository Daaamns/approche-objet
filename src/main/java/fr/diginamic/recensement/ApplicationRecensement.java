package fr.diginamic.recensement;

import fr.diginamic.recensement.services.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) {
        Recensement recensement = chargerRecensement();

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n===== MENU RECENSEMENT =====");
            System.out.println("1. Population d’une ville donnée");
            System.out.println("2. Population d’un département donné");
            System.out.println("3. Population d’une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine();

            MenuService service = null;

            switch (choix) {
                case 1 -> service = new RecherchePopulationVille();
                case 2 -> service = new RecherchePopulationDepartement();
                case 3 -> service = new RecherchePopulationRegion();
                case 4 -> service = new Top10Regions();
                case 5 -> service = new Top10Departements();
                case 6 -> service = new Top10VillesDepartement();
                case 7 -> service = new Top10VillesRegion();
                case 8 -> service = new Top10VillesFrance();
                case 9 -> System.out.println("Au revoir !");
                default -> System.out.println("Option invalide, veuillez réessayer.");
            }

            if (service != null) {
                service.traiter(recensement, scanner);
            }

        } while (choix != 9);

        scanner.close();
    }

    private static Recensement chargerRecensement() {
        Recensement recensement = new Recensement();
        Path path = Paths.get("C:\\Users\\h-mam\\OneDrive\\Bureau\\Diginamic-java\\approche-objet\\src\\main\\java\\fichier\\recensement.csv");

        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 1; i < lines.size(); i++) {
                String[] tokens = lines.get(i).split(";");
                if (tokens.length >= 10) {
                    String codeRegion = tokens[0];
                    String nomRegion = tokens[1];
                    String codeDepartement = tokens[2];
                    String codeCommune = tokens[5];
                    String nomCommune = tokens[6];
                    int population = Integer.parseInt(tokens[9].replaceAll(" ", ""));

                    City ville = new City(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population);
                    recensement.ajouterCity(ville);
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur lors du chargement du fichier : " + e.getMessage());
        }

        return recensement;
    }

}
