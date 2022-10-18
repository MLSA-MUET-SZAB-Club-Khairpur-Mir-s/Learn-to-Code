import javax.swing.*;
import java.awt.*;

public class BoxLayout extends Frame{
Button buttons[];

public BoxLayout(){
buttons = new Button[5];

for(int i=0;i<5;i++){
buttons[i]= new Button("Button" + (i+1));
// buttons are being add so they can displayed
add(buttons[i]);
}
// we place buttons horizantly
setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
setSize(400,400);
setVisible(true);
}
// main
public static void main(String [] args){
BoxLayout b = new BoxLayout();
}
}
