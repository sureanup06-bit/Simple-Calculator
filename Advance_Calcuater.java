import java.awt.*;
import java.awt.event.*;

class Advance_Calcuater implements ActionListener
{
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5,sq,sqrt,cube,c_root,mod,power,percent;
    Label l1,l2,l3;
    Frame f;
    Advance_Calcuater()
    {

        Color btn = new Color(248, 250, 252); 

        f=new Frame();
        f.setBackground(new Color(173, 216, 230));
    
        b1=new Button("Add");
        b1.setBounds(100,200,50,20);
        b1.addActionListener(this);
        b1.setBackground(btn);

        b2=new Button("Subtract");
        b2.setBounds(200,200,50,20);
        b2.addActionListener(this);
        b2.setBackground(btn);
        
        b3 = new Button("Multiply");
        b3.setBounds(100,233,50,20);
        b3.addActionListener(this);
        b3.setBackground(btn);

        b4=new Button("Divide");
        b4.setBounds(200,233,50,20);
        b4.addActionListener(this);
        b4.setBackground(btn);

        sq = new Button("Square");
        sq.setBounds(100,265,50,20);
        sq.addActionListener(this);

        sqrt=new Button("S.Root");
        sqrt.setBounds(200,265,50,20);
        sqrt.addActionListener(this);

        cube = new Button("Cube");
        cube.setBounds(100,300,50,20);
        cube.addActionListener(this);

        c_root = new Button("C.Root");
        c_root.setBounds(200,300,50,20);
        c_root.addActionListener(this);

        mod = new Button("Mod");
        mod.setBounds(100,335,50,20);
        mod.addActionListener(this);

        power = new Button("Power");
        power.setBounds(200,335,50,20);
        power.addActionListener(this);

        percent = new Button("Percent");
        percent.setBounds(100,370,50,20);
        percent.addActionListener(this);

        b5 = new Button("Clear");
        b5.setBounds(200,370,50,20);
        b5.addActionListener(this);
        b5.setBackground(btn);

        l1 = new Label("Num 1 :");
        l1.setBounds(20,50,50,20);

        l2 = new Label("Num 2 :");    
        l2.setBounds(20,100,50,20);

        l3 = new Label("Result :");
        l3.setBounds(20,150,50,20);

        t1=new TextField();
        t1.setBounds (75,50,200,20);
        
        t2=new TextField();
        t2.setBounds (75,100,200,20);
        
        t3=new TextField();
        t3.setEditable(false);
        t3.setBounds (75,150,200,20);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(sq);
        f.add(sqrt);
        f.add(cube);
        f.add(c_root);
        f.add(mod); 
        f.add(power);
        f.add(percent);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        
        f.add(t1);
        f.add(t2);
        f.add(t3);

        f.setSize(300,410);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() 
        { 
            public void windowClosing(WindowEvent we) 
            { 
                f.dispose(); 
            } 
        });
    
    }  
    public void actionPerformed(ActionEvent e)
    {
        float a = 0;
        float b = 0;

        if (!t1.getText().equals(""))
        {
            a = Float.parseFloat(t1.getText());
        }

        if (!t2.getText().equals(""))
        {
            b = Float.parseFloat(t2.getText());
        }

        if(e.getSource()==b1)
        {
            float c = a + b;
            t3.setText(String.valueOf(c));
        }
        else if(e.getSource()==b2)
        {
            float c = a - b;
            t3.setText(String.valueOf(c));
        }
        else if(e.getSource()==b3)
        {
            float c = a * b;
            t3.setText(String.valueOf(c));
        }
        else if(e.getSource()==b4)
        {
            if(b == 0)
            {
                t3.setText("Error: Division By Zero Detected");
            }
            else
            {
                float c = a/b;
                t3.setText(String.valueOf(c));
            }
        }
        else if (e.getSource()==sq)
        {
            if (t1.getText().equals(""))
            {
                float c = b*b;
                t3.setText(String.valueOf(c));
            }
            else if (t2.getText().equals(""))
            {
                float c = a*a;
                t3.setText(String.valueOf(c));
            }
            else 
            {
                t3.setText("Enter Value In Only one Field");
            }
        }
        else if (e.getSource()==sqrt)
        {
            if (t1.getText().equals(""))
            {
                if (b<0)
                {
                    t3.setText("Cannot Root A Negative Number");
                }
                else if (b>=0)
                {
                    float i;
                    for (i=0;i<=b;i++)
                    {
                        if (i*i==b)
                        {
                            t3.setText(String.valueOf(i));
                            break;
                        }
                        else
                        {
                            t3.setText("No Intigral Squair Root");
                        }
                    }
                }
            }
            else if (t2.getText().equals(""))
            {
                if (a<0)
                {
                    t3.setText("Cannot Root A Negative Number");
                }
                else if (a>=0)
                {
                    float i;
                    for (i=0;i<=a;i++)
                    {
                        if(i*i==a)
                        {
                            t3.setText(String.valueOf(i));
                        break;
                        }
                        else
                        {
                            t3.setText("No Intigral Squair Root");
                        }
                    }
                }
            }
            else
            {
                t3.setText("Enter Value In Only one Field");
            }
        }
        else if (e.getSource()==cube)
        {
            if (t1.getText().equals(""))
            {
                float c = b*b*b;
                t3.setText(String.valueOf(c));
            }
            else if (t2.getText().equals(""))
            {
                float c = a*a*a;
                t3.setText(String.valueOf(c));
            }
            else 
            {
                t3.setText("Enter Value In Only one Field");
            }
        }
        else if (e.getSource()==c_root)
        {
            if (t1.getText().equals(""))
            {
                if (b<0)
                {
                    t3.setText("Cannot Root A Negative Number");
                }
                else if (b>=0)
                {
                    float i;
                    for (i=0;i<=b;i++)
                    {
                        if (i*i*i==b)
                        {
                            t3.setText(String.valueOf(i));
                            break;
                        }
                        else
                        {
                            t3.setText("No Intigral Cube Root");
                        }
                    }
                }
            }
            else if (t2.getText().equals(""))
            {
                if (a<0)
                {
                    t3.setText("Cannot Root A Negative Number");
                }
                else if (a>=0)
                {
                    float i;
                    for (i=0;i<=a;i++)
                    {
                        if(i*i*i==a)
                        {
                            t3.setText(String.valueOf(i));
                        break;
                        }
                        else
                        {
                            t3.setText("No Intigral Cube Root");
                        }
                    }
                }
            }
            else
            {
                t3.setText("Enter Value In Only one Field");
            }
        }
        else if (e.getSource()==mod)
        {
            if (b == 0)
            {
                t3.setText("Error: Division By Zero Detected");
            }
            else
            {
                float c = a % b;
                t3.setText(String.valueOf(c));
            }
        }
        else if(e.getSource()==power)
        {
            float result = 1;
            for (int i=1;i<=b;i++)
            {
                result = result * a;
            }
            t3.setText(String.valueOf(result));
        }
        else if(e.getSource()==percent)
        {
            if(b == 0)
            {
                t3.setText("Error: Division By Zero Detected");
            }
            else
            {
            float c = (a/b)*100;
            t3.setText(String.valueOf(c)+"%");
            }
        }
        else if(e.getSource()==b5)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");

        }
    }
    public static void main(String args[])
    {
        new Advance_Calcuater();    
    }
} 