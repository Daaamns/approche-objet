package equals;

public class TestEqualsPays {
    public static void main(String[] args) {
        Pays france = new Pays("France", 67000000);
        Pays france2 = new Pays("France", 67000000);
        Pays allemagne = new Pays("Allemagne", 83000000);

        System.out.println(france.equals(france2)); // true
        System.out.println(france.equals(allemagne)); // false

        System.out.println("france == france2 : " + (france == france2)); // false (références différentes)
        System.out.println("france == allemagne : " + (france == allemagne)); // false

        Pays france3 = france;
        System.out.println("france == france3 : " + (france == france3)); // true (même référence)
    }
}
