
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {

    JButton rules,back;
    JTextField tfName;

    Login() {
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);
          
        // this will add an image in Login Page
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("imgs/profile.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 900, 800);
        add(image);

        JLabel heading=new JLabel("Quiz2Me");
        heading.setBounds(790, 300, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD,48));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(810, 350, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,22));
        name.setForeground(Color.BLACK);
        add(name);

        tfName=new JTextField();
        tfName.setBounds(735,400,300,25);
        tfName.setFont(new Font("Times New Roaman",Font.BOLD,20));
        add(tfName);

        // ### Buttons ###
        rules=new JButton("Rules");
        rules.setBounds(735, 470, 80, 25);
        // rules.setBackground(new Color(GRAY));
        rules.setBackground(Color.WHITE);        
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(850, 470, 80, 25);
        back.setBackground(Color.WHITE);        
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 200);
        setVisible(true);
    }
    // to override abstract methods 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name= tfName.getText();
            setVisible(false);
            new Rules(name);  // this will open rules window
        }
         else if(ae.getSource()==back){
            setVisible(false);
        } 
    }

    public static void main(String[] args) {
        Login l = new Login();

    }
}
