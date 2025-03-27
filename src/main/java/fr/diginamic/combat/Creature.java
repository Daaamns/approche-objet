package fr.diginamic.combat;

import java.util.Random;

public class Creature {
    String type;
    int force;
    int life;

    public Creature(String type) {
        this.type = type;
        Random rand = new Random();
        switch (type) {
            case "loup":
                this.force = rand.nextInt(6) + 3;
                this.life = rand.nextInt(6) + 5;
                break;
            case "gobelin":
                this.force = rand.nextInt(6) + 5;
                this.life = rand.nextInt(6) + 10;
                break;
            case "troll" :
                this.force = rand.nextInt(6) + 10;
                this.life = rand.nextInt(11) + 20;
                break;
            default:
                throw new IllegalArgumentException("La créature n'existe pas.");
        }
    }

    public String getType() {
        return this.type;
    }

    public int getForce() {
        return this.force;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void afficherCreature() {
        System.out.println("Nom: " + this.type);
        System.out.println("Force: " + this.force);
        System.out.println("Points de santé: " + this.life);
    }
}
