package uk.ac.ucl.rits.inform.rps;

/**
 * Main class for running RPS.
 *
 * @author Stef Piatek
 */

public class Game {
    /**
     * Runs the game.
     *
     * @param args No args expected
     */
    public static void main(String[] args) {
        /**
         * main method runs the game.
         *
         * @param args No args expected
         */
        // Take input from user
        User userInput = new User();
        int userChoice = userInput.getUserChoice();

        // Computer chooses, print out their choice and return the choice
        Computer computer = new Computer();
        int computerChoice = computer.getMoveID();

        // Decide what the outcome is.
        Decider decider = new Decider(userChoice, computerChoice);
        decider.printOutcome();
    }

    /**
     * Overriding constructor because this is never created.
     */
    private Game() {}
}
