package fichier;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\h-mam\\OneDrive\\Bureau\\Diginamic-java\\approche-objet\\src\\main\\java\\fichier\\recensement.csv");
        Path outputPath = Paths.get("C:\\Users\\h-mam\\OneDrive\\Bureau\\Diginamic-java\\approche-objet\\src\\main\\java\\fichier\\recensement_100_premieres_lignes.csv");

        List<String> lines = Files.readAllLines(inputPath);

        Files.write(outputPath, lines.subList(0, Math.min(100, lines.size())));

        System.out.println("Fichier généré avec succès : " + outputPath);

    }
}
