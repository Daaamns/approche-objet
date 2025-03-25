package entites2;

import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(10, "Rue des Lilas", "75000", "Paris");
        AdressePostale adresse2 = new AdressePostale(15, "Avenue de la République", "69000", "Lyon");

        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Martin", "Sophie", adresse2);

        personne1.afficherPersonne();
        personne2.afficherPersonne();

        personne1.setAdresse(adresse2);

        System.out.println("Nouvelle adresse de " + personne1.getNom() + ": " + personne1.getAdresse());
        System.out.println("Adresse de " + personne2.getNom() + ": " + personne2.getAdresse());
    }
}
