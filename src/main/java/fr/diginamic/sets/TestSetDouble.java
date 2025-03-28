package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {
    public static void main(String[] args) {
        Set<Double> numbers = new HashSet<>();
        numbers.add(1.5);
        numbers.add(8.25);
        numbers.add(-7.32);
        numbers.add(13.3);
        numbers.add(-12.45);
        numbers.add(48.5);
        numbers.add(0.01);

        System.out.println("Ensemble initial : " + numbers);

        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Le plus grand élément : " + max);

        double min = Double.MAX_VALUE;
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        numbers.remove(min);
        System.out.println("Suppression du plus petit élément : " + min);

        System.out.println("Ensemble après suppression : " + numbers);
    }
}
