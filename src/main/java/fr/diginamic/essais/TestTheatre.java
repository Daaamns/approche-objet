package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
    Theatre theatre = new Theatre("Adam", 10, 0, 0);


        theatre.inscrire(3, 10);
        theatre.inscrire(5, 10);
        theatre.inscrire(2, 10);
        theatre.inscrire(1, 10);
        theatre.inscrire(2, 10);

        System.out.println("Total de clients inscrits : " + theatre.getTotalClient());
        System.out.println("Recette totale du théâtre : " + theatre.getRecette() + " €");
    }

}
