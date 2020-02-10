import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//w tym pliku znajoduje się kod na randomowe rzucanie koścmi
    public class Dice implements ActionListener{
        private JLabel one;

        public Dice(JLabel one){
            this.one = one;
        }

    public void actionPerformed(ActionEvent e){
        int random = (int)(Math.random()*6)+1;
        int punkty = 0;
        int p1 =0, p2 = 0, p3 =0, p4 = 0, p5 =0, p6 =0;

        if (random == 1) {
            one.setIcon(new ImageIcon(getClass().getResource("/1.png")));
            System.out.println("Wybrano 1.png");
            p1 = 1;
        }
        else if(random == 2) {
            one.setIcon(new ImageIcon(getClass().getResource("/2.png")));
            System.out.println("Wybrano 2.png");
            p2 = 2;
        }
        else if(random == 3) {
            one.setIcon(new ImageIcon(getClass().getResource("/3.png")));
            System.out.println("Wybrano 3.png");
            p3 = 3;
        }
        else if(random == 4) {
            one.setIcon(new ImageIcon(getClass().getResource("/4.png")));
            System.out.println("Wybrano 4.png");
            p4 = 4;
        }
        else if(random == 5) {
            one.setIcon(new ImageIcon(getClass().getResource("/5.png")));
            System.out.println("Wybrano 5.png");
            p5 = 5;
        }
        else if(random == 6){
                one.setIcon(new ImageIcon(getClass().getResource("/6.png")));
                System.out.println("Wybrano 6.png");
                p6 = 6;
        }

        int sumofdice = p1 +p2 +p3+p4+p5+p6 ;
        System.out.println(sumofdice);

    }

}


