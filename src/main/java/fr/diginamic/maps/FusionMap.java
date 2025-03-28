package fr.diginamic.maps;

import java.util.HashMap;

public class FusionMap {
    public static void main(String args[]) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<>();
        for (Integer key : map1.keySet()) {
            map3.put(key, map1.get(key));
        }

        for (Integer key : map2.keySet()) {
            map3.put(key, map2.get(key));
        }

        System.out.println(map3);
    }
}
