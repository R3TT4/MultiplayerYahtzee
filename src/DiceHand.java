/**
 * The DiceHand class takes care of all important methods relating to
 * initializations, modifications, or visualization of a hand of dice in Yahtzee
 *
 * @author	Everett Johnson
 */
public class DiceHand {

    /**
     * Holds the value of the amount of dice in a hand
     */
    private int handSize = 5;

    /**
     * Holds the values of the number of sides on a die
     */
    private int sides = 6;

    /**
     * The array in which the dice are stored
     */
    public int[] diceArray = new int[handSize];

    /**
     * New Die object to be used in later methods for random number production
     */
    private Die randDie = new Die();

    /**
     * Initializes the hand of dice with random die rolls.
     */
    public void initializeHand(){
        diceArray = new int[handSize]; // This re-initializes the array with the proper size
        for(int diePos = 0; diePos < handSize; diePos++){
            diceArray[diePos] = randDie.rollDie(sides);
        }
    }

    /**
     * Rerolls the dice based off of the user's input.
     *
     * @param userInput character array of y's and n's to determine if the user wishes to reroll dice
     */
    public void rerollDie(char[] userInput){
        for (int diePos = 0; diePos < handSize; diePos++){
            if (userInput[diePos] != 'y') { // Checks to see if character in die position is y or n
                diceArray[diePos] = randDie.rollDie(sides);
            }
        }
    }

    /**
     * Sorts the dice hand array in order numerically from lowest to highest value.
     */
    public void sortDiceArray(){
        int temp;
        // Proceeds to sort the array with original die positions and comparison die positions
        for(int origDie = 0; origDie < handSize; origDie++){
            for(int compDie = 0; compDie < handSize; compDie++){
                if(diceArray[origDie] < diceArray[compDie]){
                    temp = diceArray[origDie];
                    diceArray[origDie] = diceArray[compDie];
                    diceArray[compDie] = temp;
                }
            }
        }
    }

    /**
     * Retrieves private variable value for handSize
     * @return the int value of handSize
     */
    public int getHandSize(){
        return handSize;
    }

    /**
     * Sets the private variable value of handSize to a new value
     * @param handSize is the new value to use to replace handSize
     */
    public void setHandSize(int handSize){
        this.handSize = handSize;
    }

    /**
     * Sets the private variable value of setSides to a new value
     * @param sides is the new value to use to replace setSides
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /**
     * Retrieves private variable value for sides
     * @return the int value of handSize
     */
    public int getSides(){return sides;}
}
