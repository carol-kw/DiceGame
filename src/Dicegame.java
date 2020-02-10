import javafx.scene.paint.Color;

import javax.swing.*;



public class Dicegame {
    private JPanel Dicegame;
    private JPanel Player1;
    private JPanel Player2;
    private JButton roll1;
    private JButton roll2;
    private JLabel one;
    private JLabel two;
    private JLabel three;
    private JLabel four;
    private JLabel five;
    private JLabel six;

    public Dicegame() {

        //Player1
        roll1.addActionListener(new Dice(one));
        roll1.addActionListener(new Dice((two)));
        roll1.addActionListener(new Dice((three)));
        roll1.addActionListener(new Dice((four)));
        roll1.addActionListener(new Dice((five)));
        roll1.addActionListener(new Dice((six)));

        //Player2
        roll2.addActionListener(new Dice(one));
        roll2.addActionListener(new Dice((two)));
        roll2.addActionListener(new Dice((three)));
        roll2.addActionListener(new Dice((four)));
        roll2.addActionListener(new Dice((five)));
        roll2.addActionListener(new Dice((six)));
    }


    //ustawienia ogole
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dice");
        frame.setContentPane(new Dicegame().Dicegame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(400,200);
        frame.setSize(550,400) ;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
