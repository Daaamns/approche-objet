package fr.diginamic;

public class TestStringBuilder {
    public static void main(String[] args) {
        // Chronométrage avec StringBuilder
        long debutSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }
        long finSB = System.currentTimeMillis();
        System.out.println("Temps écoulé avec StringBuilder : " + (finSB - debutSB) + " ms");

        // Chronométrage avec String et opérateur +
        long debutStr = System.currentTimeMillis();
        String str = "";
        for (int i = 1; i <= 100000; i++) {
            str += i;
        }
        long finStr = System.currentTimeMillis();
        System.out.println("Temps écoulé avec String : " + (finStr - debutStr) + " ms");
    }
}
