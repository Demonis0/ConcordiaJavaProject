package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import java.awt.event.*;

public class PatientMenu extends Frame implements ActionListener{
    TextField tf;
    PatientMenu(){

//create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Retour");
        b.setBounds(100,120,80,30);
        Button q=new Button("Quitter");
        q.setBounds(1000,150,80,30);

//register listener
        b.addActionListener(this);//passing current instance

        b.addActionListener (e -> {
            new MainMenu();
            dispose();
        });
        q.addActionListener (e -> {
            dispose();
        });

//add components and set size, layout and visibility
        add(b);add(tf);add(q);
        setSize(Constants.xSize,Constants.ySize);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
}

