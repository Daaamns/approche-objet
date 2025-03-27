package fr.diginamic.combat;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {
    List <Potion> potions = new ArrayList<>();

    public List<Potion> getPotions() {
        return this.potions;
    }

    public void ajouterPotion(Potion potion) {
        this.potions.add(potion);
    }

    public void retirerPotion(Potion potion) {
        this.potions.remove(potion);
    }
}
