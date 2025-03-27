package fr.diginamic.combat;

import java.util.Random;

public class Personnage {
    private int force;
    private int life;
    private int score = 0;
    private Inventaire inventaire;
    private int attaqueTemporaire = 0;
    private int combatsRestantsAttaqueMajeure = 0;

    public Personnage() {

        Random rand = new Random();
        force = rand.nextInt(7) + 12;
        life = rand.nextInt(31) + 20;
        this.inventaire = new Inventaire();
        this.inventaire.ajouterPotion(new Potion("Potion de soin", "sante", 1));
        this.inventaire.ajouterPotion(new Potion("Potion d'attaque mineure", "degat", 1));
        this.inventaire.ajouterPotion(new Potion("Potion d'attaque majeure", "crit", 2));
    }

    public int getForce() {
        return this.force + this.attaqueTemporaire;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getScore() {
        return this.score;
    }

    public void augmenterScore(int points) {
        this.score += points;
    }

    public Inventaire getInventaire() {
        return this.inventaire;
    }

    public void utiliserPotion(Potion potion) {
        if (this.inventaire.getPotions().contains(potion)) {
            switch (potion.getType()) {
                case "sante":
                    this.life += potion.getEffect();
                    System.out.println("Vous avez récupéré " + potion.getEffect() + " points de santé.");
                    break;
                case "degat":
                    this.attaqueTemporaire += potion.getEffect();
                    System.out.println("Votre attaque a augmenté de " + potion.getEffect() + " points pour le prochain combat.");
                    break;
                case "crit":
                    this.attaqueTemporaire += potion.getEffect();
                    this.combatsRestantsAttaqueMajeure = potion.getDuree();
                    System.out.println("Votre attaque a augmenté de " + potion.getEffect() + " points pour les " + potion.getDuree() + " prochains combats.");
                    break;
            }
            this.inventaire.retirerPotion(potion);
        } else {
            System.out.println("Vous n'avez plus de " + potion.getName() + ".");
        }
    }

    public void diminuerCombatsRestantsAttaqueMajeure() {
        if (this.combatsRestantsAttaqueMajeure > 0) {
            this.combatsRestantsAttaqueMajeure--;
        }
        if (this.combatsRestantsAttaqueMajeure == 0) {
            this.attaqueTemporaire = 0;
        }
    }

}
