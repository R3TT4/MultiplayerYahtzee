import java.util.Scanner;

/**
 * The Scorecard class is used to take the input of a hand of dice and return
 * the various elements of a Yahtzee scorecard by calculating said input.
 *
 * @author	Everett Johnson
 */
public class Scorecard {

    /**
     * New object of DiceHand to access variable information
     */
    private DiceHand dHand = new DiceHand();

    /**
     * 2D array that stores upper part of scorecard's score values.
     * First column represents value vacancy
     * Second column represents stored value
     */
    private int[][] upperScoreArr = new int[dHand.getSides()][2];

    /**
     * 2D array that stores lower part of scorecard's score values
     * First column represents value vacancy
     * Second column represents stored value
     */
    private int[][] lowerScoreArr = new int[7][2]; // Chose size of 7 because there are 7 score categories in lower

    /**
     * Array that stores lower part of scorecard's indexes
     */
    private String[] lowerScoreIndex = {"3K", "4K", "FH", "MS", "LS", "YZ", "CL"};

    /**
     * Calculate and returns the count of the most frequent die value
     *
     * @param diceHand integer array representing hand of dice
     * @param dieSides integer value of number of sides on die
     * @param handSize integer value of number of dice in hand
     * @return the count of the most frequently appearing die in the hand
     *
     * Method based off of provided cpp counterpart
     */
    private int maxOfAKind(int[] diceHand, int dieSides, int handSize){
        int max = 0;
        int count;
        for (int dieVal = 1; dieVal <=dieSides; dieVal++){
            count = 0;
            for (int diePos = 0; diePos < handSize; diePos++){
                if (diceHand[diePos] == dieVal){
                    count++;
                }
            }
            if (max < count){
                max = count;
            }
        }
        return max;
    }

    /**
     * Calculate and returns the total value of all the dice in the hand
     *
     * @param diceHand integer array representing hand of dice
     * @param handSize integer value of number of dice in hand
     * @return totalled value of all dice
     *
     * Method based off of provided cpp counterpart
     */
    private int totalDiceVal(int[] diceHand, int handSize){
        int total = 0;
        for (int diePos = 0; diePos < handSize; diePos++){
            total = total + diceHand[diePos];
        }
        return total;
    }

    /**
     * Calculate and returns the length of the longest straight found in a hand
     *
     * @param diceHand integer array representing hand of dice
     * @param handSize integer value of number of dice in hand
     * @return length of the longest straight
     *
     * Method based off of provided cpp counterpart
     */
    private int maxStraight(int[] diceHand, int handSize){
        int maxLen = 1;
        int curLen = 1;
        for(int i = 0; i < handSize-1; i++){
            if (diceHand[i] + 1 == diceHand[i + 1] ){
                curLen++;
            }else if(diceHand[i] + 1 < diceHand[i + 1]){
                curLen = 1;
            }
            if (maxLen < curLen) {
                maxLen = curLen;
            }
        }
        return maxLen;
    }

    /**
     * Calculate and returns true if the hand is a full house and false if it does not
     *
     * @param diceHand integer array representing hand of dice
     * @param dieSides integer value of number of sides on die
     * @param handSize integer value of number of dice in hand
     * @return existence of full house
     *
     * Method based off of provided cpp counterpart
     */
    private boolean fullHouse(int[] diceHand, int dieSides, int handSize){
        boolean foundFH = false;
        boolean found3K = false;
        boolean found2K = false;
        int count;
        for (int dieVal = 1; dieVal <= dieSides; dieVal++){
            count = 0;
            for (int diePos = 0; diePos < handSize; diePos++){
                if (diceHand[diePos] == dieVal){
                    count++;
                }
            }
            if (count == 2){
                found2K = true;
            }
            if (count == 3){
                found3K = true;
            }
            if (count >= 5){ // If 5 of the same values are found then a full house is counted
                foundFH = true;
            }
        }
        if (found2K && found3K){
            foundFH = true;
        }
        return foundFH;
    }

    /**
     * Calculates and returns an int array with the potential scores for the dice hand
     *
     * @param diceHand integer array representing hand of dice
     * @param dieSides integer value of number of sides on die
     * @param handSize integer value of number of dice in hand
     *
     * @return an int array holding potential score values for the lower score card
     */
    public int[] getPotLowerArr(int[] diceHand, int dieSides, int handSize){
        int[] potLowerArr = {0,0,0,0,0,0,0};

        if(lowerScoreArr[0][0] == 0){ //Checks to see if line has been used already, doesn't print if it has
            if(maxOfAKind(diceHand, dieSides, handSize) >= 3){
                potLowerArr[0] = totalDiceVal(diceHand, handSize);
            }
        }

        if(lowerScoreArr[1][0] == 0){
            if(maxOfAKind(diceHand, dieSides, handSize) >= 4)
            {
                potLowerArr[1] = totalDiceVal(diceHand, handSize);
            }
        }

        if(lowerScoreArr[2][0] == 0){
            if(fullHouse(diceHand, dieSides, handSize)) {
                potLowerArr[2] = 25;
            }
        }

        if(lowerScoreArr[3][0] == 0){
            if(maxStraight(diceHand, handSize) >= 4){
                potLowerArr[3] = 30;
            }
        }

        if(lowerScoreArr[4][0] == 0){
            if(maxStraight(diceHand, handSize) >= 5){
                potLowerArr[4] = 40;
            }
        }

        if(lowerScoreArr[5][0] == 0){
            if(maxOfAKind(diceHand, dieSides, handSize) >= 5){
                potLowerArr[5] = 50;
            }
        }

        if(lowerScoreArr[6][0] == 0){
            potLowerArr[6] = totalDiceVal(diceHand, handSize);
        }

        return potLowerArr;
    }

