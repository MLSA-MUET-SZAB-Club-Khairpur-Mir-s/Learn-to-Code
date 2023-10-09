import java.awt.*;    
import javax.swing.*;    
    
public class Border{    
JFrame f;    
Border(){    
    f = new JFrame();    
        
     // buttons  
    JButton b1 = new JButton("NORTH");; // the button will be labeled as NORTH   
    JButton b2 = new JButton("SOUTH");; // the button will be labeled as SOUTH  
    JButton b3 = new JButton("EAST");; // the button will be labeled as EAST  
    JButton b4 = new JButton("WEST");; // the button will be labeled as WEST  
      
    f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
    f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
    f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
    f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
      
        
    f.setSize(300, 300);    
    f.setVisible(true);    
}    
public static void main(String[] args) {    
    new Border();    
}    
}    
