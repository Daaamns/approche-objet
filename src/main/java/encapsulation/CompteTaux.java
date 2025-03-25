package encapsulation;

public class CompteTaux extends Compte {
    double renumTaux;

    public CompteTaux(long compteNum, double solde, double renumTaux) {
        super(compteNum, solde);
        this.renumTaux = renumTaux;
    }

    @Override
    public String toString() {
        return "Taux de Rénum" +
                "\n Taux : " + renumTaux +
                '\n' +  super.toString();
    }
}
