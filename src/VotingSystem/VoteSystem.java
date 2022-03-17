package VotingSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VoteSystem {
    private JPanel votePanel;
    private JLabel presCurrentVotes1;
    private JCheckBox presidentCheckBox1;
    private JCheckBox presidentCheckBox2;
    private JCheckBox secCheckbox1;
    private JCheckBox secCheckbox2;
    private JCheckBox secCheckbox3;
    private JCheckBox treasCheckBox1;
    private JCheckBox treasCheckBox2;
    private JLabel presCurrentVotes2;
    private JLabel secCurrentVotes1;
    private JLabel secCurrentVotes2;
    private JLabel secCurrentVotes3;
    private JLabel treasCurrentVote1;
    private JLabel treasCurrentVote2;
    private JButton submitVoteButton;
    private int presCurrentVotes1Sum = 0;
    private int presCurrentVotes2Sum = 0;
    private int secCurrentVote1Sum = 0;

    public int getSecCurrentVote1Sum() {
        return secCurrentVote1Sum;
    }

    private int SecCurrentVote2Sum = 0;
    private int SecCurrentVote3Sum = 0;
    private int treasCurrentVote1Sum = 0;
    private int treasCurrentVote2Sum = 0;

//Empty constructor


    public VoteSystem() {
        JFrame voteFrame = new JFrame("Voting System");
        voteFrame.add(votePanel);
        voteFrame.setTitle("Vote Now");
        voteFrame.setLocationRelativeTo(null);
        voteFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        voteFrame.setJMenuBar(createMenu());
        voteFrame.pack();
        voteFrame.setVisible(true);



        //Submit vote Action Listener
        submitVoteButton.addActionListener(e -> {
            //Presidents Votes
            if (presidentCheckBox1.isSelected()) {
                presCurrentVotes1Sum +=1;
                presCurrentVotes1.setText(String.valueOf(presCurrentVotes1Sum));
            }
            if (presidentCheckBox2.isSelected()){
                presCurrentVotes2Sum += 1;
                presCurrentVotes2.setText(String.valueOf(presCurrentVotes2Sum));
            }
            //Secretaries Votes
            if (secCheckbox1.isSelected()) {
                secCurrentVote1Sum += 1;
                secCurrentVotes1.setText(String.valueOf(secCurrentVote1Sum));
            }
            if (secCheckbox2.isSelected()) {
                SecCurrentVote2Sum += 1;
                secCurrentVotes2.setText(String.valueOf(SecCurrentVote2Sum));
            }

            if (secCheckbox3.isSelected()) {
                SecCurrentVote3Sum += 1;
                secCurrentVotes3.setText(String.valueOf(SecCurrentVote3Sum));
            }

            //Treasurers
            if (treasCheckBox1.isSelected()) {
                treasCurrentVote1Sum += 1;
                treasCurrentVote1.setText(String.valueOf(treasCurrentVote1Sum));
            }

            if (treasCheckBox2.isSelected()) {
                treasCurrentVote2Sum += 1;
                treasCurrentVote2.setText(String.valueOf(treasCurrentVote1Sum));
            }
        });




    }
    public  JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu display = new JMenu("Display");
        JMenu help = new JMenu("Help");
        JMenuItem add = new JMenuItem("Add");
        JMenuItem newVote = new JMenuItem("New");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem result = new JMenuItem("Results");
        JMenuItem about = new JMenuItem("ABout");

        file.add(newVote);
        file.add(add);
        file.add(exit);
        display.add(result);
        help.add(about);
        menuBar.add(file);
        menuBar.add(display);
        menuBar.add(help);

        //Action Listeners
        result.addActionListener(e -> {

            results result1 =new results();
            result1.setEvansResult(String.valueOf(presCurrentVotes1Sum));
            result1.setDanquahResult(String.valueOf(presCurrentVotes2Sum));
            result1.setAliceResult(String.valueOf(secCurrentVote1Sum));
            result1.setBempzResult(String.valueOf(SecCurrentVote2Sum));
            result1.setCharlseResult(String.valueOf(SecCurrentVote3Sum));
            result1.setBoagyeResult(String.valueOf(treasCurrentVote1Sum));
            result1.setBrightResult(String.valueOf(treasCurrentVote2Sum));
//
        });



        return menuBar;
    }
}
