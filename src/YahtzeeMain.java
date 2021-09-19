import javax.swing.*;
/**
 * This program simulates a game of multiplayer Yahtzee in a GUI
 *
 * @author Everett Johnson
 * @version v1.0 9/19/2021
 */
public class YahtzeeMain {

    /**
     * Implements a do while loop full of methods from Player() in order to
     * simulate one round of Yahtzee in a GUI. This is the main() method.
     *
     * @param args stores command line arguments from user
     */
    public static void main(String[] args) {
        JFrame mainFrame = new YahtzeeFormGUI("Yahtzee");
        mainFrame.setVisible(true);
    }
}
