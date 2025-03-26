package equals;

import java.util.Objects;

public class Pays {
    String name;
    int population;

    public Pays(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; // Vérification si c'est le même objet
        if (obj == null || getClass() != obj.getClass()) return false;

        Pays pays = (Pays) obj; // Cast sécurisé
        return population == pays.population && Objects.equals(name, pays.name);
    }

    @Override
    public int hashCode() { // Toujours redéfinir hashCode avec equals
        return Objects.hash(name, population);
    }
}
