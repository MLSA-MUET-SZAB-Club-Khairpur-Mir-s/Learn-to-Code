package Java;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Jframe extends JFrame {
    JButton button= new JButton();
    Jframe(){
        JFrame frame=new JFrame();//creates a frame
        frame.setTitle("mCoder");
        frame.setVisible(true);//sets title fo frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the frame
      //  frame.setResizable(false);//prevent frame from being resized
        frame.setSize(420,420);//sets the x and y dimensions to frame
        frame.setLayout(null);
        button.addActionListener(e -> System.out.println("I can change the world, just give me source code"));//lambda expression
     //   button.addActionListener(this);
        button.setBounds(100,100,100,50);
        button.setText("mCoder");
        button.setBackground(Color.red);
        button.setFocusable(false);
       // button.setEnabled(false);
        frame.add(button);


    }
}
public class JavaGUI_02Button {
    public static void main(String args[]){
        //JButton = a button that performs an action when clicked on
        Jframe frame=new Jframe();
    }
}
