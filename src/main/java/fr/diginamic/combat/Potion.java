package fr.diginamic.combat;

import java.util.Random;

public class Potion {
    String name;
    int effect;
    String type;
    int duree;

    public Potion(String name, String type, int duree) {
        this.name = name;
        this.type = type;
        this.duree = duree;
        Random rand = new Random();
        switch (type) {
            case "sante":
                this.effect = rand.nextInt(6) + 5; // entre 5 et 10
                break;
            case "degat":
                this.effect = 3;
                break;
            case "crit":
                this.effect = 5;
                break;
            default:
                throw new IllegalArgumentException("Ce type de potion n'existe pas.");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getEffect() {
        return this.effect;
    }

    public String getType() {
        return this.type;
    }

    public int getDuree() {
        return this.duree;
    }
}
