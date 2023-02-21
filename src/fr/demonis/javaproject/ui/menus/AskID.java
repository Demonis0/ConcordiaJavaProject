package fr.demonis.javaproject.ui.menus;

import fr.demonis.javaproject.ui.menus.DoctorMenu;
import fr.demonis.javaproject.ui.menus.PatientMenu;
import fr.demonis.javaproject.ui.menus.SecretaryMenu;
import fr.demonis.javaproject.utils.Datas;
import fr.demonis.javaproject.utils.FileConfiguration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AskID extends Frame implements ActionListener {

    TextField tf;
    AskID(){
        setSize(300,250);

        Label label = new Label("Enter the ID provided", Label.CENTER);
        label.setBounds(0, 75, 300, 50);
        add(label);

        tf = new TextField();
        tf.setBounds(100, 125, 100, 20);
        add(tf);

        Label label2 = new Label("", Label.CENTER);
        label2.setBounds(0, 200, 300, 50);
        add(label2);

        Button confirm = new Button("Confirm");
        confirm.setBounds(110,175,80,15);
        confirm.addActionListener (e -> {
            int id = Integer.valueOf(tf.getText());
            if (id == -1) {
                new SecretaryMenu();
                dispose();
            } else if (Datas.getPatients().keySet().contains(id)) {
                new PatientMenu(Integer.valueOf(tf.getText()));
                dispose();
            } else if (Datas.getDoctors().keySet().contains(id)) {
                new DoctorMenu(Integer.valueOf(tf.getText()));
                dispose();
            } else {
                label2.setText("Wrong ID");
            }

        });
        add(confirm);

        setLayout(null);
        setVisible(true);


        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                FileConfiguration.save();
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
