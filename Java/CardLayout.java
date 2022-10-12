import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;  
  
public class CardLayout extends JFrame   
{  
  
// Initializing the value of  
// currCard to 1 .  
private int currCard = 1;  
  
// Declaring of objects  
// of the CardLayout class.  
private CardLayout cObjl;  
  
// constructor of the class  
public CardLayoutExample3()  
{  
  
// Method to set the Title of the JFrame  
setTitle("Card Layout Methods");  
  
// Method to set the visibility of the JFrame  
setSize(310, 160);  
  
// Creating an Object of the "Jpanel" class  
JPanel cPanel = new JPanel();  
  
// Initializing of the object "cObjl"  
// of the CardLayout class.  
cObjl = new CardLayout();  
  
// setting the layout  
cPanel.setLayout(cObjl);  
  
// Initializing the object  
// "jPanel1" of the JPanel class.  
JPanel jPanel1 = new JPanel();  
  
// Initializing the object  
// "jPanel2" of the CardLayout class.  
JPanel jPanel2 = new JPanel();  
  
// Initializing the object  
// "jPanel3" of the CardLayout class.  
JPanel jPanel3 = new JPanel();  
  
// Initializing the object  
// "jPanel4" of the CardLayout class.  
JPanel jPanel4 = new JPanel();  
  
// Initializing the object  
JLabel jLabel1 = new JLabel("C1");  
  
JLabel jLabel2 = new JLabel("C2");  
  
JLabel jLabel3 = new JLabel("C3");  
  
JLabel jLabel4 = new JLabel("C4");  
  
jPanel1.add(jLabel1);  
  
jPanel2.add(jLabel2);  
  
jPanel3.add(jLabel3);  
  
jPanel4.add(jLabel4);  
  
cPanel.add(jPanel1, "1");  
  
cPanel.add(jPanel2, "2");  
  
cPanel.add(jPanel3, "3");  
  
cPanel.add(jPanel4, "4");  
  
JPanel btnPanel = new JPanel();  
  
JButton firstButton = new JButton("First");  
  
JButton nextButton = new JButton("->");  
  
JButton previousButton = new JButton("<-");  
  
JButton lastButton = new JButton("Last");  
  
btnPanel.add(firstButton);  
  
btnPanel.add(nextButton);  
  
btnPanel.add(previousButton);  
  
btnPanel.add(lastButton);  
 
firstButton.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent ae){  
  
cObjl.first(cPanel);  
  
currCard = 1;  
}  
});  
  
lastButton.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent ae){  
  
cObjl.last(cPanel);  
  
currCard = 4;  
}  
});  
  
nextButton.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent ae){  
 
if (currCard < 4){  
 currCard = currCard + 1;  
  
cObjl.show(cPanel, "" + (currCard));  
}  
}  
});  

previousButton.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent ae){  

if (currCard > 1){  
 currCard = currCard - 1;  
 cObjl.show(cPanel, "" + (currCard));  
}  
}  
});  
  
getContentPane().add(cPanel, BorderLayout.NORTH);  
  
getContentPane().add(btnPanel, BorderLayout.SOUTH);  
}  
 
public static void main(String argvs[]){    
CardLayoutExample3 cll = new CardLayoutExample3();    
cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
cll.setVisible(true);  
}  
}  
