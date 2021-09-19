import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The YahtzeeFormGUI class is used to implement and organize various methods from other classes
 * and constructs a GUI based on those various imported features
 *
 * @author	Everett Johnson
 */
public class YahtzeeFormGUI extends JFrame{
    private JPanel mainPanel;
    public JButton rollButton;
    private JCheckBox keepDie1;
    private JCheckBox keepDie2;
    private JCheckBox keepDie3;
    private JCheckBox keepDie4;
    private JCheckBox keepDie5;
    private JCheckBox keepDie6;
    private JCheckBox keepDie7;
    private JPanel gamePanel;
    private JPanel gameTab;
    private JPanel scorecardTab;
    private JPanel settingsTab;
    private JButton onesScore;
    private JButton twosScore;
    private JButton threesScore;
    private JButton foursScore;
    private JButton fivesScore;
    private JButton sixesScore;
    private JButton threeKScore;
    private JButton fourKScore;
    private JButton fhScore;
    private JButton sStraightScore;
    private JButton lStraightScore;
    private JButton yahtzeeScore;
    private JButton chanceScore;
    private JComboBox dieSideCB;
    private JComboBox dieCountCB;
    private JLabel sevensL;
    private JLabel eightsL;
    private JLabel ninesL;
    private JLabel tensL;
    private JLabel elevensL;
    private JLabel twelvesL;
    private JButton sevensScore;
    private JButton eightsScore;
    private JButton ninesScore;
    private JButton tensScore;
    private JButton elevensScore;
    private JButton twelvesScore;
    private JLabel savedOnes;
    private JLabel savedTwos;
    private JLabel savedThrees;
    private JLabel savedFours;
    private JLabel savedFives;
    private JLabel savedSixes;
    private JLabel saved3k;
    private JLabel saved4k;
    private JLabel savedFH;
    private JLabel savedSStraight;
    private JLabel savedLStraight;
    private JLabel savedYahtzee;
    private JLabel savedChance;
    private JLabel sevensLSC;
    private JLabel eightsLSC;
    private JLabel ninesLSC;
    private JLabel tensLSC;
    private JLabel elevensLSC;
    private JLabel twelvesLSC;
    private JLabel savedSevens;
    private JLabel savedEights;
    private JLabel savedNines;
    private JLabel savedTens;
    private JLabel savedElevens;
    private JLabel savedTwelves;
    private JLabel subTotalSaved;
    private JLabel bonusSaved;
    private JLabel totalScoreSaved;
    private JLabel savedLowerTotal;
    private JLabel savedUpperTotal;
    private JLabel savedGrandTotal;
    private JLabel dieLabel1;
    private JLabel dieLabel2;
    private JLabel dieLabel3;
    private JLabel dieLabel4;
    private JLabel dieLabel5;
    private JLabel dieLabel6;
    private JLabel dieLabel7;
    private JLabel turnMessage;
    private JLabel onesScoreL;
    private JLabel twosScoreL;
    private JLabel threesScoreL;
    private JLabel foursScoreL;
    private JLabel fivesScoreL;
    private JLabel sixesScoreL;
    private JButton nextHandButton;
    private JLabel threeKL;
    private JLabel fourKL;
    private JLabel FHL;
    private JLabel SSL;
    private JLabel LSL;
    private JLabel YL;
    private JLabel CL;
    private JButton confirmSettingsButton;
    private JLabel confirmMsg;
    private JComboBox playerCB;
    private JTabbedPane tabPane;
    private JButton userNameConfirmButton;
    private JLabel savedOnes2;
    private JLabel savedTwos2;
    private JLabel savedThrees2;
    private JLabel savedFours2;
    private JLabel savedFives2;
    private JLabel savedSixes2;
    private JLabel savedSevens2;
    private JLabel savedEights2;
    private JLabel savedNines2;
    private JLabel savedTens2;
    private JLabel savedElevens2;
    private JLabel savedTwelves2;
    private JLabel saved3k2;
    private JLabel saved4k2;
    private JLabel savedFH2;
    private JLabel savedSStraight2;
    private JLabel savedLStraight2;
    private JLabel savedYahtzee2;
    private JLabel savedChance2;
    private JLabel subTotalSaved2;
    private JLabel bonusSaved2;
    private JLabel totalScoreSaved2;
    private JLabel savedLowerTotal2;
    private JLabel savedUpperTotal2;
    private JLabel savedGrandTotal2;
    private JLabel sevensLSC2;
    private JLabel eightsLSC2;
    private JLabel ninesLSC2;
    private JLabel tensLSC2;
    private JLabel elevensLSC2;
    private JLabel twelvesLSC2;
    private JLabel sevensLSC3;
    private JLabel eightsLSC3;
    private JLabel ninesLSC3;
    private JLabel tensLSC3;
    private JLabel elevensLSC3;
    private JLabel twelvesLSC3;
    private JLabel savedOnes3;
    private JLabel savedTwos3;
    private JLabel savedThrees3;
    private JLabel savedFours3;
    private JLabel savedFives3;
    private JLabel savedSixes3;
    private JLabel savedSevens3;
    private JLabel savedEights3;
    private JLabel savedNines3;
    private JLabel savedTens3;
    private JLabel savedElevens3;
    private JLabel savedTwelves3;
    private JLabel saved3k3;
    private JLabel saved4k3;
    private JLabel savedFH3;
    private JLabel savedSStraight3;
    private JLabel savedLStraight3;
    private JLabel savedYahtzee3;
    private JLabel savedChance3;
    private JLabel subTotalSaved3;
    private JLabel bonusSaved3;
    private JLabel totalScoreSaved3;
    private JLabel lowerTotalSaved3;
    private JLabel upperTotalSaved3;
    private JLabel grandTotalSaved3;
    private JLabel sevensLSC4;
    private JLabel eightsLSC4;
    private JLabel ninesLSC4;
    private JLabel tensLSC4;
    private JLabel elevensLSC4;
    private JLabel twelvesLSC4;
    private JLabel savedOnes4;
    private JLabel savedTwos4;
    private JLabel savedThrees4;
    private JLabel savedFours4;
    private JLabel savedFives4;
    private JLabel savedSixes4;
    private JLabel savedSevens4;
    private JLabel savedEights4;
    private JLabel savedNines4;
    private JLabel savedTens4;
    private JLabel savedElevens4;
    private JLabel savedTwelves4;
    private JLabel saved3k4;
    private JLabel saved4k4;
    private JLabel savedFH4;
    private JLabel savedSStraight4;
    private JLabel savedLStraight4;
    private JLabel savedYahtzee4;
    private JLabel savedChance4;
    private JLabel subTotalSaved4;
    private JLabel bonusSaved4;
    private JLabel totalScoreSaved4;
    private JLabel lowerTotalSaved4;
    private JLabel upperTotalSaved4;
    private JLabel grandTotalSaved4;
    private JLabel howManyDiceMessage;

