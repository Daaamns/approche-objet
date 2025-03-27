package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOpeartions {
    public static void main(String[] args) {
        System.out.println("5 + 3 = " + Operations.calcul(5, 3, '+'));
        System.out.println("10 - 4 = " + Operations.calcul(10, 4, '-'));
        System.out.println("6 * 2 = " + Operations.calcul(6, 2, '*'));
        System.out.println("8 / 2 = " + Operations.calcul(8, 2, '/'));
    }
}
