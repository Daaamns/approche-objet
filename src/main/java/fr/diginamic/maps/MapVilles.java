package fr.diginamic.maps;

import listes.Ville;

import java.util.*;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> map = new HashMap<>();

        map.put("aaa", new Ville("Nice", 343000));
        map.put("bbb", new Ville("Carcassonne", 47800));
        map.put("ccc", new Ville("Narbonne", 53400));
        map.put("ddd", new Ville("Lyon", 484000));
        map.put("eee", new Ville("Foix", 9700));


        Map.Entry<String, Ville> villeMin = Collections.min(
                map.entrySet(),
                Comparator.comparing(entry -> entry.getValue().getNbHabitant())
        );

        // Supprimer la ville trouvée
        System.out.println(map.size());
        map.remove(villeMin.getKey());
        System.out.println(map.size());

        System.out.println("La ville supprimée est : " + villeMin.getKey());

        // Affichage des villes restantes
        System.out.println("Villes restantes dans la map :");
        map.forEach((key, value) -> System.out.println(key + " - " + value.getNbHabitant() + " habitants"));

//        int minHabitants = Integer.MAX_VALUE;
//        Iterator<City> iterator = map.values().iterator();
//        while (iterator.hasNext()) {
//            City ville = iterator.next();
//            City villeToRemove;
//            if (iterator.next().getNbHabitant() < ville.getNbHabitant()) {
//                villeToRemove = iterator.next();
//            }
//        }
//        map.values().forEach(x -> x. );



    }
}
