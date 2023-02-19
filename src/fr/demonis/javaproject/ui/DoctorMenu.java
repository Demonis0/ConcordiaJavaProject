package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class DoctorMenu extends Frame implements ActionListener{
    DoctorMenu(int id){

        setBounds ( 0, 0, Constants.xSize, Constants.ySize);

        //create components
        Button back = new Button("Back");
        back.setBounds((int) Math.ceil(Constants.xSize*0.05),120,80,30);
        add(back);
        back.addActionListener (e -> {
            new MainMenu();
            dispose();
        });


        Button treatments = new Button("Treatements");
        treatments.setBounds((int) Math.ceil(Constants.xSize*0.05),2*Constants.ySize/10,80,30);
        add(treatments);


        Button appointments = new Button("Appointements");
        appointments.setBounds((int) Math.ceil(Constants.xSize*0.05),3*Constants.ySize/10,80,30);
        add(appointments);


        Button patients = new Button("Patients");
        patients.setBounds((int) Math.ceil(Constants.xSize*0.05),4*Constants.ySize/10,80,30);
        add(patients);


        Button quit = new Button("Quitter");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),5*Constants.ySize/10,80,30);
        add(quit);
        quit.addActionListener (e -> {
            dispose();
        });


        //frame setup
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
