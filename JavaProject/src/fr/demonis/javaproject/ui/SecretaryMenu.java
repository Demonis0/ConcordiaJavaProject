package fr.demonis.javaproject.ui;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import javax.swing.*;
import java.awt.Toolkit;

public class SecretaryMenu extends Frame implements ActionListener{
    TextField tf;
    JFrame frame;
    SecretaryMenu(){

//create components
        frame = new JFrame("Test");
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());


        frame.show();
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Schedule");
        b.setBounds(100,120,80,30);
        Button c=new Button("Retour");
        c.setBounds(150,150,80,30);

//register listener
        b.addActionListener(this);//passing current instance

        c.addActionListener (e -> {
            dispose();
        });

//add components and set size, layout and visibility
        add(b);add(tf);add(c);
        setSize(xSize,ySize);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Secretary");
    }
}

