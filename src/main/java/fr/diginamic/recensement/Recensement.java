package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
    private List<City> villes = new ArrayList<>();

    public List<City> getCitys() {
        return villes;
    }

    public void ajouterCity(City ville) {
        villes.add(ville);
    }
}
