package fr.diginamic.maps;

import listes.Ville;

import java.util.*;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> map = new HashMap<>();

        map.put("Nice", new Ville("Nice", 343000));
        map.put("Carcassonne", new Ville("Carcassonne", 47800));
        map.put("Narbonne", new Ville("Narbonne", 53400));
        map.put("Lyon", new Ville("Lyon", 484000));
        map.put("Foix", new Ville("Foix", 9700));


        Map.Entry<String, Ville> villeMin = Collections.min(
                map.entrySet(),
                Comparator.comparing(entry -> entry.getValue().getNbHabitant())
        );

        // Supprimer la ville trouvée
        map.remove(villeMin.getKey());

        System.out.println("La ville supprimée est : " + villeMin.getKey());

        // Affichage des villes restantes
        System.out.println("Villes restantes dans la map :");
        map.forEach((key, value) -> System.out.println(key + " - " + value.getNbHabitant() + " habitants"));

//        int minHabitants = Integer.MAX_VALUE;
//        Iterator<Ville> iterator = map.values().iterator();
//        while (iterator.hasNext()) {
//            Ville ville = iterator.next();
//            Ville villeToRemove;
//            if (iterator.next().getNbHabitant() < ville.getNbHabitant()) {
//                villeToRemove = iterator.next();
//            }
//        }
//        map.values().forEach(x -> x. );



    }
}
