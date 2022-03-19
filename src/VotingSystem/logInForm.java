package VotingSystem;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class logInForm{
    private JPanel framePanel;
    private JTextField studentIDTF;
    private JTextField studentNameTF;
    private JButton logInBtn;
    private JLabel errorTF;


    String[] id = {"01203929D", "D", "01202600D", "01201311D", "01203928D", "01202195D", "01201425D", "01202440D", "01200637D", "0123902D"};
    //Convert id array to arraylist
    List<String> studentID = Arrays.asList(id);


    public logInForm () {
        JFrame frame = new JFrame("Log in");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(350, 350));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        errorTF.setVisible(false);
        //set Content Panel

        frame.add(framePanel);
        frame.pack();
        frame.setVisible(true);

        //Action listener to grant log in if info is valid
        logInBtn.addActionListener(e -> {
            if (studentID.contains(studentIDTF.getText().toUpperCase(Locale.ROOT))) {
                new VoteSystem();
                frame.dispose();
            }
            else {
                errorTF.setText("Invalid ID");
                errorTF.setForeground(Color.RED);
                errorTF.setVisible(true);
            }
        });
    }

}
