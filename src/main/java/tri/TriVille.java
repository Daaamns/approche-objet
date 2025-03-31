package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriVille {
    public static void main(String[] args) {


    List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Paris",  2148000));
        villes.add(new Ville("Lyon",  513275));
        villes.add(new Ville("Marseille", 861635));
        villes.add(new Ville("Toulouse", 479553));
        villes.add(new Ville("Nice", 342637));

        Collections.sort(villes);

        for (Ville ville : villes) {
        System.out.println(ville);
    }
}
}
