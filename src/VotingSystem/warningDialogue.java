package VotingSystem;

import javax.swing.*;

public class warningDialogue {
    private JPanel warningPanel;
    //private JLabel warningText = new JLabel("<html>You can't select multiple <br> Aspirants under the same category.");

    public warningDialogue () {
        JFrame warningFrame = new JFrame("Invalid Choices");
        warningFrame.add(warningPanel);
        //warningPanel.add(warningText);
        warningFrame.setResizable(false);
        warningFrame.setLocationRelativeTo(null);
        warningFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        warningFrame.pack();
        warningFrame.setVisible(true);
    }
}
