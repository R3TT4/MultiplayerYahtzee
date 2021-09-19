import java.util.Random;
/**
 * The Die class's sole purpose is to provide a simulation of a randomized die roll
 *
 * @author	Everett Johnson
 */
public class Die {

    /**
     * Generates and returns a random number depending on the value of numSides.
     * Used to simulate the roll of a die.
     *
     * @param numSides is an integer that determines how many sides the die will have
     *
     * @return area of a circle
     */
    public int rollDie(int numSides){
        Random randRef = new Random();
        return randRef.nextInt(numSides) + 1; // Returns with a +1 to shift set from 0->(numSides-1) to 1->numSides
    }

}
