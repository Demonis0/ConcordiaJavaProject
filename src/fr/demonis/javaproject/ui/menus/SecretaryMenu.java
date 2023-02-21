package fr.demonis.javaproject.ui.menus;
import fr.demonis.javaproject.ui.see.SeeAppointment;
import fr.demonis.javaproject.ui.see.SeeDoctor;
import fr.demonis.javaproject.ui.see.SeePatient;
import fr.demonis.javaproject.ui.add.AddAppointment;
import fr.demonis.javaproject.ui.add.AddDoctor;
import fr.demonis.javaproject.ui.add.AddPatient;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.FileConfiguration;

import java.awt.*;
import java.awt.event.*;
public class SecretaryMenu extends Frame implements ActionListener{


    SecretaryMenu(){

        setSize(Constants.xSize, Constants.ySize);

        //create components
        Button back = new Button("Back");
        back.setBounds((int) Math.ceil(Constants.xSize*0.05),1*Constants.ySize/10,100,30);
        back.addActionListener (e -> {
            new MainMenu();
            dispose();
        });
        add(back);


        Button schedule = new Button("Add Appointment");
        schedule.setBounds((int) Math.ceil(Constants.xSize*0.05),2*Constants.ySize/10,100,30);
        schedule.addActionListener (e -> {
            new AddAppointment();
        });
        add(schedule);


        Button addPatient = new Button("Add Patient");
        addPatient.setBounds((int) Math.ceil(Constants.xSize*0.05),3*Constants.ySize/10,100,30);
        addPatient.addActionListener (e -> {
            new AddPatient();
        });
        add(addPatient);


        Button addDoctor = new Button("Add Doctor");
        addDoctor.setBounds((int) Math.ceil(Constants.xSize*0.05),4*Constants.ySize/10,100,30);
        addDoctor.addActionListener (e -> {
            new AddDoctor();
        });
        add(addDoctor);


        Button database = new Button("Appointments");
        database.setBounds((int) Math.ceil(Constants.xSize*0.05),5*Constants.ySize/10,100,30);
        database.addActionListener (e -> {
            new SeeAppointment(-1);
        });
        add(database);

        Button patients = new Button("Patients");
        patients.setBounds((int) Math.ceil(Constants.xSize*0.05),6*Constants.ySize/10,100,30);
        patients.addActionListener (e -> {
            new SeePatient(-1);
        });
        add(patients);

        Button doctor = new Button("Doctor");
        doctor.setBounds((int) Math.ceil(Constants.xSize*0.05),7*Constants.ySize/10,100,30);
        doctor.addActionListener (e -> {
            new SeeDoctor(-1);
        });
        add(doctor);


        Button quit = new Button("Quit");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),8*Constants.ySize/10,100,30);
        quit.addActionListener (e -> {
            FileConfiguration.save();
            dispose();
        });
        add(quit);



        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

    }
}
