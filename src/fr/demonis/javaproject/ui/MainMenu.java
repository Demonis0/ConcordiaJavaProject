package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import javax.swing.JFrame;

public class MainMenu extends Frame{

    public MainMenu(){
        //add the main menu here

        //buttons setup
        Button b1 = new Button("Doctor");
        Button b2 = new Button("Secretary");
        Button b3 = new Button("Patient");
        Button exit = new Button("Exit");
        
        int button_width = 100;
        int button_height = 50;

        b1.setBounds((Constants.xSize/2)-120-(button_width/2),(Constants.ySize/2) - button_height/2, button_width, button_height);
        b2.setBounds((Constants.xSize/2)-(button_width/2),(Constants.ySize/2) -button_height/2, button_width, button_height);
        b3.setBounds((Constants.xSize/2)+120-(button_width/2),(Constants.ySize/2) -button_height/2, button_width, button_height);
        exit.setBounds(Constants.xSize - 110,20,80,30);

        //label setup
        Label l1 = new Label("Welcome to the hospital management system", Label.CENTER);

        l1.setBounds(0, Constants.ySize/2 - 75, Constants.xSize, 50);
        l1.setFont(Constants.PAGE_TITLE);
        //make the label centered

        //frame setup
        JFrame frame = new JFrame ();
        frame.setBounds ( 0, 0, Constants.xSize, Constants.ySize);
        frame.setVisible ( true );
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(exit);
        frame.add(l1);
        frame.setLayout(null);
        frame.setVisible(true);

        //button events
        //mouse click
        b1.addActionListener(e -> {
            new DoctorMenu();
            frame.dispose();
        });
        b2.addActionListener(e -> {
            new SecretaryMenu();
            frame.dispose();
        });
        b3.addActionListener(e -> {
            new PatientMenu();
            frame.dispose();
        });
        exit.addActionListener(e -> {
            frame.dispose();
            System.exit(0);
        });
        //keyboard press
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new DoctorMenu();
                    frame.dispose();
                }
            }
        });
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new SecretaryMenu();
                    frame.dispose();
                }
            }
        });
        b3.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new PatientMenu();
                    frame.dispose();
                }
            }
        });
        exit.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    frame.dispose();
                    System.exit(0);
                }
            }
        });
        
        

        //event : close the window and exit the program
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    }
}
