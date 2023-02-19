package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.Main;
import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;
import fr.demonis.javaproject.utils.Specialities;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDoctor extends Frame implements ActionListener {

    TextField fn, ln, dob, doe;

    /**
     * To add doctors
     **/
    public AddDoctor() {

//create components
        fn = new TextField();
        fn.setBounds(300, 100, 170, 20);
        Label l1 = new Label("           Firstname:");
        l1.setBounds(100, 85, 200, 50);

        ln = new TextField();
        ln.setBounds(300, 150, 170, 20);
        Label l2 = new Label("            Lastname:");
        l2.setBounds(100, 135, 200, 50);

        dob = new TextField();
        dob.setBounds(300, 200, 170, 20);
        Label l3 = new Label("       Date of Birth:");
        l3.setBounds(100, 185, 200, 50);

        doe = new TextField();
        doe.setBounds(300, 250, 170, 20);
        Label l4 = new Label("Date of employement:");
        l4.setBounds(100, 235, 200, 50);

        Button b = new Button("Send");
        b.setBounds(100, 350, 80, 30);

        Choice sp = new Choice();
        // setting the bounds of choice menu
        sp.setBounds(300, 300, 1000, 75);

        // adding items to the choice menu
        for (Specialities s : Specialities.values()) {
            sp.add(s.toString());
        }

//register listener
        b.addActionListener(e -> {
            String firstN = fn.getText();
            String lastN = ln.getText();
            String dateOfB = dob.getText();
            String dateOfE = doe.getText();
            Specialities s = Specialities.valueOf(sp.getSelectedItem());
            Doctor d = new Doctor(firstN, lastN, dateOfB, dateOfE, s, Datas.totalPersonId);
            Datas.totalPersonId++;

            dispose();
        });//passing current instance


        //add components and set size, layout and visibility
        add(b);
        add(fn);
        add(ln);
        add(dob);
        add(doe);
        add(sp);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        setSize((Constants.xSize), (Constants.ySize));
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
