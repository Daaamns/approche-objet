package fr.diginamic.recensement;

public class City {
    private String codeRegion;
    private String nameRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nameCommune;
    private int totalPopulation;

    public City(String codeRegion, String nameRegion, String codeDepartement, String codeCommune, String nameCommune, int totalPopulation) {
        this.codeRegion = codeRegion;
        this.nameRegion = nameRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nameCommune = nameCommune;
        this.totalPopulation = totalPopulation;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public String getNameCommune() {
        return nameCommune;
    }

    public int getTotalPopulation() {
        return totalPopulation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("codeRegion='").append(codeRegion).append('\'');
        sb.append(", nameRegion='").append(nameRegion).append('\'');
        sb.append(", codeDepartement='").append(codeDepartement).append('\'');
        sb.append(", codeCommune='").append(codeCommune).append('\'');
        sb.append(", nameCommune='").append(nameCommune).append('\'');
        sb.append(", totalPopulation='").append(totalPopulation).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
