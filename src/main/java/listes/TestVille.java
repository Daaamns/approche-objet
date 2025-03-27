package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestVille {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice", 343000)) ;
        villes.add(new Ville("Carcassonne", 47800)) ;
        villes.add(new Ville("Narbonne", 53400)) ;
        villes.add(new Ville("Lyon", 484000)) ;
        villes.add(new Ville("Foix", 9700 )) ;
        villes.add(new Ville("Pau", 77200 )) ;
        villes.add(new Ville("Marseille", 850700)) ;
        villes.add(new Ville("Tarbes", 40600 )) ;

        Ville villePlusHabitant = villes.stream()
                .max(Comparator.comparingInt(ville -> ville.nbHabitant))
                .orElse(null);

        System.out.println(villePlusHabitant);

        Ville villeMoinsHabitant = villes.stream()
                .min(Comparator.comparingInt(ville -> ville.nbHabitant))
                .orElse(null);

        if (villeMoinsHabitant != null) {
            villes.remove(villeMoinsHabitant);
//            System.out.println("La ville " + villeMoinsHabitant + " a été supprimée.");
        }

//        System.out.println(villes);


//        Méthode simple
//        for (Ville ville : villes) {
//            if (ville.nbHabitant > 100000) {
//                ville.nom = ville.nom.toUpperCase();
//            }
//        }

        villes.stream()
                .filter(ville -> ville.nbHabitant > 100000)
                .forEach(ville -> ville.nom = ville.nom.toUpperCase());
//        System.out.println(villes);


        List<Ville> villesFiltrees = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.nbHabitant > 400000) {
                villesFiltrees.add(ville);
            }
        }

        villesFiltrees.sort(Comparator.comparingInt(Ville::getNbHabitant).reversed());
        System.out.println(villesFiltrees);


        Collections.sort(villes);

        System.out.println(villes);
    }
}
