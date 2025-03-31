package fichier;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\h-mam\\OneDrive\\Bureau\\Diginamic-java\\approche-objet\\src\\main\\java\\fichier\\recensement.csv");
       List<String> lines = Files.readAllLines(path);
        List<Ville2> villes = new ArrayList<>();
//        boolean exists = Files.exists(path);
//        System.out.println(exists);
//
//        System.out.println(path.getRoot());
//        System.out.println(path.getParent());
//        System.out.println(path.getFileName());
//

        for (int i = 1; i < lines.size(); i++) { // Ignorer l'entête
            String[] tokens = lines.get(i).split(";");
            if (tokens.length >= 10) { // Vérifier que la ligne contient suffisamment de colonnes
                String nom = tokens[6];
                String codeDepartement = tokens[2];
                String nomRegion = tokens[1];
                int populationTotale = Integer.parseInt(tokens[9].replaceAll(" ", ""));

                Ville2 ville = new Ville2(nom, codeDepartement, nomRegion, populationTotale);
                villes.add(ville);
            }
        }

        // Affichage des villes pour vérification
        for (Ville2 ville : villes) {
            System.out.println(ville);
        }

        List<String> villesFiltrees = new ArrayList<>();
        villesFiltrees.add("Nom;Code Département;Nom Région;Population Totale"); // Entête

        for (Ville2 ville : villes) {
            if (ville.getPopulation() > 25000) {
                villesFiltrees.add(ville.getNom() + ";" + ville.getCodeDep() + ";" + ville.getRegion() + ";" + ville.getPopulation());
            }
        }

        Path outputPath = Paths.get("C:\\Users\\h-mam\\OneDrive\\Bureau\\Diginamic-java\\approche-objet\\src\\main\\java\\fichier\\villes_25000_plus.csv");
        Files.write(outputPath, villesFiltrees);

        System.out.println("Fichier généré avec succès : " + outputPath);

    }
}
