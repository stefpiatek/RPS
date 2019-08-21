package uk.ac.ucl.rits.inform.rps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Given that a outcomeID of 0 is a tie, 1 is a win, 2 is a lose
 * and userChoice 3 is Rock, 4 is Paper, 5 is Scissors
 * and computerChoice 0 is a Rock, 4 is Paper, 5 is Scissors
 */
public class DeciderTest {

    @Test
    public void evaluateTie(){
        Decider decider = new Decider(3, 0);
        assertEquals(decider.getOutcomeID(), 0);
    }

    @Test
    public void evaluateLose(){
        Decider decider = new Decider(3, 1);
        assertEquals(decider.getOutcomeID(), 2);
    }

    @Test
    public void evaluateWin(){
        Decider decider = new Decider(3, 2);
        assertEquals(decider.getOutcomeID(), 1);
    }
}