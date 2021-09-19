import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.PrintStream;

/**
 * The PlayerNameWindow class is used to change the names of the players.
 * A player can enter their name or use preset names to change their scorecard
 * names. Accepts up to 4 inputs.
 *
 * @author	Hunter Hauser
 * @see	"No Borrowed Code"
**/
public class PlayerNameWindow extends JFrame {
    private JTextField playerInput1;
    private JTextField playerInput3;
    private JTextField playerInput2;
    private JTextField playerInput4;
    private JButton saveNamesButton;
    private JLabel player1;
    private JLabel player2;
    private JLabel player4;
    private JLabel player3;
    private JPanel mainPanel;
    private JLabel panelLabel;

    public String name1 = "Player1";
    public String name2 = "Player2";
    public String name3 = "Player3";
    public String name4 = "Player4";

    /**
     * Constructor for the PlayerNameWindow class and JFrame
     * @param title name of the GUI
     * @param playerSelection amount of players declared in the settings
     */
    public PlayerNameWindow(String title, int playerSelection)
    {
        super(title);
        this.setContentPane(mainPanel);
        this.setSize(400, 400);
        this.getContentPane().setBackground(Color.pink);
        this.setDefaultCloseOperation(PlayerNameWindow.DISPOSE_ON_CLOSE);

        //sets all GUI components to invisible
        playerInput1.setVisible(false);
        playerInput2.setVisible(false);
        playerInput3.setVisible(false);
        playerInput4.setVisible(false);
        player1.setVisible(false);
        player2.setVisible(false);
        player3.setVisible(false);
        player4.setVisible(false);
        saveNamesButton.setVisible(false);

        //frame is visible
        this.setVisible(true);

        //displays proper number of input fields
        displayPlayerBoxes(playerSelection);
        //allows players to change name and save names
        textBoxAction(playerSelection);

    }

    /**
     * Displays the proper amounts of JTextFields based on user input
     * @param playerAmount amount of players declared in the settings
     */
    public void displayPlayerBoxes(int playerAmount)
    {
        //one player
        if (playerAmount == 1) {
            playerInput1.setVisible(true);
            player1.setVisible(true);
            saveNamesButton.setVisible(true);
        }
        //two player
        if (playerAmount == 2) {
            playerInput1.setVisible(true);
            player1.setVisible(true);
            playerInput2.setVisible(true);
            player2.setVisible(true);
            saveNamesButton.setVisible(true);
        }
        //three player
        if (playerAmount == 3) {
            playerInput1.setVisible(true);
            player1.setVisible(true);
            playerInput2.setVisible(true);
            player2.setVisible(true);
            playerInput3.setVisible(true);
            player3.setVisible(true);
            saveNamesButton.setVisible(true);
        }
        //four player
        if (playerAmount == 4) {
            playerInput1.setVisible(true);
            player1.setVisible(true);
            playerInput2.setVisible(true);
            player2.setVisible(true);
            playerInput3.setVisible(true);
            player3.setVisible(true);
            playerInput4.setVisible(true);
            player4.setVisible(true);
            saveNamesButton.setVisible(true);
        }
    }

    /**
     * Allows player to enter and save names
     * @param playerAmount amount of players declared in the settings
     */
    public void textBoxAction(int playerAmount)
    {
        //Saves player 1 input
        playerInput1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                playerInput1.setText("Player1"); //default name
            }

            @Override
            public void focusLost(FocusEvent e) {
                name1 = playerInput1.getText(); //saves entered name in name1
            }
        });
        //Saves player 2 input
        playerInput2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                playerInput2.setText("Player2");
            }

            @Override
            public void focusLost(FocusEvent e) {
                name2 = playerInput2.getText(); //saves entered name in name2
            }
        });
        //Saves player 3 input
        playerInput3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                playerInput3.setText("Player3");
            }

            @Override
            public void focusLost(FocusEvent e) {
                name3 = playerInput3.getText(); //saves entered name in name3
            }
        });
        //Saves player 4 input
        playerInput4.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                playerInput4.setText("Player4");
            }

            @Override
            public void focusLost(FocusEvent e) {
                name4 = playerInput4.getText(); //saves entered name in name4
            }
        });
        //Saves names to txt file and closes window
        saveNamesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //sets all components to invisible
                panelLabel.setVisible(false);
                playerInput1.setVisible(false);
                playerInput2.setVisible(false);
                playerInput3.setVisible(false);
                playerInput4.setVisible(false);
                player1.setVisible(false);
                player2.setVisible(false);
                player3.setVisible(false);
                player4.setVisible(false);

                //writes names to file
                writeNamesToFile(playerAmount);

                //closes the current window
                //System.exit(0);
                saveNamesButton.setText("Please close the window to exit");

            }
        });

    }

    /**
     * Writes the names of the player(s) to txt file
     * @param playerAmount amount of players declared in the settings
     */
    public void writeNamesToFile(int playerAmount)
    {
        File myFile = new File("playerNames.txt"); //output file
        try {
            PrintStream fileWriter = new PrintStream(myFile);
            //1 player output
            if(playerAmount == 1)
            {
                fileWriter.println(name1);
            }
            //2 player output
            if(playerAmount == 2)
            {
                fileWriter.println(name1);
                fileWriter.println(name2);
            }
            //3 player output
            if(playerAmount == 3)
            {
                fileWriter.println(name1);
                fileWriter.println(name2);
                fileWriter.println(name3);
            }
            //4 player output
            if(playerAmount == 4)
            {
                fileWriter.println(name1);
                fileWriter.println(name2);
                fileWriter.println(name3);
                fileWriter.print(name4);
            }
            //closes the file
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
