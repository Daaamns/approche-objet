package encapsulation;

public class TestCompte {
    public static void main(String[] args) {
        Compte compte1 = new Compte(10255, 100.00);

        compte1.setCompteNum(12456);
        compte1.setSolde(1000.00);

        System.out.println(compte1.getSolde());
        System.out.println(compte1.getCompteNum());
    }
}
