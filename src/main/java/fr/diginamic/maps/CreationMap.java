package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {

        HashMap<String, Integer> mapSalaire = new HashMap();

        mapSalaire.put("Paul", 100);
        mapSalaire.put("Hicham", 100);
        mapSalaire.put("Yu", 100);
        mapSalaire.put("Ingrid", 100);
        mapSalaire.put("Chantal", 100);

        System.out.println(mapSalaire);


    }
}
