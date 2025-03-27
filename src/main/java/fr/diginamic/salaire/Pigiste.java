package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    int nbJourTravaille;
    double jourSalaryMount;


    public Pigiste(String nom, String prenom, int nbJourTravaille, double jourSalaryMount) {
        super(nom, prenom);
        this.nbJourTravaille = nbJourTravaille;
        this.jourSalaryMount = jourSalaryMount;
    }

    @Override
    public double getSalaire() {
        return jourSalaryMount * nbJourTravaille;
    }

    @Override
    protected String getStatut() {
        return "Pigiste";
    }
}
