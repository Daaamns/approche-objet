package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class TestListString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Nice");
        list.add("Carcassonne");
        list.add("Narbonne");
        list.add("Lyon");
        list.add("Foix");
        list.add("Pau");
        list.add("Marseille");
        list.add("Tarbes");

//        String search = "";
//        AtomicReference<String> search = new AtomicReference<>("");
//
//        list.forEach(x -> {
//            if ((x.length() > search.get().length())) {
//                search.set(x);
//
//            }
//        });

        String villePlusLongue = list.stream()
                .max((v1, v2) -> Integer.compare(v1.length(), v2.length()))
                .orElse("Aucune ville");

        System.out.println("La ville avec le plus grand nombre de lettres est : " + villePlusLongue);

//          Méthode simple
//        for (String ville : list) {
//            if (ville.length() > search.length()) {
//                search = ville;
//            }
//        }


//          Méthode simple
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, list.get(i).toUpperCase());
//        }


        list.replaceAll(String::toUpperCase);
        System.out.println(list);

        list.removeIf(x -> x.startsWith("N"));
        System.out.println(list);


    };
}