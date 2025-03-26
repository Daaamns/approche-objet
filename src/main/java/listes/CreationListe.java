package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {
       List<Integer> liste = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            liste.add(i);
        }
        System.out.println(liste.size());

    }
}
