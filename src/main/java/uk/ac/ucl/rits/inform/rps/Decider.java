package uk.ac.ucl.rits.inform.rps;

/**
 * Decides the outcome based on userChoice and computerChoice.
 *
 * @author Stef Piatek
 */

public class Decider {
    private int outcomeID;
    private String outcome;

    /**
     * Sets outcomeID.
     * @param userChoice - between 3-6 so that always positive once computerChoice is subtracted.
     * @param computerChoice - between 0-2.
     */
    public Decider(int userChoice, int computerChoice) {

        outcomeID = (userChoice - computerChoice) % 3;
    }

    /**
     * Prints outcome of win, lose or tie.
     * Wonderful excel table to prove that it works for each combination
     * Difference between the two ints and the modulo 3 always gives the correct state
     */
    public void printOutcome() {


        switch (outcomeID) {
            case 0:
                System.out.println("It's a tie\n\n:|");
                break;
            case 1:
                System.out.println("You win!");
                break;
            case 2:
                System.out.println("Sorry, you lose\n\n:(");
                break;
            default:
                System.out.println("Something went wrong, modulo 3 went crazy");
                System.exit(1);
        }
    }

    /**
     * Gets outcomeID, only used for testing.
     * @return int outcomeID
     */
    public int getOutcomeID() {
        return outcomeID;
    }

}
