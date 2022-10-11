package Java;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

public class JavaGUI_02Panel {
    public static void main(String args[]){
        // JPanel = a GUI component that functions as a container to hold other components
        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,100,100);
        redPanel.setToolTipText("Rajesh");

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(100,0,100,100);
        greenPanel.setToolTipText("Kumar");

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200,0,100,100);
        bluePanel.setToolTipText("Menghwar");

        JPanel blackPanel=new JPanel();
        blackPanel.setBackground(Color.black);
        blackPanel.setBounds(0,100,300,100);

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);
        frame.add(blackPanel);

    }
}
