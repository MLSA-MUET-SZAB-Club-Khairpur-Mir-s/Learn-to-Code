
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.*;
public class ActionListenerOnOffButton {
    ActionListener(){
        //creating objects.
        Frame f = new Frame();
        Label lb = new Label();
        Button btn = new Button("Click");
        f.setSize(300,300);
        btn.setBounds(100,70,40,15);
        lb.setBounds(40,40,40,40);

        //adding action listener.
        btn.addActionListener(new java.awt.event.ActionListener() {
        int i = 2;
                                  @Override
                                  public void actionPerformed(ActionEvent e) {
                                      i++;
                                      if (i % 2 == 0) {
                                          lb.setText("true");
                                      } else {
                                          lb.setText("false");
                                      }
                                  }
                              });

        f.add(btn);
        f.add(lb);
        f.setLayout(null);
        f.setVisible(true);
    }


    public static void main(String[]args){
        ActionListener obj = new ActionListener();
    }
}
