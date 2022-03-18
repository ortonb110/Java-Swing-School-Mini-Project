package VotingSystem;

import javax.swing.*;

public class about {
    private JPanel aboutPanel;

    public about () {
        JFrame aboutFrame = new JFrame("About");
        aboutFrame.setContentPane(aboutPanel);
        aboutFrame.setTitle("COPYRIGHT INFORMATION");
        aboutFrame.setResizable(false);
        aboutFrame.setLocationRelativeTo(null);
        aboutFrame.pack();
        aboutFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        aboutFrame.setVisible(true);
    }

}
