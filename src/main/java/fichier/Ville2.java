package fichier;

public class Ville2 {
    private String nom;
    private String codeDep;
    private String region;
    private int population;


    public Ville2(String nom, String codeDep, String region, int population) {
        this.nom = nom;
        this.codeDep = codeDep;
        this.region = region;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDep() {
        return codeDep;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ville2{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", codeDep='").append(codeDep).append('\'');
        sb.append(", region='").append(region).append('\'');
        sb.append(", population=").append(population);
        sb.append('}');
        return sb.toString();
    }
}

