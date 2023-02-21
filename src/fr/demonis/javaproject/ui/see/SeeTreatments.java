package fr.demonis.javaproject.ui.see;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.ui.edit.EditAppointment;
import fr.demonis.javaproject.ui.edit.EditTreatments;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;
import fr.demonis.javaproject.utils.FileConfiguration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SeeTreatments extends Frame {

    public SeeTreatments(int id) {
        setSize((Constants.xSize), (Constants.ySize));

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(list);

        scrollPane.setBounds((int) Math.ceil(Constants.xSize * 0.05),2*Constants.ySize/20,250, 150);
        add(scrollPane);

        Label l1 = new Label("");
        l1.setBounds((int) Math.ceil(Constants.xSize * 0.05),6*Constants.ySize/20, 200, 50);
        add(l1);

        Label l2 = new Label("");
        l2.setBounds((int) Math.ceil(Constants.xSize * 0.05),7*Constants.ySize/20, 200, 50);
        add(l2);

        Label l3 = new Label("");
        l3.setBounds((int) Math.ceil(Constants.xSize * 0.05),8*Constants.ySize/20, 200, 50);
        add(l3);

        Label l4 = new Label("");
        l4.setBounds((int) Math.ceil(Constants.xSize * 0.05),9*Constants.ySize/20, 200, 50);
        add(l4);

        Label l5 = new Label("");
        l5.setBounds((int) Math.ceil(Constants.xSize * 0.05),10*Constants.ySize/20, 200, 50);
        add(l5);

        Label l6 = new Label("");
        l6.setBounds((int) Math.ceil(Constants.xSize * 0.05),11*Constants.ySize/20, 200, 50);
        add(l6);

        Label l7 = new Label("");
        l7.setBounds((int) Math.ceil(Constants.xSize * 0.05),12*Constants.ySize/20, 200, 50);
        add(l7);


        Button quit = new Button("Quit");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),13*Constants.ySize/20,80,30);
        add(quit);
        quit.addActionListener (e -> {
            dispose();
        });



        TextField search = new TextField();
        search.setBounds((int) Math.ceil(Constants.xSize * 0.05),Constants.ySize/20,250,20);
        search.addActionListener (e -> {
            listModel.clear();
            String ref = search.getText();
            for (Treatment t : Datas.getTreatments().values()) {
                if (t.getDoctor() == id ||t.getPatient() == id) {
                    Patient p = Datas.getPatients().get(t.getPatient());
                    Doctor d = Datas.getDoctors().get(t.getDoctor());
                    String current = t.getId() + "-" + (t.getPatient()!=id ? p.getFirstName().substring(0, 1).toUpperCase() + p.getFirstName().substring(1).toLowerCase() + " " + p.getLastName().toUpperCase() : d.getFirstName().substring(0, 1).toUpperCase() + d.getFirstName().substring(1).toLowerCase() + " " + d.getLastName().toUpperCase());
                    if (current.toLowerCase().contains(ref.toLowerCase())) {
                        listModel.addElement(current);
                    }
                }
            }
            list.setModel(listModel);
        });
        add(search);

        JButton button = new JButton("Select");
        button.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 275, Constants.ySize/20 + 55, 80,40);
        button.addActionListener (e -> {
            int tr = Integer.valueOf(list.getSelectedValue().split("-")[0]);
            Treatment t = Datas.getTreatments().get(tr);
            Patient p = Datas.getPatients().get(t.getPatient());
            Doctor d = Datas.getDoctors().get(t.getDoctor());
            l1.setText("Patient: " + p.getFirstName().substring(0, 1).toUpperCase() + p.getFirstName().substring(1).toLowerCase() + " " + p.getLastName().toUpperCase());
            l2.setText("Doctor: " + d.getFirstName().substring(0, 1).toUpperCase() + d.getFirstName().substring(1).toLowerCase() + " " + d.getLastName().toUpperCase());
            l3.setText("Date: " + t.getDate());
            l4.setText("Begins: " + t.getDateBeg());
            l5.setText("Ends: " + t.getDateEnd());
            l6.setText("Medicines: " + t.getMedicines());
            l7.setText("Price: " + t.getPrice());
        });
        add(button);


        JButton button2 = new JButton("Cancel");
        button2.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 275, Constants.ySize/20 + 100, 80,40);
        button2.addActionListener (e -> {
            int tr = Integer.valueOf(list.getSelectedValue().split("-")[0]);
            Treatment app = Datas.getTreatments().get(tr);
            Patient p = Datas.getPatients().get(app.getPatient());
            Doctor d = Datas.getDoctors().get(app.getDoctor());
            List<Integer> l = p.getTreatments();
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) == app.getId()) { l.remove(i); break; }
            }
            p.setTreatments(l);
            l = d.getTreatments();
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) == app.getId()) { l.remove(i); break; }
            }
            d.setTreatments(l);
            Datas.addPatient(p);
            Datas.addDoctor(d);
            Datas.removeTreatment(tr);

        });
        add(button2);

        if (Datas.getDoctors().keySet().contains(id)) {
            JButton button3 = new JButton("Edit");
            button3.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 275, Constants.ySize / 20 + 150, 80, 40);
            button3.addActionListener(e -> {
                int tr = Integer.valueOf(list.getSelectedValue().split("-")[0]);
                new EditTreatments(tr);
            });
            add(button3);
        }

        setLayout(null);
        setVisible(true);
    }

}
