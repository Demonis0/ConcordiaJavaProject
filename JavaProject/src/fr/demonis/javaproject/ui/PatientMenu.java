package fr.demonis.javaproject.ui;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

public class PatientMenu extends Frame implements ActionListener{
    TextField tf;
    PatientMenu(){

//create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);

//register listener
        b.addActionListener(this);//passing current instance

//add components and set size, layout and visibility
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
}

