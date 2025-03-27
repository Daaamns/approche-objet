package fr.diginamic.combat;

import java.util.Random;
import java.util.Scanner;

public class TestCombat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personnage personnage = null;

        while (true) {
            System.out.println("Choisissez une option :");
            System.out.println("1. Créer un personnage");
            System.out.println("2. Combattre une créature");
            System.out.println("3. Utiliser une potion");
            System.out.println("4. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    personnage = new Personnage();
                    System.out.println("Personnage créé avec succès !");
                    break;
                case 2:
                    if (personnage != null) {
                        combattre(personnage);
                    } else {
                        System.out.println("Veuillez créer un personnage d'abord.");
                    }
                    break;
                case 3:
                    if (personnage != null) {
                        System.out.println("Choisissez une potion à utiliser :");
                        for (int i = 0; i < personnage.getInventaire().getPotions().size(); i++) {
                            System.out.println((i + 1) + ". " + personnage.getInventaire().getPotions().get(i).getName());
                        }
                        int potionChoix = scanner.nextInt();
                        scanner.nextLine();

                        if (potionChoix > 0 && potionChoix <= personnage.getInventaire().getPotions().size()) {
                            personnage.utiliserPotion(personnage.getInventaire().getPotions().get(potionChoix - 1));
                        } else {
                            System.out.println("Choix invalide.");
                        }
                    } else {
                        System.out.println("Veuillez créer un personnage d'abord.");
                    }
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
    public static void combattre(Personnage personnage) {
        if (personnage.getLife() <= 0) {
            System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.getScore() + " points. Veuillez créer un nouveau personnage.");
            return;
        }

        Creature[] creatures = {
                new Creature("loup"),
                new Creature("gobelin"),
                new Creature("troll")
        };
        Random rand = new Random();
        Creature creature = creatures[rand.nextInt(creatures.length)];
        creature.afficherCreature();

        // Logique de combat
        while (personnage.getLife() > 0 && creature.getLife() > 0) {
            // Le personnage attaque
            creature.setLife(creature.getLife() - personnage.getForce());
            if (creature.getLife() <= 0) {
                System.out.println("Vous avez vaincu la créature !");
                System.out.println("Il vous reste : " + personnage.getLife());
                personnage.augmenterScore(10);
                break;
            }

            // La créature attaque
            personnage.setLife(personnage.getLife() - creature.getForce());
            System.out.println("la créature attaque, il vous reste " + personnage.getLife() + "pv");
            if (personnage.getLife() <= 0) {
                System.out.println("Vous avez été vaincu par la créature. Vous avez remporté : " + personnage.getScore() + " points");
                break;
            }
        }

        // Réinitialisation des effets temporaires après le combat
        personnage.diminuerCombatsRestantsAttaqueMajeure();
    }
}
