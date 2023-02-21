package fr.demonis.javaproject.ui.menus;

import fr.demonis.javaproject.ui.see.SeeAppointment;
import fr.demonis.javaproject.ui.see.SeePatient;
import fr.demonis.javaproject.ui.see.SeeTreatments;
import fr.demonis.javaproject.ui.add.AddTreatment;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.FileConfiguration;

import java.awt.*;
import java.awt.event.*;

public class DoctorMenu extends Frame implements ActionListener{
    DoctorMenu(int id){

        setBounds ( 0, 0, Constants.xSize, Constants.ySize);

        //create components
        Button back = new Button("Back");
        back.setBounds((int) Math.ceil(Constants.xSize*0.05),120,100,30);
        add(back);
        back.addActionListener (e -> {
            new MainMenu();
            dispose();
        });


        Button addtreatments = new Button("Add Treatements");
        addtreatments.setBounds((int) Math.ceil(Constants.xSize*0.05),2*Constants.ySize/10,100,30);
        add(addtreatments);
        addtreatments.addActionListener (e -> {
            new AddTreatment(id);
        });


        Button treatments = new Button("Treatements");
        treatments.setBounds((int) Math.ceil(Constants.xSize*0.05),3*Constants.ySize/10,100,30);
        add(treatments);
        treatments.addActionListener (e -> {
            new SeeTreatments(id);
        });


        Button appointments = new Button("Appointements");
        appointments.setBounds((int) Math.ceil(Constants.xSize*0.05),4*Constants.ySize/10,100,30);
        appointments.addActionListener (e -> {
            new SeeAppointment(id);
        });
        add(appointments);


        Button patients = new Button("Patients");
        patients.setBounds((int) Math.ceil(Constants.xSize*0.05),5*Constants.ySize/10,100,30);
        add(patients);
        patients.addActionListener (e -> {
            new SeePatient(id);
        });


        Button quit = new Button("Quitter");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),6*Constants.ySize/10,100,30);
        add(quit);
        quit.addActionListener (e -> {
            FileConfiguration.save();
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
