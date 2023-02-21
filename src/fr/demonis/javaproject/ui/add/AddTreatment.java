package fr.demonis.javaproject.ui.add;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.utils.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AddTreatment extends Frame{

    TextField date, datebeg,dateend,medicines,price;


    public AddTreatment(int id) {
        setSize((Constants.xSize), (Constants.ySize));

        //create components
        date = new TextField();
        date.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (1 * Constants.ySize / 20), 170, 20);
        Label l1 = new Label("                Date*:");
        l1.setBounds((int) Math.ceil(Constants.xSize * 0.05), 1 * Constants.ySize / 20, 200, 50);
        add(date);
        add(l1);


        datebeg = new TextField();
        datebeg.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (2 * Constants.ySize / 20), 170, 20);
        Label l2 = new Label("              Begins*:");
        l2.setBounds((int) Math.ceil(Constants.xSize * 0.05), 2 * Constants.ySize / 20, 200, 50);
        add(datebeg);
        add(l2);


        dateend = new TextField();
        dateend.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (3 * Constants.ySize / 20), 170, 20);
        Label l3 = new Label("                Ends*:");
        l3.setBounds((int) Math.ceil(Constants.xSize * 0.05), 3 * Constants.ySize / 20, 200, 50);
        add(dateend);
        add(l3);


        medicines = new TextField();
        medicines.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (4 * Constants.ySize / 20), 170, 20);
        Label l4 = new Label("           Medicines*:");
        l4.setBounds((int) Math.ceil(Constants.xSize * 0.05), 4 * Constants.ySize / 20, 200, 50);
        add(medicines);
        add(l4);


        price = new TextField();
        price.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (5 * Constants.ySize / 20), 170, 20);
        Label l5 = new Label("               Price*:");
        l5.setBounds((int) Math.ceil(Constants.xSize * 0.05), 5 * Constants.ySize / 20, 200, 50);
        add(price);
        add(l5);


        Label l6 = new Label("             Patient*:");
        l6.setBounds((int) Math.ceil(Constants.xSize * 0.05), 6 * Constants.ySize / 20, 200, 50);
        add(l6);
        SearchPatient sp = new SearchPatient(this, (int) Math.ceil(Constants.xSize * 0.05) + 200,15 + 6 * Constants.ySize / 20, 250, 150);


        /*Label l7 = new Label("              Doctor*:");
        l7.setBounds((int) Math.ceil(Constants.xSize * 0.05), 11 * Constants.ySize / 21, 200, 50);
        add(l7);
        SearchDoctor sd = new SearchDoctor(this, (int) Math.ceil(Constants.xSize * 0.05) + 200,15+11 * Constants.ySize / 21, 250, 150);
*/

        Label l9 = new Label("");
        l9.setBounds((int) Math.ceil(Constants.xSize*0.05), 11*Constants.ySize/20, 200, 50);
        add(l9);
        Button b=new Button("Send");
        b.setBounds((int) Math.ceil(Constants.xSize*0.05),12*Constants.ySize/20,80,30);
        Label l8 = new Label("*: Must be filled");
        l8.setBounds((int) Math.ceil(Constants.xSize*0.05), 13*Constants.ySize/20, 200, 50);
        add(b);
        add(l8);


        Button quit = new Button("Quit");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),14*Constants.ySize/20,80,30);
        add(quit);
        quit.addActionListener (e -> {
            dispose();
        });


        b.addActionListener(e -> {
            if (!dateend.getText().equals("") && !date.getText().equals("") && sp.getSelectedItem() != null && !datebeg.getText().equals("") && !medicines.getText().equals("") && !price.getText().equals("")) {
                String datee = date.getText();
                String beg = datebeg.getText();
                String end = dateend.getText();
                String med = medicines.getText();
                double pr = Double.parseDouble(price.getText());
                int patientId = Integer.parseInt(sp.getSelectedItem().split("-")[0]);
                int doctorId = id;
                Treatment tr = new Treatment(datee, beg, med, end, pr, doctorId, patientId, Datas.totalTreatmentsId);
                Doctor doc = Datas.getDoctors().get(doctorId);
                List<Integer> l = doc.getTreatments();
                l.add(Datas.totalTreatmentsId);
                doc.setTreatments(l);
                Datas.addDoctor(doc);
                Patient p = Datas.getPatients().get(patientId);
                l = p.getTreatments();
                l.add(Datas.totalTreatmentsId);
                p.setTreatments(l);
                Datas.addPatient(p);
                Datas.totalTreatmentsId++;
                Datas.addTreatment(tr);


                dispose();
            } else {
                l9.setText("You must fill all the required fileds.");
            }
        });

        setLayout(null);
        setVisible(true);
    }
}
