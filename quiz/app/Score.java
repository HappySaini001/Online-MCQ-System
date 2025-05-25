package quiz.app;

import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {
    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Thank you " + name + " for playing!");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel scoreLabel = new JLabel("Your Score is: " + score);
        scoreLabel.setBounds(350, 200, 300, 30);
        scoreLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(scoreLabel);

        setVisible(true);
    }
}
