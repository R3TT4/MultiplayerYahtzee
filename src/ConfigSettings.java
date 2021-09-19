import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * The ConfigSettings class works with the starting game configurations for
 * a game of Yahtzee. The class has methods to modify variables to be used
 * within a game.
 *
 * @author	Everett Johnson, Hunter Hauser
 */
public class ConfigSettings {

    /**
     * Hold the number of sides on a die
     */
    private int sideCount = 6;

    /**
     * Holds the number of die in a hand
     */
    private int dieCount = 5;

    /**
     * Retrieves private variable value for sideCount
     * @return the int value of sideCount
     */
    public int getSideCount(){
        return sideCount;
    }

    /**
     * Retrieves private variable value for dieCount
     * @return the int value of dieCount
     */
    public int getDieCount(){return dieCount;}

}