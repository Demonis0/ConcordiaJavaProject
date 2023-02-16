package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import javax.swing.JFrame;

public class DoctorMenu extends Frame{

    DoctorMenu(){
        //create components
        Label l=new Label("Doctor Menu", Label.CENTER);
        TextField tf=new TextField();
        Button r=new Button("Return");
        Button e=new Button("Exit");
        Button t=new Button("Treatements");
        Button a=new Button("Appointements");
        Button d=new Button("Doctors");

        //set bounds of components
        l.setBounds((Constants.xSize/2) - 100, (Constants.ySize/2) - 175, 200, 50);
        tf.setBounds((Constants.xSize/2) - 135,(Constants.ySize/2) - 25,180,20);
        r.setBounds((Constants.xSize/2) + 65,(Constants.ySize/2) - 30,80,30);
        e.setBounds(Constants.xSize - 110,20,80,30);
        t.setBounds((Constants.xSize/2) - 170,(Constants.ySize/2) - 100,100,50);
        a.setBounds((Constants.xSize/2) - 50,(Constants.ySize/2) - 100,100,50);
        d.setBounds((Constants.xSize/2) + 70,(Constants.ySize/2) - 100,100,50);

        //other aspects of components
        l.setFont(Constants.PAGE_TITLE);
        r.setFont(Constants.BUTTON_FONT);
        e.setFont(Constants.BUTTON_FONT);
        t.setFont(Constants.BUTTON_FONT);
        a.setFont(Constants.BUTTON_FONT);
        d.setFont(Constants.BUTTON_FONT);

        //frame setup
        JFrame frame = new JFrame ();
        frame.setBounds ( 0, 0, Constants.xSize, Constants.ySize);
        frame.setVisible ( true );
        frame.add(l);
        frame.add(tf);
        frame.add(r);
        frame.add(e);
        frame.add(t);
        frame.add(a);
        frame.add(d);
        frame.setLayout(null);
        frame.setVisible(true);

        //actions for the differents buttons
        //mouse clicks
        r.addActionListener(ae -> {
            new MainMenu();
            frame.dispose();
        });
        e.addActionListener(ae -> {
            frame.dispose();
            System.exit(0);
        });
        t.addActionListener(ae -> {

        });
        a.addActionListener(ae -> {

        });
        d.addActionListener(ae -> {

        });

        //enter key
        r.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new MainMenu();
                    frame.dispose();
                }
            }
        });
        e.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    frame.dispose();
                    System.exit(0);
                }
            }
        });
        t.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

                }
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    
                }
            }
        });
        d.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

                }
            }
        });
        //close the page
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    }
}
