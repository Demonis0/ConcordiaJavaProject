package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import javax.swing.JFrame;

public class PatientMenu extends Frame{
    TextField tf;
    PatientMenu(){
        //create components
        tf=new TextField();
        Button b=new Button("Return");
        Button q=new Button("Exit");
        Label l = new Label("Patient menu", Label.CENTER);

        //set bounds 
        l.setBounds((Constants.xSize/2) - 100, (Constants.ySize/2) - 175, 200, 50);
        tf.setBounds((Constants.xSize/2) - 135,(Constants.ySize/2) - 25,180,20);
        b.setBounds((Constants.xSize/2) + 65,(Constants.ySize/2) - 30,80,30);
        q.setBounds(Constants.xSize - 110,20,80,30);

        //other aspects
        l.setFont(Constants.PAGE_TITLE);
        b.setFont(Constants.BUTTON_FONT);
        q.setFont(Constants.BUTTON_FONT);

        //frame setup
        JFrame frame = new JFrame ();
        frame.setBounds ( 0, 0, Constants.xSize, Constants.ySize);
        frame.setVisible ( true );
        frame.add(l);
        frame.add(tf);
        frame.add(b);
        frame.add(q);
        frame.setLayout(null);
        frame.setVisible(true);

        //button actions
        //mouse click
        b.addActionListener(ae -> {
            new MainMenu();
            frame.dispose();
        });
        q.addActionListener(ae -> {
            frame.dispose();
            System.exit(0);
        });

        //enter key
        b.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new MainMenu();
                    frame.dispose();
                }
            }
        });
        q.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    frame.dispose();
                    System.exit(0);
                }
            }
        });
        //close the frame
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    }
}

