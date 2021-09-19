import java.util.Scanner;
/**
 * The Player class is used to implement and organize various methods from other classes
 * in order to better prepare the code for use in the main() method
 *
 * @author	Everett Johnson
 */
public class Player {

    /**
     * New DiceHand object that allows access to object methods
     */
    private DiceHand userHand = new DiceHand();

    /**
     * New Scorecard object that allows access to object methods
     */
    private Scorecard cardOne = new Scorecard();

    /**
     * New Scanner object that allows for user input to be read
     */
    private Scanner scan = new Scanner(System.in);

    /**
     * New ConfigSettings object that allows access to object methods
     */
    private ConfigSettings gameSettings = new ConfigSettings();

    /**
     * Initiates game configuration reading and changes
     */
    public void setGameConfigs(){
        cardOne.initializeScorecard(userHand.getSides());
    }

    /**
     * Performs the first roll of the round
     */
    public void firstRoll() {
        userHand.initializeHand();
    }



    /**
     * Prints out the option for the user to reroll their dice
     */
    public void rerollOption(char[] userInputChar){
        for(int i = 1; i < 3; i++){ // Starting the iteration at 1 since the first roll is done elsewhere
            // takes input from user as a string

            // Uses user input and rerolls dice
            userHand.rerollDie(userInputChar);
        }
    }

    /**
     * Sorts the user's dice hand
     */
    public void sortHand(){
        userHand.sortDiceArray();
    }

    /**
     * Saves the user's score in their preferred score line
     */
    public void saveScores(String code){
        cardOne.storeScore(userHand.diceArray, userHand.getSides(), userHand.getHandSize(), code);
    }


    /**
     * Returns the total number of lines still available to store score values
     * @return total number of lines available to store score values
     */
    public int getLines(){return cardOne.getAvailableLines();}

    /**
     * Returns the scores in the upper score card
     * @return a 2d int array holding the upper score card scores
     */
    public int[][] getUpperScores(){
        return cardOne.getUpperScoreArr();
    }

    /**
     * Returns the scores in the lower score card
     * @return a 2d int array holding the lower score card scores
     */
    public int[][] getLowerScores(){
        return cardOne.getLowerScoreArr();
    }

    /**
     * Returns the dice hand
     * @return an int array holding the dice of the hand
     */
    public int[] getHand(){
        return userHand.diceArray;
    }

    /**
     * Returns the number of sides
     * @return the number of sides on a die
     */
    public int getSides(){
        return userHand.getSides();
    }

    /**
     * Returns and array holding the potential scores for the lower score card
     * @return the potential lower scores in an array
     */
    public int[] getPotLowerArr(){
        return cardOne.getPotLowerArr(userHand.diceArray, gameSettings.getSideCount(), gameSettings.getDieCount());
    }

    public void setDieCount(int count){
        userHand.setHandSize(count);
    }

    public void setDieSides(int sides){
        userHand.setSides(sides);
    }

    public int getTotal(){return cardOne.getTotal();}

}
