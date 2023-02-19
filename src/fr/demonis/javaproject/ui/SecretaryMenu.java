package fr.demonis.javaproject.ui;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.Main;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;

import java.awt.*;
import java.awt.event.*;
public class SecretaryMenu extends Frame implements ActionListener{


    SecretaryMenu(){

        setSize(Constants.xSize, Constants.ySize);

        //create components
        Button back = new Button("Back");
        back.setBounds((int) Math.ceil(Constants.xSize*0.05),1*Constants.ySize/10,80,30);
        back.addActionListener (e -> {
            new MainMenu();
            dispose();
        });
        add(back);


        Button schedule = new Button("Schedules");
        schedule.setBounds((int) Math.ceil(Constants.xSize*0.05),2*Constants.ySize/10,80,30);
        schedule.addActionListener(this);
        add(schedule);


        Button addPatient = new Button("Add Patient");
        addPatient.setBounds((int) Math.ceil(Constants.xSize*0.05),3*Constants.ySize/10,80,30);
        addPatient.addActionListener (e -> {
            new AddPatient();
        });
        add(addPatient);


        Button addDoctor = new Button("Add Doctor");
        addDoctor.setBounds((int) Math.ceil(Constants.xSize*0.05),4*Constants.ySize/10,80,30);
        addDoctor.addActionListener (e -> {
            new AddDoctor();
        });
        add(addDoctor);


        Button database = new Button("Database");
        database.setBounds((int) Math.ceil(Constants.xSize*0.05),5*Constants.ySize/10,80,30);
        database.addActionListener (e -> {
            new Viewer();
            Patient p0 = Datas.getPatients().get(0);
            Viewer.fn.setText(p0.getFirstName());
            Viewer.ln.setText(p0.getLastName());
            Viewer.dob.setText(p0.getDateOfBirth());
            Viewer.ic.setText(p0.getInsuranceCarrier());
            Viewer.em.setText(p0.getEmployer());
            dispose();
        });
        add(database);


        Button quit = new Button("Quit");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),6*Constants.ySize/10,80,30);
        quit.addActionListener (e -> {
            dispose();
        });
        add(quit);



        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

    }
}
