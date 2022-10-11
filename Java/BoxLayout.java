import javax.swing.*;
import java.awt.*;

public class BoxLayout extends Frame{
Button buttons[];

public BoxLayout(){
buttons = new Button[5];

for(int i=0;i<5;i++){
buttons[i]= new Button("Button" + (i+1));
// adding the buttoons so that it can be displayed
add(buttons[i]);
}
// the button will be placed horizontally 
setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
setSize(400,400);
setVisible(true);
}
// Main Method 
public static void main(String [] args){
BoxLayout b = new BoxLayout();
}
}
