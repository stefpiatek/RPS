package uk.ac.ucl.rits.inform.rps;

import java.util.Scanner;

/**
 * Class that deals with CLI input.
 *
 * @ author Stef Piatek
 */

class User {
    private int userChoice;
    private Scanner input = new Scanner(System.in);

    /**
     * Gets user input and sets the userChoice.
     */
    User() {

        userChoice = setUserChoice();
    }

    /**
     * Get CLI input, set the userChoice value. If R P or S is not chosen, the method will rerun.
     * @return userChoice integer
     *
     */
    private int setUserChoice()  {
        System.out.println("Please choose R/P/S");
        String move = input.nextLine();
        // Set integer value for rock paper scissors based off choice
        switch (move.toUpperCase()) {
            case "R":
                userChoice = 3;
                break;
            case "P":
                userChoice = 4;
                break;
            case "S":
                userChoice = 5;
                break;
            default:
                System.out.printf("'%s' was given, you can only select R, P or S\n", move);
                this.setUserChoice();

        }
        return userChoice;
    }

    /**
     * Gets user choice.
     *
     * @return userChoice integer
     *
     */
    public int getUserChoice() {
        return userChoice;
    }
}
