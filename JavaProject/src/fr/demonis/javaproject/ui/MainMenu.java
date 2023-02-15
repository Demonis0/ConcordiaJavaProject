package fr.demonis.javaproject.ui;

import java.awt.*;

import javax.swing.JFrame;

public class MainMenu extends Frame{

    public MainMenu(){
        //add the main menu here
        Button b1 = new Button("Doctor");
        Button b2 = new Button("Secretary");
        Button b3 = new Button("Patient");
        
        Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();

        int w = (int)(ss.width/2);
        int h = (int)(ss.height/2);
        int button_width = 100;
        int button_height = 50;

        b1.setBounds(w-120-(button_width/2), h-button_height/2, button_width, button_height);
        b2.setBounds(w-(button_width/2), h-button_height/2, button_width, button_height);
        b3.setBounds(w+120-(button_width/2), h-button_height/2, button_width, button_height);

        JFrame frame = new JFrame ();
        frame.setBounds ( w-150, h-150, 300, 300);
        frame.setVisible ( true );

        //button events : when mouse click button, it will open the corresponding menu
        b1.addActionListener(e -> {
            new DoctorMenu();
            dispose();
        });
        b2.addActionListener(e -> {
            new SecretaryMenu();
            dispose();
        });
        b3.addActionListener(e -> {
            new PatientMenu();
            dispose();
        });

        //button events, when keyboard press button, it will open the corresponding menu
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new DoctorMenu();
                    dispose();
                }
            }
        });
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new SecretaryMenu();
                    dispose();
                }
            }
        });
        b3.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    new PatientMenu();
                    dispose();
                }
            }
        });
        
        
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setLayout(null);
        frame.setVisible(true);

        //close the window
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });


    }
}
