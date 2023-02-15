package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.Main;
import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import javax.swing.*;
import java.awt.Toolkit;

public class DoctorMenu extends Frame implements ActionListener{

    TextField tf;
    DoctorMenu(){

//create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Retour");
        b.setBounds(100,120,80,30);
        Button q=new Button("Quitter");
        q.setBounds(1000,150,80,30);
        Button t=new Button("Treatements");
        t.setBounds(100,250,80,30);
        Button a=new Button("Appointements");
        a.setBounds(100,350,80,30);
        Button d=new Button("Doctors");
        d.setBounds(100,450,80,30);

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
        tf.setText("Welcome Doctor");
    }
}
