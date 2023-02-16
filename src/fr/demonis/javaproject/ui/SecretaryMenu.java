package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;


public class SecretaryMenu extends Frame implements ActionListener{
    TextField tf;

    SecretaryMenu(){

//create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Schedule");
        b.setBounds(100,120,80,30);
        Button c=new Button("Retour");
        c.setBounds(100,250,80,30);
        Button q=new Button("Quitter");
        q.setBounds(1000,150,80,30);

//register listener
        b.addActionListener(this);//passing current instance

        c.addActionListener (e -> {
            new MainMenu();
            dispose();
        });
        q.addActionListener (e -> {
            dispose();
        });

//add components and set size, layout and visibility
        add(b);add(tf);add(c);add(q);
        setSize(Constants.xSize,Constants.ySize);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Secretary");
    }
}

