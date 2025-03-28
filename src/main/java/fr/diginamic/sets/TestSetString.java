package fr.diginamic.sets;

import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("France");
        countries.add("Allemagne");
        countries.add("UK");
        countries.add("Italie");
        countries.add("Japon");
        countries.add("Chine");
        countries.add("Russie");
        countries.add("Inde");

        System.out.println("Ensemble initial : " + countries);

        String longestCountry = "";
        for (String country : countries) {
            if (country.length() > longestCountry.length()) {
                longestCountry = country;
            }
        }

        System.out.println("Pays avec le plus grand nombre de lettres : " + longestCountry);

        countries.remove(longestCountry);

        System.out.println("Ensemble après suppression : " + countries);
    }
}