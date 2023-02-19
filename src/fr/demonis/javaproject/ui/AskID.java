package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AskID extends Frame implements ActionListener {

    TextField tf;
    AskID(boolean patient){
        setSize(300,250);

        Label label = new Label("Enter the ID provided", Label.CENTER);
        label.setBounds(0, 75, 300, 50);
        add(label);

        tf = new TextField();
        tf.setBounds(100, 125, 100, 20);
        add(tf);

        Button confirm = new Button("Confirm");
        confirm.setBounds(110,175,80,15);
        confirm.addActionListener(this);
        confirm.addActionListener (e -> {
            if (patient)
                new PatientMenu(Integer.valueOf(tf.getText()));
             else
                new DoctorMenu(Integer.valueOf(tf.getText()));

            dispose();
        });
        add(confirm);

        setLayout(null);
        setVisible(true);


        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
