package fr.diginamic.salaire;

public abstract class Intervenant {
    String nom;
    String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double getSalaire();

    public void afficherDonnees() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Salaire: " + getSalaire());
        System.out.println("Statut: " + getStatut());
    }

    protected abstract String getStatut();


}