    /**
     * Fills the scorecard arrays with values (0's) to indicate vacancy in first column
     *
     * @param dieSides the number of sides on a die
     */
    public void initializeScorecard(int dieSides){
        upperScoreArr = new int[dieSides][2]; //Allows array to rebuild to correct size
        for(int i = 0; i < lowerScoreArr.length; i++){ //Fills the lower scorecard with 0's in "vacancy" column
            lowerScoreArr[i][0] = 0;
            lowerScoreArr[i][1] = 0;
        }
        for(int i = 0; i < upperScoreArr.length; i++){ //Fills the upper scorecard with 0's in "vacancy" column
            upperScoreArr[i][0] = 0;
            upperScoreArr[i][1] = 0;
        }
    }

    /**
     * Stores the score value where the user prefers it to be
     *
     * @param diceHand integer array representing hand of dice
     * @param dieSides integer value of number of sides on die
     * @param handSize integer value of number of dice in hand
     */
    public void storeScore(int[] diceHand, int dieSides, int handSize, String userInputStr){

        // Checks user input with lower score card first
        if(userInputStr.equals(lowerScoreIndex[0])){ //3K
            if(maxOfAKind(diceHand, dieSides, handSize) >= 3){ //Checks to see the value to input
                lowerScoreArr[0][1] = totalDiceVal(diceHand, handSize);
                lowerScoreArr[0][0] = 1; //Shows the line has been taken
            }else{
                lowerScoreArr[0][1] = 0;
                lowerScoreArr[0][0] = 1;
            }
        }
        else if(userInputStr.equals(lowerScoreIndex[1])){ //4K
            if(maxOfAKind(diceHand, dieSides, handSize) >= 4){
                lowerScoreArr[1][1] = totalDiceVal(diceHand, handSize);
                lowerScoreArr[1][0] = 1;
            }else{
                lowerScoreArr[1][1] = 0;
                lowerScoreArr[1][0] = 1;
            }
        }
        else if(userInputStr.equals(lowerScoreIndex[2])){ //Full House
            if(fullHouse(diceHand, dieSides, handSize)){
                lowerScoreArr[2][1] = 25;
                lowerScoreArr[2][0] = 1;
            }else{
                lowerScoreArr[2][1] = 0;
                lowerScoreArr[2][0] = 1;
            }
        }
        else if(userInputStr.equals(lowerScoreIndex[3])){ // Small Straight
            if(maxStraight(diceHand, handSize) >= 4){
                lowerScoreArr[3][1] = 30;
                lowerScoreArr[3][0] = 1;
            }else{
                lowerScoreArr[3][1] = 0;
                lowerScoreArr[3][0] = 1;
            }
        }
        else if(userInputStr.equals(lowerScoreIndex[4])){ // Large Straight
            if(maxStraight(diceHand, handSize) >= 5){
                lowerScoreArr[4][1] = 40;
                lowerScoreArr[4][0] = 1;
            }else{
                lowerScoreArr[4][1] = 0;
                lowerScoreArr[4][0] = 1;
            }
        }
        else if(userInputStr.equals(lowerScoreIndex[5])){ //Yahtzee Line
            if(maxOfAKind(diceHand, dieSides, handSize) >= 5){
                lowerScoreArr[5][1] = 50;
                lowerScoreArr[5][0] = 1;
            }else{
                lowerScoreArr[5][1] = 0;
                lowerScoreArr[5][0] = 1;
            }
        }
        else if(userInputStr.equals(lowerScoreIndex[6])){ //Chance Line
            lowerScoreArr[6][1] = totalDiceVal(diceHand, handSize);
            lowerScoreArr[6][0] = 1;
        }
        else{ //Since user didn't input one of the lower string codes, it will be converted to integer for upper code
            int storeIndex = Integer.parseInt(userInputStr); //Converts the string into an integer
            int totScore = 0;
            for(int i = 0; i < handSize; i++){ //Calculates score for upper score line
                if(diceHand[i] == storeIndex){
                    totScore += storeIndex;
                }
            }
            upperScoreArr[storeIndex-1][1] = totScore; // Stores the new score in the score line
            upperScoreArr[storeIndex-1][0] = 1;
        }
    }


    /**
     * Calculates and returns the total number of lines still available to store score values
     * @return total number of lines available to store score values
     */
    public int getAvailableLines(){
        int total = upperScoreArr.length + lowerScoreArr.length;

        for(int i = 0; i < upperScoreArr.length; i++){
            total -= upperScoreArr[i][0];
        }
        for(int i = 0; i < lowerScoreArr.length; i++){
            total -= lowerScoreArr[i][0];
        }

        return total;
    }

    /**
     * Gets the upper score card array
     * @return the upper score card array
     */
    public int[][] getUpperScoreArr(){
        return upperScoreArr;
    }

    /**
     * Gets the lower score card array
     * @return the lower score card array
     */
    public int[][] getLowerScoreArr(){
        return lowerScoreArr;
    }

    /**
     * Gets the total score
     * @return the total score
     */
    public int getTotal(){
        int upperSubTotal = 0;
        int bonus = 0;
        int upperTotal = 0;
        int lowerTotal = 0;
        int grandTotal = 0;

        for(int i = 0; i < upperScoreArr.length; i++){ //Calculates upper sub total
            upperSubTotal += upperScoreArr[i][1];
        }
        if(upperSubTotal >= 63){ // Checks to see if bonus applies
            bonus = 35;
        }
        for(int i = 0; i < lowerScoreArr.length; i++){
            lowerTotal += lowerScoreArr[i][1];
        }

        upperTotal = upperSubTotal + bonus; //Calculates upper total
        grandTotal = upperTotal + lowerTotal; //Calculates grand total

        return grandTotal;
    }
}
