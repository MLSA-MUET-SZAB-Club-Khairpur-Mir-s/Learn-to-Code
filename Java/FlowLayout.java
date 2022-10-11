package Java;

import javax.swing.*;
import java.awt.*;

public class JavaGUI_04GFlow {
    //Layout Manager = Defines the natural layout for components within a container
    //Grid Layout = places components in a grid of cells
    //              Each component's takes all the available space within its cell,
    //               and each cell is the same size.
    JavaGUI_04GFlow(){
        JFrame frame=new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);


    }
    public static void main(String args[]){
        JavaGUI_04GFlow obj=new JavaGUI_04GFlow();
    }
}