    Player playerOne = new Player();
    Player playerTwo = new Player();
    Player playerThree = new Player();
    Player playerFour = new Player();

    /**
     * Counter used to keep track how many player there are
     */
    private int playerCounter = 1;

    /**
     * Default instantiation of player usernames
     */
    private String player1Str = "Player1";
    private String player2Str = "Player2";
    private String player3Str = "Player3";
    private String player4Str = "Player4";

    /**
     * Counter used to keep track which player's turn it is
     */
    private int currPlayer = 1;

    /**
     * Counter used to keep track of the number of rolls
     */
    private int rollCounter = 1;

    /**
     * Counter that keeps track of the number of lines available in the scorecard
     */
    private int linesCounter = playerOne.getLines();

    /**
     * Holds value for current dice count
     */
    private int diceCount = 5;

    /**
     * Holds value for current dice sides
     */
    private int diceSides = 6;

    /**
     * New Scanner object that allows for user input to be read
     */
    private Scanner scan = new Scanner(System.in);

    /**
     * Constructor for the Yahtzee GUI
     */
    public YahtzeeFormGUI(String name){
        super(name);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        confirmSettingsButton.setVisible(false);
        confirmMsg.setVisible(false);
        nextHandButton.setVisible(false);
        howManyDiceMessage.setVisible(false);
        dieCountCB.setVisible(false);

        tabPane.setEnabledAt(1, false);
        tabPane.setEnabledAt(2, false);
        tabPane.setEnabledAt(3, false);
        tabPane.setEnabledAt(4, false);
        tabPane.setEnabledAt(5, false);

        setUsernames();
        updateSettings();
        rerollButton();
    }


    /**
     * Initiates the first roll and updates the GUI
     */
    public void firstRoll(){
        switch(currPlayer){
            case 1:
                playerOne.firstRoll();
                break;
            case 2:
                playerTwo.firstRoll();
                break;
            case 3:
                playerThree.firstRoll();
                break;
            case 4:
                playerFour.firstRoll();
                break;
        }
        updateDice();
        rollButton.setText("Rolls Left: " + String.valueOf(3 - rollCounter));
        setPotentialScoreNeutral();
    }

