package fr.diginamic.maps;

import entites.Pays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {
    public static void main(final String[] args) {

        List<Pays> pays = new ArrayList<Pays>();
        pays.add(new Pays("France",65_000_000,"Europe" ));
        pays.add(new Pays("Allemagne",80_000_000,"Europe" ));
        pays.add(new Pays("Belgique",10_000_000,"Europe" ));

        pays.add(new Pays("Russie",150_000_000,"Asie" ));
        pays.add(new Pays("Chine",1_400_000_000,"Asie" ));
        pays.add(new Pays("Indonesie",220_000_000,"Océanie" ));
        pays.add(new Pays("Australie",20_000_000,"Océanie" ));


        Map<String, Integer> comptagePays = new HashMap<>();

        // Boucle sur la liste des pays
        for (Pays p : pays) {
            String continent = p.getContinent();
            // Si le continent existe déjà, on incrémente son compteur
            comptagePays.put(continent, comptagePays.getOrDefault(continent, 0) + 1);
        }

        // Affichage des résultats
        System.out.println("Nombre de pays par continent :");
        for (Map.Entry<String, Integer> entry : comptagePays.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " pays");
        }




    }
}
