import java.awt.*;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;      
class AWT_Example {    
   //hello world
    AWT_Example(){   
        Frame f = new Frame();    
        Label l = new Label("         NAME OF GAME ");  

        Button b1 = new Button("  1  "); 
        Button b2 = new Button("  2  ");  
        Button b3 = new Button("  3  ");  
        Button b4 = new Button("  4  ");  
        Button b5 = new Button("  5  ");  
        Button b6 = new Button("  6  ");  
        Button b7 = new Button("  7  ");  
        Button b8 = new Button("  8  ");
        Button b9 = new Button("");

        Button bA = new Button(" NG ");
        Button bB = new Button(" Reset ");  
        Button bC = new Button(" Exit ");    
        
 
        // managing the above buttons
          
        l.setBounds(70, 50, 150, 30);

        b1.setBounds(70, 80, 50,50 );
        b2.setBounds(120, 80, 50, 50);
        b3.setBounds(170, 80, 50, 50);
        b4.setBounds(70, 130, 50, 50);
        b5.setBounds(120, 130, 50, 50);
        b6.setBounds(170, 130, 50, 50);
        b7.setBounds(70, 180, 50, 50);
        b8.setBounds(120, 180, 50, 50);
        b9.setBounds(170, 180, 50, 50);
        bA.setBounds(70, 240, 50, 30);
        bB.setBounds(120, 240, 50, 30);
        bC.setBounds(170, 240, 50, 30);
      
        // frames are being added to component   
        f.add(l);
    
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bA);
        f.add(bB);
        f.add(bC);
       
        
        l.setBackground(Color.black);
        l.setForeground(Color.white);
        f.setBackground(Color.yellow);
        bA.setBackground(Color.black);
        bA.setForeground(Color.white);
        bB.setBackground(Color.black);
        bB.setForeground(Color.white);
        bC.setBackground(Color.black);
        bC.setForeground(Color.white);
        // frame size 300 width and 330 height    
        f.setSize(300,330);  
        // title of frame
        f.setTitle("GAME FRAME");     
        // null layout  
        f.setLayout(null);   
        // frame visiablity  
        f.setVisible(true);  

        
    }    
}

public class AWTExample{
    public static void main(String args[]){     
        AWT_Example awt_obj = new AWT_Example4();    
    }  
}
