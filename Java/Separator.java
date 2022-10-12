import javax.swing.*;  

class Separator{    
          JMenu menu, submenu;    
          JMenuItem i1, i2, i3, i4, i5;    
          SeparatorExample()  {    
          JFrame f= new JFrame("Separator Example");    
          JMenuBar mb=new JMenuBar();    
          menu=new JMenu("Menu");    
          i1=new JMenuItem("Item 1");    
          i2=new JMenuItem("Item 2");       
          menu.add(i1);  
          menu.addSeparator();  
          menu.add(i2);  
          mb.add(menu);    
          f.setJMenuBar(mb);    
          f.setSize(400,400);    
          f.setLayout(null);    
          f.setVisible(true);    
}    
  
public static void main(String args[]){    
new SeparatorExample();    
}
}    
