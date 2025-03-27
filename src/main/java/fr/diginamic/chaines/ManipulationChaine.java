package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {

    String chaine = "Durand;Marcel;2 523.5";

    char premierCaractere = chaine.charAt(0);
    System.out.println("Premier caractère: " + premierCaractere);

        System.out.println(chaine.length());
        System.out.println(chaine.indexOf(';'));
        System.out.println(chaine.substring(0, chaine.length() - 1));

        String nom = chaine.substring(0, chaine.indexOf(';')).toUpperCase();
//        String nom = chaine.substring(0, chaine.indexOf(';')).toLowerCase();

        System.out.println(chaine.split(";")[0]);

        String newStart = chaine.substring(chaine.indexOf(';') + 1, chaine.length() -1);
        String prenom = newStart.substring(0, newStart.indexOf(';'));

        String lastPart = newStart.substring(newStart.indexOf(';') + 1, newStart.length() -1);
        System.out.println(lastPart);
        String replaceWhiteSpace = lastPart.replaceAll(" ", "");
        double salaire = Double.parseDouble(replaceWhiteSpace);
        Salarie salarier = new Salarie(nom, prenom, salaire);
    }
}
