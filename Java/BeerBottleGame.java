import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class Game {

    JFrame frame;
    JLabel l1, l2, l3, l4, l5, showInput, result, win;
    JPanel imagePanel, inputPanel;
    JLabel[] beers;
    JTextField count;
    JButton action;
    Random rd=new Random();
    int present;

    Font verdana=new Font("Verdana", Font.PLAIN, 18);

    Game() {
        present=20;

        frame = new JFrame();
        frame.setSize(800, 730);
        frame.setTitle("Beer Bottles Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        l1 = new JLabel();
        l1.setText("The 21 Beer Bottles Game");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setBounds(0, 0, 800, 30);
        l1.setFont(verdana);

        l2 = new JLabel();
        l2.setText("You and Computer are the players");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setBounds(0, 30, 800, 30);
        l2.setFont(verdana);

        l3 = new JLabel();
        l3.setText("Each one would pick only between 1 to 4");
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setBounds(0, 60, 800, 30);
        l3.setFont(verdana);

        l4 = new JLabel();
        l4.setText("The one picking up last bottle is loser and will pay the bill");
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setBounds(0, 90, 800, 30);
        l4.setFont(verdana);

        l5 = new JLabel();
        l5.setText("Remaining Bottles");
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setBounds(0, 150, 800, 30);
        l5.setFont(verdana);


        imagePanel = new JPanel();
        imagePanel.setLayout(new GridLayout(3, 7, 10, 10));
        imagePanel.setBounds(50, 180, 700, 300);
        imagePanel.setBackground(Color.LIGHT_GRAY);

        beers = new JLabel[21];
        for(int i=0; i<21; i++) {
            beers[i] = new JLabel();
            beers[i].setSize(new Dimension(100, 100));
            beers[i].setIcon(new ImageIcon("src/img.png"));
            beers[i].setHorizontalAlignment(JLabel.CENTER);
            beers[i].setOpaque(true);
            imagePanel.add(beers[i]);
        }

        inputPanel = new JPanel();
        inputPanel.setBounds(0, 480, 800, 220);
        inputPanel.setBackground(Color.CYAN);
        inputPanel.setLayout(null);

        JPanel panel=new JPanel();
        panel.setBounds(0, 500, 800, 100);
        panel.setLayout(null);

        JLabel you=new JLabel("You");
        you.setBounds(230, 500, 50, 30);
        you.setFont(verdana);

        count = new JTextField();
        count.setBounds(280, 500, 200, 30);
        count.setFont(verdana);
        count.addActionListener(e -> {
            play();
        });

        action = new JButton("Pick");
        action.setBounds(480, 500, 70, 30);
        action.setFont(verdana);
        action.setFocusable(false);
        action.addActionListener(e -> {
            play();
        });

        frame.add(you);
        frame.add(count);
        frame.add(action);

        showInput = new JLabel();
        showInput.setText("Computer has choosed 5");
        showInput.setHorizontalAlignment(JLabel.CENTER);
        showInput.setBounds(0, 70, 800, 30);
        showInput.setFont(verdana);

        result = new JLabel();
        result.setText("Remaining bottles are 18");
        result.setHorizontalAlignment(JLabel.CENTER);
        result.setBounds(0, 100, 800, 30);
        result.setFont(verdana);

        win = new JLabel();
        win.setBounds(0, 140, 800, 80);
        win.setBackground(Color.ORANGE);
        win.setOpaque(true);
        win.setFont(verdana);
        win.setHorizontalAlignment(JLabel.CENTER);
        win.setVisible(false);

        inputPanel.add(showInput);
        inputPanel.add(result);
        inputPanel.add(win);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(imagePanel);
        frame.add(inputPanel);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void removeBeers(int nbr) {
        while(nbr>0){
            beers[present].setIcon(null);
            present--;
            nbr--;
        }
    }

    public void checkForWin(int caller) {

        if(caller==1) {

            if(present==0){
                win.setText("Computer will have to pickup the last. You win");
                win.setVisible(true);
            }

            else if(present==-1) {
                win.setText("You have picked up the last. Pay the bill");
                win.setVisible(true);
            }
        }

        else if(caller==2) {
            if(present==0) {
                win.setText("You will have to pickup the last. Pay the bill");
                win.setVisible(true);
            }

            else if(present==-1) {
                win.setText("Computer have picked up the last. You win");
                win.setVisible(true);
            }
        }
    }

    public void play() {

        if(win.isVisible()) {
            return;
        }

        if(Integer.parseInt(count.getText())>=1 && Integer.parseInt(count.getText())<=4) {
            int nbr=Integer.parseInt(count.getText());

            if(nbr>=present+1) {
                removeBeers(present+1);
            }
            else {
                removeBeers(nbr);
            }

            checkForWin(1);
        }

        else {
            return;
        }

        if(win.isVisible()){
            return;
        }

        int com=Math.abs(rd.nextInt()%4)+1;

        if(com>=present+1) {
            removeBeers(present);
            showInput.setText("The computer has picked:  " + (present+1));
        }

        else {
            removeBeers(com);
            showInput.setText("The computer has picked:  " + com);
        }

        result.setText("The remaining Bottles are: " + (present+1));
        checkForWin(2);
    }
}

public class BeerBottleFGame {
    public static void main(String[] args) {
        Game game=new Game();
    }
}
