package fr.diginamic.tp5.roleplaygame;

import fr.diginamic.tp5.roleplaygame.creatures.Character;

/**
 * Main class of the game.
 * 
 * @author Jean-Baptiste
 * @version 1.0 ALPHA
 */
public class Game {

	private static int amountOfTurns = 0;
	private static boolean isCharacterAlive;
	private static boolean isRunning = true;
	private static Character character = null;

	public static void main(String[] args) {

		System.out.println("******** JEU DE ROLE ********");
		while (isRunning) {
			Interface.showMenu();
		}

	}

	/**
	 * @return the amountOfTurns
	 */
	public static int getAmountOfTurns() {
		return amountOfTurns;
	}

	/**
	 * @param amountOfTurns
	 *            the amountOfTurns to set
	 */
	public static void setAmountOfTurns(int amountOfTurns) {
		Game.amountOfTurns = amountOfTurns;
	}

	/**
	 * @return the isCharacterAlive
	 */
	public static boolean isCharacterAlive() {
		return isCharacterAlive;
	}

	/**
	 * @param isCharacterAlive
	 *            the isCharacterAlive to set
	 */
	public static void setCharacterAlive(boolean isCharacterAlive) {
		Game.isCharacterAlive = isCharacterAlive;
	}

	/**
	 * @return the isRunning
	 */
	public static boolean isRunning() {
		return isRunning;
	}

	/**
	 * @param isRunning
	 *            the isRunning to set
	 */
	public static void setRunning(boolean isRunning) {
		Game.isRunning = isRunning;
	}

	/**
	 * @return the character
	 */
	public static Character getCharacter() {
		return character;
	}

	/**
	 * @param character
	 *            the character to set
	 */
	public static void setCharacter(Character character) {
		Game.character = character;
	}

}
