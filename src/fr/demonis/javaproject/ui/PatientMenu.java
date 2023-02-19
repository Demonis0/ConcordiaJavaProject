package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;

import java.awt.*;
import java.awt.event.*;

public class PatientMenu extends Frame implements ActionListener{

    TextField tf;
    PatientMenu(int id){

        setSize(Constants.xSize,Constants.ySize);

        //create buttons
        Button retour = new Button("Back");
        retour.setBounds((int) Math.ceil(Constants.xSize*0.05),1*Constants.ySize/10,80,30);
        retour.addActionListener(this);
        retour.addActionListener (e -> {
            new MainMenu();
            dispose();
        });
        add(retour);


        Button treatments = new Button("Treatements");
        treatments.setBounds((int) Math.ceil(Constants.xSize*0.05),2*Constants.ySize/10,80,30);
        add(treatments);


        Button appointments = new Button("Appointements");
        appointments.setBounds((int) Math.ceil(Constants.xSize*0.05),3*Constants.ySize/10,80,30);
        add(appointments);


        Button doctors = new Button("Doctors");
        doctors.setBounds((int) Math.ceil(Constants.xSize*0.05),4*Constants.ySize/10,80,30);
        add(doctors);


        Button quitter = new Button("Quit");
        quitter.setBounds((int) Math.ceil(Constants.xSize*0.80),5*Constants.ySize/10,80,30);
        quitter.addActionListener (e -> {
            dispose();
        });
        add(quitter);



        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
}
