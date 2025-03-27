package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calcul = new CalculMoyenne();

        calcul.ajout(10);
        calcul.ajout(20);
        calcul.ajout(30);

        System.out.println(calcul.calculMoyenne());
    }
}
