package encapsulation;

public class Compte {
    long compteNum;
    double solde;

    public Compte(long compteNum, double solde) {
        this.compteNum = compteNum;
        this.solde = solde;
    }

    public void setCompteNum(long compteNum) {
        this.compteNum = compteNum;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public long getCompteNum() {
        return compteNum;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte " +
                "\n Numero de compte : " + compteNum +
                "\n Solde de compte : " + solde;
    }
}
