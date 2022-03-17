package VotingSystem;

import javax.swing.*;
import java.awt.*;

public class results {
    private JPanel resultPanel;
    private JLabel evansResult;
    private JLabel danquahResult;
    private JLabel charlseResult;
    private JLabel aliceResult;
    private JLabel boagyeResult;
    private JLabel brightResult;
    private JLabel bempzResult;

    //Methods to set results in voting system class
    public void setEvansResult(String res) {
        evansResult.setText(res);
    }

    public void setDanquahResult(String res) {
        danquahResult.setText(res);
    }

    public void setCharlseResult(String res) {
        charlseResult.setText(res);
    }

    public void setAliceResult(String res) {
        aliceResult.setText(res);
    }

    public void setBoagyeResult(String res) {
        boagyeResult.setText(res);
    }

    public void setBrightResult(String res) {
        brightResult.setText(res);
    }

    public void setBempzResult(String res) {
        bempzResult.setText(res);
    }



    public results() {


        JFrame resultFrame = new JFrame("Result");
        resultFrame.add(resultPanel);
        resultFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        resultFrame.pack();
        resultFrame.setLocationRelativeTo(null);
        resultFrame.setResizable(false);
        resultFrame.setVisible(true);


    }




}