    /**
     * In charge of performing the rerolls of the dice and updating of GUIs
     */
    public void rerollButton(){
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rollCounter < 3){ //Prevents the user from over-rolling
                    char[] keepArray = {'n', 'n', 'n', 'n', 'n', 'n', 'n'};

                    if(keepDie1.isSelected()){ //Changes choice depending on is the user want to hold or note
                        keepArray[0] = 'y';
                    }
                    if(keepDie2.isSelected()){
                        keepArray[1] = 'y';
                    }
                    if(keepDie3.isSelected()){
                        keepArray[2] = 'y';
                    }
                    if(keepDie4.isSelected()){
                        keepArray[3] = 'y';
                    }
                    if(keepDie5.isSelected()){
                        keepArray[4] = 'y';
                    }
                    if(keepDie6.isSelected()){
                        keepArray[5] = 'y';
                    }
                    if(keepDie7.isSelected()){
                        keepArray[6] = 'y';
                    }

                    switch(currPlayer){
                        case 1:
                            playerOne.rerollOption(keepArray);
                            break;
                        case 2:
                            playerTwo.rerollOption(keepArray);
                            break;
                        case 3:
                            playerThree.rerollOption(keepArray);
                            break;
                        case 4:
                            playerFour.rerollOption(keepArray);
                            break;
                    }
                    updateDice();
                    rollButton.setText("Rolls Left: " + String.valueOf(2 - rollCounter)); //Updates button name

                    if(2 - rollCounter == 0){ //Once end of rolls has been met
                        rollButton.setText("Out of rolls!");
                        switch(currPlayer){
                            case 1:
                                playerOne.sortHand();
                                break;
                            case 2:
                                playerTwo.sortHand();
                                break;
                            case 3:
                                playerThree.sortHand();
                                break;
                            case 4:
                                playerFour.sortHand();
                                break;
                        }
                        updateDice();
                        updatePotentialScores();

                        onesScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("1");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("1");
                                        break;
                                    case 3:
                                        playerThree.saveScores("1");
                                        break;
                                    case 4:
                                        playerFour.saveScores("1");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        twosScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("2");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("2");
                                        break;
                                    case 3:
                                        playerThree.saveScores("2");
                                        break;
                                    case 4:
                                        playerFour.saveScores("2");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        threesScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("3");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("3");
                                        break;
                                    case 3:
                                        playerThree.saveScores("3");
                                        break;
                                    case 4:
                                        playerFour.saveScores("3");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        foursScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("4");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("4");
                                        break;
                                    case 3:
                                        playerThree.saveScores("4");
                                        break;
                                    case 4:
                                        playerFour.saveScores("4");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        fivesScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("5");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("5");
                                        break;
                                    case 3:
                                        playerThree.saveScores("5");
                                        break;
                                    case 4:
                                        playerFour.saveScores("5");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        sixesScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("6");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("6");
                                        break;
                                    case 3:
                                        playerThree.saveScores("6");
                                        break;
                                    case 4:
                                        playerFour.saveScores("6");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        sevensScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("7");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("7");
                                        break;
                                    case 3:
                                        playerThree.saveScores("7");
                                        break;
                                    case 4:
                                        playerFour.saveScores("7");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        eightsScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("8");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("8");
                                        break;
                                    case 3:
                                        playerThree.saveScores("8");
                                        break;
                                    case 4:
                                        playerFour.saveScores("8");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        ninesScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("9");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("9");
                                        break;
                                    case 3:
                                        playerThree.saveScores("9");
                                        break;
                                    case 4:
                                        playerFour.saveScores("9");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        tensScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("10");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("10");
                                        break;
                                    case 3:
                                        playerThree.saveScores("10");
                                        break;
                                    case 4:
                                        playerFour.saveScores("10");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        elevensScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("11");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("11");
                                        break;
                                    case 3:
                                        playerThree.saveScores("11");
                                        break;
                                    case 4:
                                        playerFour.saveScores("11");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        twelvesScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("12");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("12");
                                        break;
                                    case 3:
                                        playerThree.saveScores("12");
                                        break;
                                    case 4:
                                        playerFour.saveScores("12");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        threeKScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("3K");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("3K");
                                        break;
                                    case 3:
                                        playerThree.saveScores("3K");
                                        break;
                                    case 4:
                                        playerFour.saveScores("3K");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        fourKScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("4K");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("4K");
                                        break;
                                    case 3:
                                        playerThree.saveScores("4K");
                                        break;
                                    case 4:
                                        playerFour.saveScores("4K");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        fhScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("FH");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("FH");
                                        break;
                                    case 3:
                                        playerThree.saveScores("FH");
                                        break;
                                    case 4:
                                        playerFour.saveScores("FH");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        sStraightScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("MS");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("MS");
                                        break;
                                    case 3:
                                        playerThree.saveScores("MS");
                                        break;
                                    case 4:
                                        playerFour.saveScores("MS");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        lStraightScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("LS");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("LS");
                                        break;
                                    case 3:
                                        playerThree.saveScores("LS");
                                        break;
                                    case 4:
                                        playerFour.saveScores("LS");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        yahtzeeScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("YZ");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("YZ");
                                        break;
                                    case 3:
                                        playerThree.saveScores("YZ");
                                        break;
                                    case 4:
                                        playerFour.saveScores("YZ");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        chanceScore.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch(currPlayer){
                                    case 1:
                                        playerOne.saveScores("CL");
                                        break;
                                    case 2:
                                        playerTwo.saveScores("CL");
                                        break;
                                    case 3:
                                        playerThree.saveScores("CL");
                                        break;
                                    case 4:
                                        playerFour.saveScores("CL");
                                        break;
                                }
                                updateSaveButtons();
                                updateScore();
                                setPotentialScoreNeutral();
                            }
                        });

                        if(playerCounter == 1){
                            linesCounter = playerOne.getLines();
                        }
                        if(playerCounter == 2){
                            linesCounter = playerTwo.getLines() + playerOne.getLines();
                        }
                        if(playerCounter == 3){
                            linesCounter = playerThree.getLines() + playerTwo.getLines() + playerOne.getLines();
                        }
                        if(playerCounter == 4){
                            linesCounter = playerFour.getLines() + playerThree.getLines() + playerTwo.getLines() + playerOne.getLines();
                        }

                        if(linesCounter == 1){
                            rollButton.setText("DONE! See Scorecard");
                            turnMessage.setText("GAME FINISHED");
                            if(playerCounter == 2){
                                if(playerOne.getTotal() < playerTwo.getTotal()){
                                    turnMessage.setText("GAME FINISHED! " + player2Str + " wins with: " + playerTwo.getTotal() + " points!");
                                }else{
                                    turnMessage.setText("GAME FINISHED! " + player1Str + " wins with: " + playerOne.getTotal() + " points!");
                                }
                            }
                            if(playerCounter == 4){
                                if(playerOne.getTotal() < playerTwo.getTotal() && playerThree.getTotal() < playerTwo.getTotal() && playerFour.getTotal() < playerTwo.getTotal()){
                                    turnMessage.setText("GAME FINISHED! " + player2Str + " wins with: " + playerTwo.getTotal() + " points!");
                                }else if(playerTwo.getTotal() < playerOne.getTotal() && playerThree.getTotal() < playerOne.getTotal() && playerFour.getTotal() < playerOne.getTotal()){
                                    turnMessage.setText("GAME FINISHED! " + player1Str + " wins with: " + playerOne.getTotal() + " points!");
                                }else if(playerTwo.getTotal() < playerThree.getTotal() && playerOne.getTotal() < playerThree.getTotal() && playerFour.getTotal() < playerThree.getTotal()){
                                    turnMessage.setText("GAME FINISHED! " + player3Str + " wins with: " + playerThree.getTotal() + " points!");
                                }else if(playerTwo.getTotal() < playerFour.getTotal() && playerThree.getTotal() < playerFour.getTotal() && playerOne.getTotal() < playerFour.getTotal()){
                                    turnMessage.setText("GAME FINISHED! " + player4Str + " wins with: " + playerFour.getTotal() + " points!");
                                }
                            }
                        }else{
                            startNextHand();
                        }
                    }
                    rollCounter++;
                }
            }
        });
    }

    /**
     * Keeps track of the potential scores to show and hide per player
     */
    public void updateSaveButtons(){
        int[][] upperScoreCardArray = playerOne.getUpperScores();
        int[][] lowerScoreCardArray = playerOne.getLowerScores();
        //Initial Set
        threeKL.setText("3 of a Kind");
        threeKScore.setVisible(true);
        fourKL.setText("4 of a Kind");
        fourKScore.setVisible(true);
        FHL.setText("Full House");
        fhScore.setVisible(true);
        SSL.setText("Small Straight");
        sStraightScore.setVisible(true);
        LSL.setText("Large Straight");
        lStraightScore.setVisible(true);
        YL.setText("Yahtzee");
        yahtzeeScore.setVisible(true);
        CL.setText("Chance");
        chanceScore.setVisible(true);
        onesScoreL.setText("Ones");
        onesScore.setVisible(true);
        twosScoreL.setText("Twos");
        twosScore.setVisible(true);
        threesScoreL.setText("Three");
        threesScore.setVisible(true);
        foursScoreL.setText("Fours");
        foursScore.setVisible(true);
        fivesScoreL.setText("Fives");
        fivesScore.setVisible(true);
        sixesScoreL.setText("Sixes");
        sixesScore.setVisible(true);
        if((diceSides == 8) || (diceSides == 12)){
            sevensL.setText("Sevens");
            sevensScore.setVisible(true);
            eightsL.setText("Eights");
            eightsScore.setVisible(true);
        }
        if(diceSides == 12){
            ninesL.setText("Nines");
            ninesScore.setVisible(true);
            tensL.setText("Tens");
            tensScore.setVisible(true);
            elevensL.setText("Elevens");
            elevensScore.setVisible(true);
            twelvesL.setText("Twelves");
            twelvesScore.setVisible(true);
        }

        switch(currPlayer){
            case 1:
                break;
            case 2:
                upperScoreCardArray = playerTwo.getUpperScores();
                lowerScoreCardArray = playerTwo.getLowerScores();
                break;
            case 3:
                upperScoreCardArray = playerThree.getUpperScores();
                lowerScoreCardArray = playerThree.getLowerScores();
                break;
            case 4:
                upperScoreCardArray = playerFour.getUpperScores();
                lowerScoreCardArray = playerFour.getLowerScores();
                break;
        }
        if(lowerScoreCardArray[0][0] == 1){ //Lower scores
            threeKL.setText("3K Spot Used");
            threeKScore.setVisible(false);
        }
        if(lowerScoreCardArray[1][0] == 1){
            fourKL.setText("4K Spot Used");
            fourKScore.setVisible(false);
        }
        if(lowerScoreCardArray[2][0] == 1){
            FHL.setText("Full House Spot Used");
            fhScore.setVisible(false);
        }
        if(lowerScoreCardArray[3][0] == 1){
            SSL.setText("Small Straight Spot Used");
            sStraightScore.setVisible(false);
        }
        if(lowerScoreCardArray[4][0] == 1){
            LSL.setText("Large Straight Spot Used");
            lStraightScore.setVisible(false);
        }
        if(lowerScoreCardArray[5][0] == 1){
            YL.setText("Yahtzee Spot Used");
            yahtzeeScore.setVisible(false);
        }
        if(lowerScoreCardArray[6][0] == 1){
            CL.setText("Chance Spot Used");
            chanceScore.setVisible(false);
        }

        if(upperScoreCardArray[0][0] == 1){ //Upper scores
            onesScoreL.setText("Ones Spot Used");
            onesScore.setVisible(false);
        }
        if (upperScoreCardArray[1][0] == 1){
            twosScoreL.setText("Twos Spot Used");
            twosScore.setVisible(false);
        }
        if (upperScoreCardArray[2][0] == 1){
            threesScoreL.setText("Threes Spot Used");
            threesScore.setVisible(false);
        }
        if (upperScoreCardArray[3][0] == 1){
            foursScoreL.setText("Fours Spot Used");
            foursScore.setVisible(false);
        }
        if (upperScoreCardArray[4][0] == 1){
            fivesScoreL.setText("Fives Spot Used");
            fivesScore.setVisible(false);
        }
        if (upperScoreCardArray[5][0] == 1){
            sixesScoreL.setText("Sixes Spot Used");
            sixesScore.setVisible(false);
        }

        if((diceSides == 8) || (diceSides == 12)){
            if (upperScoreCardArray[6][0] == 1){
                sevensL.setText("Sevens Spot Used");
                sevensScore.setVisible(false);
            }
            if (upperScoreCardArray[7][0] == 1){
                eightsL.setText("Eights Spot Used");
                eightsScore.setVisible(false);
            }
        }
        if(diceSides == 12){
            if (upperScoreCardArray[8][0] == 1){
                ninesL.setText("Nines Spot Used");
                ninesScore.setVisible(false);
            }
            if (upperScoreCardArray[9][0] == 1){
                tensL.setText("Tens Spot Used");
                tensScore.setVisible(false);
            }
            if (upperScoreCardArray[10][0] == 1){
                elevensL.setText("Elevens Spot Used");
                elevensScore.setVisible(false);
            }
            if (upperScoreCardArray[11][0] == 1){
                twelvesL.setText("Twelves Spot Used");
                twelvesScore.setVisible(false);
            }
        }
    }

    /**
     * Updates the scores in the scorecard
     */
    public void updateScore(){
        int[][] upperScoreCardArray = playerOne.getUpperScores();
        int[][] lowerScoreCardArray = playerOne.getLowerScores();
        switch(currPlayer){
            case 1:
                break;
            case 2:
                upperScoreCardArray = playerTwo.getUpperScores();
                lowerScoreCardArray = playerTwo.getLowerScores();
                break;
            case 3:
                upperScoreCardArray = playerThree.getUpperScores();
                lowerScoreCardArray = playerThree.getLowerScores();
                break;
            case 4:
                upperScoreCardArray = playerFour.getUpperScores();
                lowerScoreCardArray = playerFour.getLowerScores();
                break;
        }
        int upperSubTotal = 0;
        int bonus = 0;
        int upperTotal = 0;
        int lowerTotal = 0;
        int grandTotal = 0;

        for(int i = 0; i < upperScoreCardArray.length; i++){ //Calculates upper sub total
            upperSubTotal += upperScoreCardArray[i][1];
        }
        if(upperSubTotal >= 63){ // Checks to see if bonus applies
            bonus = 35;
        }
        for(int i = 0; i < lowerScoreCardArray.length; i++){
            lowerTotal += lowerScoreCardArray[i][1];
        }

        upperTotal = upperSubTotal + bonus; //Calculates upper total
        grandTotal = upperTotal + lowerTotal; //Calculates grand total

        switch(currPlayer){
            case 1:
                savedOnes.setText(String.valueOf(upperScoreCardArray[0][1]));
                savedTwos.setText(String.valueOf(upperScoreCardArray[1][1]));
                savedThrees.setText(String.valueOf(upperScoreCardArray[2][1]));
                savedFours.setText(String.valueOf(upperScoreCardArray[3][1]));
                savedFives.setText(String.valueOf(upperScoreCardArray[4][1]));
                savedSixes.setText(String.valueOf(upperScoreCardArray[5][1]));
                if(diceSides == 8){
                    savedSevens.setText(String.valueOf(upperScoreCardArray[6][1]));
                    savedEights.setText(String.valueOf(upperScoreCardArray[7][1]));
                }
                if(diceSides == 12){
                    savedSevens.setText(String.valueOf(upperScoreCardArray[6][1]));
                    savedEights.setText(String.valueOf(upperScoreCardArray[7][1]));
                    savedNines.setText(String.valueOf(upperScoreCardArray[8][1]));
                    savedTens.setText(String.valueOf(upperScoreCardArray[9][1]));
                    savedElevens.setText(String.valueOf(upperScoreCardArray[10][1]));
                    savedTwelves.setText(String.valueOf(upperScoreCardArray[11][1]));
                }
                subTotalSaved.setText(String.valueOf(upperSubTotal));
                bonusSaved.setText(String.valueOf(bonus));
                totalScoreSaved.setText(String.valueOf(upperTotal));
                saved3k.setText(String.valueOf(lowerScoreCardArray[0][1]));
                saved4k.setText(String.valueOf(lowerScoreCardArray[1][1]));
                savedFH.setText(String.valueOf(lowerScoreCardArray[2][1]));
                savedSStraight.setText(String.valueOf(lowerScoreCardArray[3][1]));
                savedLStraight.setText(String.valueOf(lowerScoreCardArray[4][1]));
                savedYahtzee.setText(String.valueOf(lowerScoreCardArray[5][1]));
                savedChance.setText(String.valueOf(lowerScoreCardArray[6][1]));
                savedLowerTotal.setText(String.valueOf(lowerTotal));
                savedUpperTotal.setText(String.valueOf(upperTotal));
                savedGrandTotal.setText(String.valueOf(grandTotal));
                break;
            case 2:
                savedOnes2.setText(String.valueOf(upperScoreCardArray[0][1]));
                savedTwos2.setText(String.valueOf(upperScoreCardArray[1][1]));
                savedThrees2.setText(String.valueOf(upperScoreCardArray[2][1]));
                savedFours2.setText(String.valueOf(upperScoreCardArray[3][1]));
                savedFives2.setText(String.valueOf(upperScoreCardArray[4][1]));
                savedSixes2.setText(String.valueOf(upperScoreCardArray[5][1]));
                if(diceSides == 8){
                    savedSevens2.setText(String.valueOf(upperScoreCardArray[6][1]));
                    savedEights2.setText(String.valueOf(upperScoreCardArray[7][1]));
                }
                if(diceSides == 12){
                    savedSevens2.setText(String.valueOf(upperScoreCardArray[6][1]));
                    savedEights2.setText(String.valueOf(upperScoreCardArray[7][1]));
                    savedNines2.setText(String.valueOf(upperScoreCardArray[8][1]));
                    savedTens2.setText(String.valueOf(upperScoreCardArray[9][1]));
                    savedElevens2.setText(String.valueOf(upperScoreCardArray[10][1]));
                    savedTwelves2.setText(String.valueOf(upperScoreCardArray[11][1]));
                }
                subTotalSaved2.setText(String.valueOf(upperSubTotal));
                bonusSaved2.setText(String.valueOf(bonus));
                totalScoreSaved2.setText(String.valueOf(upperTotal));
                saved3k2.setText(String.valueOf(lowerScoreCardArray[0][1]));
                saved4k2.setText(String.valueOf(lowerScoreCardArray[1][1]));
                savedFH2.setText(String.valueOf(lowerScoreCardArray[2][1]));
                savedSStraight2.setText(String.valueOf(lowerScoreCardArray[3][1]));
                savedLStraight2.setText(String.valueOf(lowerScoreCardArray[4][1]));
                savedYahtzee2.setText(String.valueOf(lowerScoreCardArray[5][1]));
                savedChance2.setText(String.valueOf(lowerScoreCardArray[6][1]));
                savedLowerTotal2.setText(String.valueOf(lowerTotal));
                savedUpperTotal2.setText(String.valueOf(upperTotal));
                savedGrandTotal2.setText(String.valueOf(grandTotal));
                break;
            case 3:
                savedOnes3.setText(String.valueOf(upperScoreCardArray[0][1]));
                savedTwos3.setText(String.valueOf(upperScoreCardArray[1][1]));
                savedThrees3.setText(String.valueOf(upperScoreCardArray[2][1]));
                savedFours3.setText(String.valueOf(upperScoreCardArray[3][1]));
                savedFives3.setText(String.valueOf(upperScoreCardArray[4][1]));
                savedSixes3.setText(String.valueOf(upperScoreCardArray[5][1]));
                if(diceSides == 8){
                    savedSevens3.setText(String.valueOf(upperScoreCardArray[6][1]));
                    savedEights3.setText(String.valueOf(upperScoreCardArray[7][1]));
                }
                if(diceSides == 12){
                    savedSevens3.setText(String.valueOf(upperScoreCardArray[6][1]));
                    savedEights3.setText(String.valueOf(upperScoreCardArray[7][1]));
                    savedNines3.setText(String.valueOf(upperScoreCardArray[8][1]));
                    savedTens3.setText(String.valueOf(upperScoreCardArray[9][1]));
                    savedElevens3.setText(String.valueOf(upperScoreCardArray[10][1]));
                    savedTwelves3.setText(String.valueOf(upperScoreCardArray[11][1]));
                }
                subTotalSaved3.setText(String.valueOf(upperSubTotal));
                bonusSaved3.setText(String.valueOf(bonus));
                totalScoreSaved3.setText(String.valueOf(upperTotal));
                saved3k3.setText(String.valueOf(lowerScoreCardArray[0][1]));
                saved4k3.setText(String.valueOf(lowerScoreCardArray[1][1]));
                savedFH3.setText(String.valueOf(lowerScoreCardArray[2][1]));
                savedSStraight3.setText(String.valueOf(lowerScoreCardArray[3][1]));
                savedLStraight3.setText(String.valueOf(lowerScoreCardArray[4][1]));
                savedYahtzee3.setText(String.valueOf(lowerScoreCardArray[5][1]));
                savedChance3.setText(String.valueOf(lowerScoreCardArray[6][1]));
                lowerTotalSaved3.setText(String.valueOf(lowerTotal));
                upperTotalSaved3.setText(String.valueOf(upperTotal));
                grandTotalSaved3.setText(String.valueOf(grandTotal));
                break;
            case 4:
                savedOnes4.setText(String.valueOf(upperScoreCardArray[0][1]));
                savedTwos4.setText(String.valueOf(upperScoreCardArray[1][1]));
                savedThrees4.setText(String.valueOf(upperScoreCardArray[2][1]));
                savedFours4.setText(String.valueOf(upperScoreCardArray[3][1]));
                savedFives4.setText(String.valueOf(upperScoreCardArray[4][1]));
                savedSixes4.setText(String.valueOf(upperScoreCardArray[5][1]));
                if(diceSides == 8){
                    savedSevens4.setText(String.valueOf(upperScoreCardArray[6][1]));
                    savedEights4.setText(String.valueOf(upperScoreCardArray[7][1]));
                }
                if(diceSides == 12){
                    savedSevens4.setText(String.valueOf(upperScoreCardArray[6][1]));
                    savedEights4.setText(String.valueOf(upperScoreCardArray[7][1]));
                    savedNines4.setText(String.valueOf(upperScoreCardArray[8][1]));
                    savedTens4.setText(String.valueOf(upperScoreCardArray[9][1]));
                    savedElevens4.setText(String.valueOf(upperScoreCardArray[10][1]));
                    savedTwelves4.setText(String.valueOf(upperScoreCardArray[11][1]));
                }
                subTotalSaved4.setText(String.valueOf(upperSubTotal));
                bonusSaved4.setText(String.valueOf(bonus));
                totalScoreSaved4.setText(String.valueOf(upperTotal));
                saved3k4.setText(String.valueOf(lowerScoreCardArray[0][1]));
                saved4k4.setText(String.valueOf(lowerScoreCardArray[1][1]));
                savedFH4.setText(String.valueOf(lowerScoreCardArray[2][1]));
                savedSStraight4.setText(String.valueOf(lowerScoreCardArray[3][1]));
                savedLStraight4.setText(String.valueOf(lowerScoreCardArray[4][1]));
                savedYahtzee4.setText(String.valueOf(lowerScoreCardArray[5][1]));
                savedChance4.setText(String.valueOf(lowerScoreCardArray[6][1]));
                lowerTotalSaved4.setText(String.valueOf(lowerTotal));
                upperTotalSaved4.setText(String.valueOf(upperTotal));
                grandTotalSaved4.setText(String.valueOf(grandTotal));
                break;
        }
    }

    /**
     * Updates the potential scores on the game screen
     */
    public void updatePotentialScores(){
        int[] potUpperArr = calculatePotUpperScores(playerOne.getHand(), playerOne.getSides());
        switch(currPlayer){
            case 1:
                break;
            case 2:
                potUpperArr = calculatePotUpperScores(playerTwo.getHand(), playerTwo.getSides());
                break;
            case 3:
                potUpperArr = calculatePotUpperScores(playerThree.getHand(), playerThree.getSides());
                break;
            case 4:
                potUpperArr = calculatePotUpperScores(playerFour.getHand(), playerFour.getSides());
                break;
        }
        int[] potLowerArr = playerOne.getPotLowerArr();
        switch(currPlayer){
            case 1:
                break;
            case 2:
                potLowerArr = playerTwo.getPotLowerArr();
                break;
            case 3:
                potLowerArr = playerThree.getPotLowerArr();
                break;
            case 4:
                potLowerArr = playerFour.getPotLowerArr();
                break;
        }
        onesScore.setText(String.valueOf(potUpperArr[0]));
        twosScore.setText(String.valueOf(potUpperArr[1]));
        threesScore.setText(String.valueOf(potUpperArr[2]));
        foursScore.setText(String.valueOf(potUpperArr[3]));
        fivesScore.setText(String.valueOf(potUpperArr[4]));
        sixesScore.setText(String.valueOf(potUpperArr[5]));

        if(diceSides == 8){
            sevensScore.setText(String.valueOf(potUpperArr[6]));
            eightsScore.setText(String.valueOf(potUpperArr[7]));
        }

        if(diceSides == 12){
            sevensScore.setText(String.valueOf(potUpperArr[6]));
            eightsScore.setText(String.valueOf(potUpperArr[7]));
            ninesScore.setText(String.valueOf(potUpperArr[8]));
            tensScore.setText(String.valueOf(potUpperArr[9]));
            elevensScore.setText(String.valueOf(potUpperArr[10]));
            twelvesScore.setText(String.valueOf(potUpperArr[11]));
        }

        threeKScore.setText(String.valueOf(potLowerArr[0]));
        fourKScore.setText(String.valueOf(potLowerArr[1]));
        fhScore.setText(String.valueOf(potLowerArr[2]));
        sStraightScore.setText(String.valueOf(potLowerArr[3]));
        lStraightScore.setText(String.valueOf(potLowerArr[4]));
        yahtzeeScore.setText(String.valueOf(potLowerArr[5]));
        chanceScore.setText(String.valueOf(potLowerArr[6]));
    }

    /**
     * Resets the potential scores to a neutral value
     */
    public void setPotentialScoreNeutral(){
        onesScore.setText("X");
        twosScore.setText("X");
        threesScore.setText("X");
        foursScore.setText("X");
        fivesScore.setText("X");
        sixesScore.setText("X");
        sevensScore.setText("X");
        eightsScore.setText("X");
        ninesScore.setText("X");
        tensScore.setText("X");
        elevensScore.setText("X");
        twelvesScore.setText("X");
        threeKScore.setText("X");
        fourKScore.setText("X");
        fhScore.setText("X");
        sStraightScore.setText("X");
        lStraightScore.setText("X");
        yahtzeeScore.setText("X");
        chanceScore.setText("X");
    }

    /**
     * Returns an array of potential upper scorecard scores
     * @return an array of potential upper scorecard scores
     */
    public int[] calculatePotUpperScores(int[] hand, int sides){
        int[] rolledDice = hand;
        int numDice = rolledDice.length;
        int[] potScores = new int[sides];

        for (int dieVal = 1; dieVal <= sides; dieVal++) {
            int count = 0;
            for (int diePos = 0; diePos < numDice; diePos++) {
                if (rolledDice[diePos] == dieVal) {
                    count++;
                }
            }
            potScores[dieVal-1] = dieVal * count; //Stores potential upper scores into an array
        }
        return potScores;
    }

    /**
     * Updates the visuals on the dice labels in the GUI
     */
    public void updateDice(){
        int[] rolledDice = playerOne.getHand();
        switch(currPlayer){
            case 1:
                break;
            case 2:
                rolledDice = playerTwo.getHand();
                break;
            case 3:
                rolledDice = playerThree.getHand();
                break;
            case 4:
                rolledDice = playerFour.getHand();
                break;
        }

        //Found this resize method here: https://stackoverflow.com/questions/16343098/resize-a-picture-to-fit-a-jlabel/16345968
        dieLabel1.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                "media" + File.separator + "Dice" + File.separator +
                "D6-0" +String.valueOf(rolledDice[0])+ ".png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        dieLabel2.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                "media" + File.separator + "Dice" + File.separator +
                "D6-0" +String.valueOf(rolledDice[1])+ ".png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        dieLabel3.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                "media" + File.separator + "Dice" + File.separator +
                "D6-0" +String.valueOf(rolledDice[2])+ ".png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        dieLabel4.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                "media" + File.separator + "Dice" + File.separator +
                "D6-0" +String.valueOf(rolledDice[3])+ ".png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        dieLabel5.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                "media" + File.separator + "Dice" + File.separator +
                "D6-0" +String.valueOf(rolledDice[4])+ ".png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        if(diceCount == 6){
            dieLabel6.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                    "media" + File.separator + "Dice" + File.separator +
                    "D6-0" +String.valueOf(rolledDice[5])+ ".png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        }
        if(diceCount == 7){
            dieLabel6.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                    "media" + File.separator + "Dice" + File.separator +
                    "D6-0" +String.valueOf(rolledDice[5])+ ".png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
            dieLabel7.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                    "media" + File.separator + "Dice" + File.separator +
                    "D6-0" +String.valueOf(rolledDice[6])+ ".png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT)));
        }

    }

    /**
     * Updates the GUI and resets it back to the start of a new hand
     */
    public void startNextHand(){
        nextHandButton.setVisible(true);
        nextHandButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextHandButton.setVisible(false);
                if(currPlayer < playerCounter){
                    currPlayer++;
                }else{
                    currPlayer = 1;
                }
                firstRoll();
                rollCounter = 1; //Resets roll counter
                rollButton.setText("Rolls Left: " + String.valueOf(2)); //Updates button name
                updateSaveButtons();
                switch (currPlayer) {
                    case 1:
                        turnMessage.setText("CURRENT TURN: " + player1Str);
                        break;
                    case 2:
                        turnMessage.setText("CURRENT TURN: " + player2Str);
                        break;
                    case 3:
                        turnMessage.setText("CURRENT TURN: " + player3Str);
                        break;
                    case 4:
                        turnMessage.setText("CURRENT TURN: " + player4Str);
                        break;
                }
            }
        });

    }

    public void setUsernames(){
        userNameConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String playerCountStr = playerCB.getSelectedItem().toString();
                int playerCountVal = Integer.parseInt(playerCountStr);
                //Player name adjustments
                PlayerNameWindow playerNamePrompt = new PlayerNameWindow("Username Select", playerCountVal);
                playerNamePrompt.setVisible(true);
                userNameConfirmButton.setVisible(false);
                confirmSettingsButton.setVisible(true);
            }
        });
    }

    /**
     * Updates the settings in the game
     */
    public void updateSettings(){
        confirmSettingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmSettingsButton.setText("*Settings Saved*");
                String dieSideStr = dieSideCB.getSelectedItem().toString();
                String dieCountStr = dieCountCB.getSelectedItem().toString();
                String playerCountStr = playerCB.getSelectedItem().toString();

                int dieSideVal = Integer.parseInt(dieSideStr);
                int dieCountVal = Integer.parseInt(dieCountStr);
                int playerCountVal = Integer.parseInt(playerCountStr);

                diceCount = dieCountVal;
                diceSides = dieSideVal;

                if(dieSideVal == 6){
                    playerOne.setDieSides(dieSideVal);
                    if(playerCountVal == 2){
                        playerTwo.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 3){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 4){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                        playerFour.setDieSides(dieSideVal);
                    }
                    diceSides = dieSideVal;
                    sevensL.setVisible(false);
                    eightsL.setVisible(false);
                    ninesL.setVisible(false);
                    tensL.setVisible(false);
                    elevensL.setVisible(false);
                    twelvesL.setVisible(false);

                    sevensScore.setVisible(false);
                    eightsScore.setVisible(false);
                    ninesScore.setVisible(false);
                    tensScore.setVisible(false);
                    elevensScore.setVisible(false);
                    twelvesScore.setVisible(false);

                    sevensLSC.setVisible(false);
                    eightsLSC.setVisible(false);
                    ninesLSC.setVisible(false);
                    tensLSC.setVisible(false);
                    elevensLSC.setVisible(false);
                    twelvesLSC.setVisible(false);

                    sevensLSC2.setVisible(false);
                    eightsLSC2.setVisible(false);
                    ninesLSC2.setVisible(false);
                    tensLSC2.setVisible(false);
                    elevensLSC2.setVisible(false);
                    twelvesLSC2.setVisible(false);

                    sevensLSC3.setVisible(false);
                    eightsLSC3.setVisible(false);
                    ninesLSC3.setVisible(false);
                    tensLSC3.setVisible(false);
                    elevensLSC3.setVisible(false);
                    twelvesLSC3.setVisible(false);

                    sevensLSC4.setVisible(false);
                    eightsLSC4.setVisible(false);
                    ninesLSC4.setVisible(false);
                    tensLSC4.setVisible(false);
                    elevensLSC4.setVisible(false);
                    twelvesLSC4.setVisible(false);

                    savedSevens.setVisible(false);
                    savedEights.setVisible(false);
                    savedNines.setVisible(false);
                    savedTens.setVisible(false);
                    savedElevens.setVisible(false);
                    savedTwelves.setVisible(false);

                    savedSevens2.setVisible(false);
                    savedEights2.setVisible(false);
                    savedNines2.setVisible(false);
                    savedTens2.setVisible(false);
                    savedElevens2.setVisible(false);
                    savedTwelves2.setVisible(false);

                    savedSevens3.setVisible(false);
                    savedEights3.setVisible(false);
                    savedNines3.setVisible(false);
                    savedTens3.setVisible(false);
                    savedElevens3.setVisible(false);
                    savedTwelves3.setVisible(false);

                    savedSevens4.setVisible(false);
                    savedEights4.setVisible(false);
                    savedNines4.setVisible(false);
                    savedTens4.setVisible(false);
                    savedElevens4.setVisible(false);
                    savedTwelves4.setVisible(false);
                }
                if(dieSideVal == 8){
                    playerOne.setDieSides(dieSideVal);
                    if(playerCountVal == 2){
                        playerTwo.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 3){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 4){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                        playerFour.setDieSides(dieSideVal);
                    }
                    diceSides = dieSideVal;
                    ninesL.setVisible(false);
                    tensL.setVisible(false);
                    elevensL.setVisible(false);
                    twelvesL.setVisible(false);

                    ninesScore.setVisible(false);
                    tensScore.setVisible(false);
                    elevensScore.setVisible(false);
                    twelvesScore.setVisible(false);

                    ninesLSC.setVisible(false);
                    tensLSC.setVisible(false);
                    elevensLSC.setVisible(false);
                    twelvesLSC.setVisible(false);

                    ninesLSC2.setVisible(false);
                    tensLSC2.setVisible(false);
                    elevensLSC2.setVisible(false);
                    twelvesLSC2.setVisible(false);

                    ninesLSC3.setVisible(false);
                    tensLSC3.setVisible(false);
                    elevensLSC3.setVisible(false);
                    twelvesLSC3.setVisible(false);

                    ninesLSC4.setVisible(false);
                    tensLSC4.setVisible(false);
                    elevensLSC4.setVisible(false);
                    twelvesLSC4.setVisible(false);

                    savedNines.setVisible(false);
                    savedTens.setVisible(false);
                    savedElevens.setVisible(false);
                    savedTwelves.setVisible(false);

                    savedNines2.setVisible(false);
                    savedTens2.setVisible(false);
                    savedElevens2.setVisible(false);
                    savedTwelves2.setVisible(false);

                    savedNines3.setVisible(false);
                    savedTens3.setVisible(false);
                    savedElevens3.setVisible(false);
                    savedTwelves3.setVisible(false);

                    savedNines4.setVisible(false);
                    savedTens4.setVisible(false);
                    savedElevens4.setVisible(false);
                    savedTwelves4.setVisible(false);
                }
                if(dieSideVal == 12){
                    playerOne.setDieSides(dieSideVal);
                    if(playerCountVal == 2){
                        playerTwo.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 3){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 4){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                        playerFour.setDieSides(dieSideVal);
                    }
                    diceSides = dieSideVal;
                    dieLabel6.setVisible(true);
                    dieLabel7.setVisible(true);
                    keepDie6.setVisible(true);
                    keepDie7.setVisible(true);

                    sevensL.setVisible(true);
                    eightsL.setVisible(true);
                    ninesL.setVisible(true);
                    tensL.setVisible(true);
                    elevensL.setVisible(true);
                    twelvesL.setVisible(true);

                    sevensScore.setVisible(true);
                    eightsScore.setVisible(true);
                    ninesScore.setVisible(true);
                    tensScore.setVisible(true);
                    elevensScore.setVisible(true);
                    twelvesScore.setVisible(true);
                }

                if(dieCountVal == 5){
                    playerOne.setDieCount(dieCountVal);
                    if(playerCountVal == 2){
                        playerTwo.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 3){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 4){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                        playerFour.setDieSides(dieSideVal);
                    }
                    diceCount = dieCountVal;
                    dieLabel6.setVisible(false);
                    dieLabel7.setVisible(false);
                    keepDie6.setVisible(false);
                    keepDie7.setVisible(false);
                }
                if(dieCountVal == 6){
                    playerOne.setDieCount(dieCountVal);
                    if(playerCountVal == 2){
                        playerTwo.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 3){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 4){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                        playerFour.setDieSides(dieSideVal);
                    }
                    diceCount = dieCountVal;
                    dieLabel6.setVisible(true);
                    dieLabel7.setVisible(false);
                    keepDie6.setVisible(true);
                    keepDie7.setVisible(false);
                }
                if(dieCountVal == 7){
                    playerOne.setDieCount(dieCountVal);
                    if(playerCountVal == 2){
                        playerTwo.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 3){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                    }
                    if(playerCountVal == 4){
                        playerTwo.setDieSides(dieSideVal);
                        playerThree.setDieSides(dieSideVal);
                        playerFour.setDieSides(dieSideVal);
                    }
                    diceCount = dieCountVal;
                    dieLabel6.setVisible(true);
                    dieLabel7.setVisible(true);
                    keepDie6.setVisible(true);
                    keepDie7.setVisible(true);
                }
                confirmMsg.setVisible(true);
                playerOne.setGameConfigs();
                tabPane.setEnabledAt(1, true);
                tabPane.setEnabledAt(2, true);
                tabPane.setEnabledAt(3, true);
                tabPane.setEnabledAt(4, true);
                tabPane.setEnabledAt(5, true);

                //Initializes configurations depending on number of players
                if(playerCountVal == 1){
                    try{
                        Scanner inputFile = new Scanner((new File(System.getProperty("user.dir") + "\\playerNames.txt")));
                        player1Str = inputFile.nextLine();
                        inputFile.close();
                    }catch(FileNotFoundException ex){
                        System.out.println("File not found");
                    }
                    tabPane.removeTabAt(3);
                    tabPane.removeTabAt(3);
                    tabPane.removeTabAt(3);
                    tabPane.setTitleAt(2, player1Str);
                }
                if(playerCountVal == 2){
                    try{
                        Scanner inputFile = new Scanner((new File(System.getProperty("user.dir") + "\\playerNames.txt")));
                        player1Str = inputFile.nextLine();
                        player2Str = inputFile.nextLine();
                        inputFile.close();
                    }catch(FileNotFoundException ex){
                        System.out.println("File not found");
                    }
                    playerTwo.setGameConfigs();
                    playerCounter = 2;
                    tabPane.removeTabAt(4);
                    tabPane.removeTabAt(4);
                    tabPane.setTitleAt(2, player1Str);
                    tabPane.setTitleAt(3, player2Str);
                }
                if(playerCountVal == 3){
                    try{
                        Scanner inputFile = new Scanner((new File(System.getProperty("user.dir") + "\\playerNames.txt")));
                        player1Str = inputFile.nextLine();
                        player2Str = inputFile.nextLine();
                        player3Str = inputFile.nextLine();
                        inputFile.close();
                    }catch(FileNotFoundException ex){
                        System.out.println("File not found");
                    }
                    playerTwo.setGameConfigs();
                    playerThree.setGameConfigs();
                    playerCounter = 3;
                    tabPane.removeTabAt(5);
                    tabPane.setTitleAt(2, player1Str);
                    tabPane.setTitleAt(3, player2Str);
                    tabPane.setTitleAt(4, player3Str);
                }
                if(playerCountVal == 4){
                    try{
                        Scanner inputFile = new Scanner((new File(System.getProperty("user.dir") + "\\playerNames.txt")));
                        player1Str = inputFile.nextLine();
                        player2Str = inputFile.nextLine();
                        player3Str = inputFile.nextLine();
                        player4Str = inputFile.nextLine();
                        inputFile.close();
                    }catch(FileNotFoundException ex){
                        System.out.println("File not found");
                    }
                    playerTwo.setGameConfigs();
                    playerThree.setGameConfigs();
                    playerFour.setGameConfigs();
                    playerCounter = 4;
                    tabPane.setTitleAt(2, player1Str);
                    tabPane.setTitleAt(3, player2Str);
                    tabPane.setTitleAt(4, player3Str);
                    tabPane.setTitleAt(5, player4Str);
                }
                turnMessage.setText("CURRENT TURN: " + player1Str);
                firstRoll();
            }
        });
    }

    /**
     * Initializes the custom GUI dice labels with default images before use
     */
    private void createUIComponents() {
        ImageIcon defaultImg = new ImageIcon(new ImageIcon(System.getProperty("user.dir") + File.separator +
                "media" + File.separator + "Dice" + File.separator +
                "D6-01.png").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));

        dieLabel1 = new JLabel(defaultImg);
        dieLabel2 = new JLabel(defaultImg);
        dieLabel3 = new JLabel(defaultImg);
        dieLabel4 = new JLabel(defaultImg);
        dieLabel5 = new JLabel(defaultImg);

    }
}