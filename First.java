import java.awt.*;
import java.awt.event.*;

class TextFields implements ActionListener
{
    TextField t1,t2,t3;
    Button b1,b2;
    Frame f;
    TextFields()
    {
    f=new Frame();
    b1=new Button("Add");
    b1.setBounds(50,200,50,20);
    b2=new Button("Subtract");
    b2.setBounds(100,200,50,20);
    t1=new TextField();
    t1.setBounds (50,50,100,20);
    t2=new TextField();
    t2.setBounds (50,100,100,20);
    t3=new TextField();
    t3.setBounds (50,150,100,20);
    f.add(b1);
    f.add(b2);
    f.add(t1);
    f.add(t2);
    f.add(t3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    }  
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=0;
        if(e.getSource()==b1)
        {
            c=a+b;
        }
        else if(e.getSource()==b2)
        {
            c=a-b;
        }
        t3.setText(String.valueOf(c));  
    }
    public static void main(String args[])
    {
        TextFields tf = new TextFields();       
    }
} 