package fr.demonis.javaproject.Ui;

import fr.demonis.javaproject.Utils.Constants;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class DoctorMenu extends Frame implements ActionListener{
    DoctorMenu(){
        //create components
        Label l=new Label("Doctor Menu", Label.CENTER);
        TextField tf=new TextField();
        Button b=new Button("Retour");
        Button q=new Button("Quitter");
        Button t=new Button("Treatements");
        Button a=new Button("Appointements");
        Button d=new Button("Doctors");

        //set bounds of components
        l.setBounds(0, Constants.ySize/2 - 75, Constants.xSize, 50);
        tf.setBounds(60,50,170,20);
        b.setBounds(100,120,80,30);
        q.setBounds(1000,150,80,30);
        t.setBounds(100,200,80,30);
        a.setBounds(100,250,80,30);
        d.setBounds(100,300,80,30);

        //frame setup
        JFrame frame = new JFrame ();
        frame.setBounds ( 0, 0, Constants.xSize, Constants.ySize);
        frame.setVisible ( true );
        frame.add(l);
        frame.add(tf);
        frame.add(b);
        frame.add(q);
        frame.add(t);
        frame.add(a);
        frame.add(d);
        frame.setLayout(null);
        frame.setVisible(true);

        //register listener
        b.addActionListener(this);//passing current instance

        b.addActionListener (e -> {
            new MainMenu();
            dispose();
        });
        q.addActionListener (e -> {
            dispose();
        });

        //close the frame
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
