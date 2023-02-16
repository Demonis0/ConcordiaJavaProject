package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import java.awt.event.*;
public class AddDoctor extends Frame implements ActionListener{
    TextField tf;

    AddDoctor(){

//create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Schedule");
        b.setBounds(100,120,80,30);
        Button c=new Button("Retour");
        c.setBounds(100,250,80,30);
        Button q=new Button("Quitter");
        q.setBounds(1000,150,80,30);
        Button a1=new Button("Add Patient");
        a1.setBounds(100,520,80,30);
        Button a2=new Button("Add Doctor");
        a2.setBounds(100,620,80,30);
        Button j=new Button("Join Person");
        j.setBounds(100,720,80,30);

//register listener
        b.addActionListener(this);//passing current instance

        c.addActionListener (e -> {
            new MainMenu();
            dispose();
        });
        q.addActionListener (e -> {
            dispose();
        });
        a1.addActionListener (e -> {
            dispose();
        });
        a2.addActionListener (e -> {
            dispose();
        });
        j.addActionListener (e -> {
            dispose();
        });

//add components and set size, layout and visibility
        add(b);add(tf);add(c);add(q);add(a1);add(a2);add(j);
        setSize(Constants.xSize, Constants.ySize);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Secretary");
    }
}
