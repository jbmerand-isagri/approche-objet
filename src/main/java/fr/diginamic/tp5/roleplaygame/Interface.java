package fr.diginamic.tp5.roleplaygame;

import java.util.Scanner;

import fr.diginamic.tp5.roleplaygame.creatures.Character;

/**
 * User interface
 * 
 * @author Jean-Baptiste
 *
 */
public class Interface {

	public static void showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisissez une option :");
		System.out.println("1 - Créer un personnage pour commencer une nouvelle partie");
		System.out.println("2 - Combattre une créature");
		System.out.println("3 - Afficher mon score");
		System.out.println("4 - Exit");
		String userChoice = scanner.nextLine();

		switch (userChoice) {
		case "1":
			createCharacter();
			break;
		case "2":
			fightACreature();
			break;
		case "3":
			displayScore();
			break;
		case "4":
			Game.setRunning(false);
			break;
		}
	}

	/**
	 * Creates a new character. Restarts the previous game stats.
	 * 
	 */
	public static void createCharacter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel nom voulez-vous donner à votre personnage ?");
		String name = scanner.nextLine();
		Character character = new Character(name);
		character.setName(name);
		Game.setCharacter(character);
		System.out
				.println("TADAAM !! " + character.getName() + " vient de naitre. Il a les caractéristiques suivantes : "
						+ character.getStrength() + " de force et " + character.getLife() + " points de vie");
		Game.setAmountOfTurns(0);
		Game.setCharacterAlive(true);
	}

	public static void fightACreature() {
		if (Game.getCharacter() != null && Game.isCharacterAlive()) {
			Game.setAmountOfTurns(Game.getAmountOfTurns() + 1);
			System.out.println("***** TOUR DE JEU N°" + Game.getAmountOfTurns() + " *****");
			TurnOfPlay.newTurn();
			System.out.println("***** FIN DU TOUR *****");
		} else {
			System.out.println(
					"Vous ne pouvez pas combattre sans avoir créé un personnage au préalable ou avec un personnage décédé.");
		}

	}

	public static void displayScore() {
		if (Game.getCharacter() != null) {
			System.out.println("Votre score : " + Game.getCharacter().getScore());
		} else {
			System.out.println("Il faut avoir créé un personnage avant de pouvoir obtenir son score.");
		}
	}
}
