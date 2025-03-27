package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    double salaireMount;


    public Salarie(String nom, String prenom, double salaireMount) {
        super(nom, prenom);
        this.salaireMount = salaireMount;
    }

    @Override
    public double getSalaire() {
        return salaireMount;

    }

    @Override
    protected String getStatut() {
        return "Salarie";
    }
}
