package fr.demonis.javaproject.ui;
import fr.demonis.javaproject.utils.Constants;

import java.awt.*;

import javax.swing.JFrame;

public class MainMenu extends Frame{

    public MainMenu(){

        //add the main menu here: this will be the welcoming page redirecting the user.

        //buttons setup

        //add the main menu here

        Button b1 = new Button("Doctor");
        Button b2 = new Button("Secretary");
        Button b3 = new Button("Patient");
        
        Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();

        int w = (int)(ss.width/2);
        int h = (int)(ss.height/2);
        int button_width = 100;
        int button_height = 50;


        //allows us to center the buttons no matter the screen's size
        b1.setBounds((Constants.xSize/2)-120-(button_width/2),(Constants.ySize/2) - button_height/2, button_width, button_height);
        b2.setBounds((Constants.xSize/2)-(button_width/2),(Constants.ySize/2) -button_height/2, button_width, button_height);
        b3.setBounds((Constants.xSize/2)+120-(button_width/2),(Constants.ySize/2) -button_height/2, button_width, button_height);

        //label setup
        Label l1 = new Label("Welcome to the hospital management system", Label.CENTER);

        l1.setBounds(0, Constants.ySize/2 - 75, Constants.xSize, 50);
        //make the label centered

        //frame setup (selecting which items will appear)

        b1.setBounds(w-120-(button_width/2), h-button_height/2, button_width, button_height);
        b2.setBounds(w-(button_width/2), h-button_height/2, button_width, button_height);
        b3.setBounds(w+120-(button_width/2), h-button_height/2, button_width, button_height);

        JFrame frame = new JFrame ();
        frame.setBounds ( 0, 0, Constants.xSize, Constants.ySize);
        frame.setVisible ( true );

        //button events : when mouse click button, it will open the corresponding menu
        b1.addActionListener(e -> {
            //Opens a new page
            new DoctorMenu();
            //closes the current page
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

        //button events, when keyboard press button, it will open the corresponding menu
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
        
        
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setLayout(null);
        frame.setVisible(true);
        //event : close the window and exit the program
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frame.addWindowListener(new java.awt.event.WindowAdapter() {

        //close the window
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
