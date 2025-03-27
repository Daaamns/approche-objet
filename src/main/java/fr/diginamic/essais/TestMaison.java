package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {

        Piece piece1 = new Chambre(200, 1);
        Piece piece2 = new SalleDeBain(140, 1);
        Piece piece3 = new Cuisine(205, 1);
        Piece piece4 = new Salon(485, 1);
        Piece piece7 = new Wc(521, 1);
        Piece piece5 = new Cuisine(652, 2);
        Piece piece6 = new Salon(412, 2);
        Piece piece8 = new Wc(423, 2);
        Piece piece9 = new Chambre(165, 2);
        Piece piece10 = new SalleDeBain(123, 2);

        Maison maison1 = new Maison();
        Maison maison2 = new Maison();

        maison1.ajouterPiece(piece1);
        maison1.ajouterPiece(piece2);
        maison1.ajouterPiece(piece3);
        maison1.ajouterPiece(piece4);
        maison1.ajouterPiece(piece5);

        maison2.ajouterPiece(piece7);
        maison2.ajouterPiece(piece6);
        maison2.ajouterPiece(piece8);
        maison2.ajouterPiece(piece9);
        maison2.ajouterPiece(piece10);

        System.out.println(maison1.afficherSuperficie());
        System.out.println(maison2.afficherSuperficie());


        System.out.println(maison1.afficherSuperficieEtage(1));
        System.out.println(maison2.afficherSuperficieEtage(1));

        System.out.println("Superficie totale des chambres : " + maison1.afficherSuperficieParType(Chambre.class));
        System.out.println("Nombre de chambres : " + maison1.compterPiecesParType(Chambre.class));

    }
}
