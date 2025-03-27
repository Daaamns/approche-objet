package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    double [] arrDouble = new double[0];


    public void ajout(double a) {
        double [] newArray = Arrays.copyOf(arrDouble, arrDouble.length + 1);

        newArray[newArray.length - 1] = a;
        arrDouble = newArray;
    }

    public double calculMoyenne() {
        double result = Arrays.stream(arrDouble).reduce(0, (a, b) -> a + b);
        System.out.println(result);
        return result / arrDouble.length;
    }
}
