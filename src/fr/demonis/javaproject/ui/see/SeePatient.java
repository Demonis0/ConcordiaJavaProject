package fr.demonis.javaproject.ui.see;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.ui.edit.EditPatient;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;
import fr.demonis.javaproject.utils.Specialities;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class SeePatient extends Frame {

    public SeePatient(int id) {
        setSize((Constants.xSize), (Constants.ySize));

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(list);

        scrollPane.setBounds((int) Math.ceil(Constants.xSize * 0.05), 2 * Constants.ySize / 20, 250, 150);
        add(scrollPane);

        Label l1 = new Label("");
        l1.setBounds((int) Math.ceil(Constants.xSize * 0.05), 6 * Constants.ySize / 20, 200, 50);
        add(l1);

        Label l2 = new Label("");
        l2.setBounds((int) Math.ceil(Constants.xSize * 0.05), 7 * Constants.ySize / 20, 200, 50);
        add(l2);

        Label l3 = new Label("");
        l3.setBounds((int) Math.ceil(Constants.xSize * 0.05), 8 * Constants.ySize / 20, 200, 50);
        add(l3);

        Label l4 = new Label("");
        l4.setBounds((int) Math.ceil(Constants.xSize * 0.05), 9 * Constants.ySize / 20, 200, 50);
        add(l4);

        Label l5 = new Label("");
        l5.setBounds((int) Math.ceil(Constants.xSize * 0.05), 10 * Constants.ySize / 20, 200, 50);
        add(l5);

        Label l6 = new Label("");
        l6.setBounds((int) Math.ceil(Constants.xSize * 0.05), 11 * Constants.ySize / 20, 200, 50);
        add(l6);

        Label l7 = new Label("");
        l7.setBounds((int) Math.ceil(Constants.xSize * 0.05), 12 * Constants.ySize / 20, 200, 50);
        add(l7);


        Button quit = new Button("Quit");
        quit.setBounds((int) Math.ceil(Constants.xSize * 0.80), 13 * Constants.ySize / 20, 80, 30);
        add(quit);
        quit.addActionListener(e -> {
            dispose();
        });


        TextField search = new TextField();
        search.setBounds((int) Math.ceil(Constants.xSize * 0.05), Constants.ySize / 20, 250, 20);
        search.addActionListener(e -> {
            listModel.clear();
            String ref = search.getText();
            if (id == -1) {
                for (Patient p : Datas.getPatients().values()) {
                        String current = p.getId() + "-" + p.getFirstName().substring(0, 1).toUpperCase() + p.getFirstName().substring(1).toLowerCase() + " " + p.getLastName().toUpperCase();
                        if (current.toLowerCase().contains(ref.toLowerCase())) {
                            listModel.addElement(current);
                        }
                }
            } else {
                for (Patient p : Datas.getPatients().values()) {
                    if (p.getDoctors().values().contains(id)) {
                        String current = p.getId() + "-" + p.getFirstName().substring(0, 1).toUpperCase() + p.getFirstName().substring(1).toLowerCase() + " " + p.getLastName().toUpperCase();
                        if (current.toLowerCase().contains(ref.toLowerCase())) {
                            listModel.addElement(current);
                        }
                    }
                }
            }
            list.setModel(listModel);
        });
        add(search);

        JButton button = new JButton("Select");
        button.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 275, Constants.ySize / 20 + 55, 80, 40);
        button.addActionListener(e -> {
            int tr = Integer.valueOf(list.getSelectedValue().split("-")[0]);
            Patient p = Datas.getPatients().get(tr);
            l1.setText("First Name: " + p.getFirstName().substring(0, 1).toUpperCase() + p.getFirstName().substring(1).toLowerCase());
            l2.setText("Last Name: " + p.getLastName().toUpperCase());
            l3.setText("Date of birth: " + p.getDateOfBirth());
            l4.setText("Phone: " + p.getPhone());
            l5.setText("Mail: " + p.getMail());
            l6.setText("Insurance Career: " + p.getInsuranceCarrier());
            l7.setText("Employer: " + p.getEmployer());
        });
        add(button);

        JButton button2 = new JButton("Delete");
        button2.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 275, Constants.ySize / 20 + 100, 80, 40);
        button2.addActionListener(e -> {
            int tr = Integer.valueOf(list.getSelectedValue().split("-")[0]);
            Patient p = Datas.getPatients().get(tr);

            if (id == -1) {
                for (Doctor d : Datas.getDoctors().values()) {
                    List<Integer> l = d.getPatients();
                    for (int i = 0; i < l.size(); i++) {
                        if (l.get(i) == tr) {
                            l.remove(i);
                            break;
                        }
                    }
                    d.setPatients(l);
                    Datas.addDoctor(d);
                }
                for (Appointment app : Datas.getAppointments().values()) {
                    if (app.getPatient() == tr) {
                        Datas.removeAppointment(app.getId());
                    }
                }
                for (Treatment t : Datas.getTreatments().values()) {
                    if (t.getPatient() == tr) {
                        Datas.removeAppointment(t.getId());
                    }
                }
                Datas.removePatient(tr);
            } else {
                Doctor d = Datas.getDoctors().get(id);
                List<Integer> l = d.getPatients();
                for (int i = 0; i < l.size(); i++) {
                    if (l.get(i) == tr) {
                        l.remove(i);
                        break;
                    }
                }
                d.setPatients(l);
                Datas.addDoctor(d);
                HashMap<Specialities, Integer> hm = p.getDoctors();
                hm.remove(d.getSpeciality());
                p.setDoctors(hm);
                Datas.addPatient(p);
            }
        });
        add(button2);


        if (id == -1) {
            JButton button3 = new JButton("Edit");
            button3.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 275, Constants.ySize / 20 + 150, 80, 40);
            button3.addActionListener(e -> {
                int tr = Integer.valueOf(list.getSelectedValue().split("-")[0]);
                new EditPatient(tr);
            });
            add(button3);
        }


        setLayout(null);
        setVisible(true);
    }

}
