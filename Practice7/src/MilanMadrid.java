import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MilanMadrid extends JFrame {
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel score = new JLabel("Result 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    int milanScore = 0, madridScore = 0;
    public MilanMadrid() {
        super("AC Milan X Real Madrid");
        setLayout(new FlowLayout());
        setSize(500, 500);
        add(milan);
        add(madrid);
        add(score);
        add(lastScorer);
        add(winner);
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                score.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: AC Milan");
                if (milanScore > madridScore) {
                    winner.setText("Winner: AC Milan");
                } else if (madridScore > milanScore) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                madridScore++;
                score.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                if (milanScore > madridScore) {
                    winner.setText("Winner: AC Milan");
                } else if (madridScore > milanScore) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        setVisible(true);
    }
    public static void main(String args[]) {
        new MilanMadrid();
    }
}