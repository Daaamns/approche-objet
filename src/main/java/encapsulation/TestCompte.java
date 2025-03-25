package encapsulation;

public class TestCompte {
    public static void main(String[] args) {
        Compte compte1 = new Compte(10255, 100.00);
        Compte compte2 = new CompteTaux(11023, 100_000.00, 2.5);
        Compte[] comptes = new Compte[2];
        comptes[0] = compte1;
        comptes[1] = compte2;

        for (Compte compte : comptes) {
            System.out.println(compte);
        }


//        compte1.setCompteNum(12456);
//        compte1.setSolde(1000.00);
//
//        System.out.println(compte1);
    }
}
