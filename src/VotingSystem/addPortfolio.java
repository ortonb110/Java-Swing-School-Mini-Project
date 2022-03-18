package VotingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addPortfolio {
    private JPanel portfolioPanel;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton cancelButton;
    private JButton addButton;

    public addPortfolio() {
        JFrame addFrame = new JFrame("Add");
        addFrame.setContentPane(portfolioPanel);
        addFrame.setResizable(false);
        addFrame.setTitle("Add Candidate");
        addFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addFrame.setLocationRelativeTo(null);
        addFrame.pack();
        addFrame.setVisible(true);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addFrame.dispose();
            }
        });
    }
}
