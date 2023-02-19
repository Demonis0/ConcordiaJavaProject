package fr.demonis.javaproject.ui;
import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import javax.swing.JFrame;

public class MainMenu extends Frame{

    /** Menu to select user type **/
    public MainMenu(){

        //add the main menu here: this will be the welcoming page redirecting the user.
        JFrame frame = new JFrame ();
        frame.setBounds ( 0, 0, Constants.xSize, Constants.ySize);


        int button_width = 100;
        int button_height = 50;


        //Label ceation
        Label l1 = new Label("Welcome to the hospital management system", Label.CENTER);
        l1.setBounds(0, Constants.ySize/2 - 75, Constants.xSize, 50);
        frame.add(l1);


        //buttons setup (Object and events handling)
        Button b1 = new Button("Doctor");
        b1.setBounds((Constants.xSize/2)-120-(button_width/2),(Constants.ySize/2) - button_height/2, button_width, button_height);
        frame.add(b1);
        b1.addActionListener(e -> {
            //Opens a new page
            new AskID(false);
            //closes the current page
            frame.dispose();
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new AskID(false);
                    frame.dispose();
                }
            }
        });



        Button b2 = new Button("Secretary");
        b2.setBounds((Constants.xSize/2)-(button_width/2),(Constants.ySize/2) -button_height/2, button_width, button_height);
        frame.add(b2);
        b2.addActionListener(e -> {
            new SecretaryMenu();
            frame.dispose();
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


        Button b3 = new Button("Patient");
        b3.setBounds((Constants.xSize/2)+120-(button_width/2),(Constants.ySize/2) -button_height/2, button_width, button_height);
        frame.add(b3);
        b3.addActionListener(e -> {
            new AskID(true);
            frame.dispose();
        });
        b3.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new AskID(true);
                    frame.dispose();
                }
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);


        //event : close the window and exit the program
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
