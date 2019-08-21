package uk.ac.ucl.rits.inform.rps;

import java.util.Random;

/**
 * Generates random computer choice of move.
 *
 * @author Stef Piatek
 */

public class Computer {
    private String[] moves = {"Rock", "Paper", "Scissors"};
    private int moveID;
    private String moveName;

    /**
     * Sets moveID to be 0-2.
     */
    public Computer() {

        Random random = new Random();
        moveID = random.nextInt(moves.length);
        moveName = moves[moveID];
        System.out.printf("The computer chose %s\n", moveName);
    }

    /**
     * Gets moveID.
     *
     * @return moveID
     *
     */
    public int getMoveID() {

        return moveID;
    }
}
