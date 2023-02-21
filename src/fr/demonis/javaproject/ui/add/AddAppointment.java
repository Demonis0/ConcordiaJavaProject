package fr.demonis.javaproject.ui.add;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.utils.*;

import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class AddAppointment extends Frame{

    TextField fn, ln;


    public AddAppointment() {
        setSize((Constants.xSize), (Constants.ySize));

        //create components
        fn = new TextField();
        fn.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (1 * Constants.ySize / 20), 170, 20);
        Label l1 = new Label("                Date*:");
        l1.setBounds((int) Math.ceil(Constants.xSize * 0.05), 1 * Constants.ySize / 20, 200, 50);
        add(fn);
        add(l1);


        ln = new TextField();
        ln.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (2 * Constants.ySize / 20), 170, 20);
        Label l2 = new Label("               Price*:");
        l2.setBounds((int) Math.ceil(Constants.xSize * 0.05), 2 * Constants.ySize / 20, 200, 50);
        add(ln);
        add(l2);

        Label l3 = new Label("             Patient*:");
        l3.setBounds((int) Math.ceil(Constants.xSize * 0.05), 3 * Constants.ySize / 20, 200, 50);
        add(l3);
        SearchPatient sp = new SearchPatient(this, (int) Math.ceil(Constants.xSize * 0.05) + 200,15 + 3 * Constants.ySize / 20, 250, 150);

        Label l4 = new Label("              Doctor*:");
        l4.setBounds((int) Math.ceil(Constants.xSize * 0.05), 8 * Constants.ySize / 20, 200, 50);
        add(l4);
        SearchDoctor sd = new SearchDoctor(this, (int) Math.ceil(Constants.xSize * 0.05) + 200,15+8 * Constants.ySize / 20, 250, 150);

        Label l9 = new Label("");
        l9.setBounds((int) Math.ceil(Constants.xSize*0.05), 14*Constants.ySize/20, 200, 50);
        add(l9);
        Button b=new Button("Send");
        b.setBounds((int) Math.ceil(Constants.xSize*0.05),15*Constants.ySize/20,80,30);
        Label l6 = new Label("*: Must be filled");
        l6.setBounds((int) Math.ceil(Constants.xSize*0.05), 16*Constants.ySize/20, 200, 50);
        add(b);
        add(l6);

        Button quit = new Button("Quitter");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),17*Constants.ySize/20,80,30);
        add(quit);
        quit.addActionListener (e -> {
            dispose();
        });


        b.addActionListener(e -> {
            if (!fn.getText().equals("") && !ln.getText().equals("") && sp.getSelectedItem() != null && sd.getSelectedItem() != null) {
                String date = fn.getText();
                String price = ln.getText();
                int patientId = Integer.parseInt(sp.getSelectedItem().split("-")[0]);
                int doctorId = Integer.parseInt(sd.getSelectedItem().split("-")[0]);
                Appointment app = new Appointment(date, patientId, doctorId, Double.parseDouble(price), Datas.totalAppointmentsId);
                Patient p = Datas.getPatients().get(patientId);
                Doctor d = Datas.getDoctors().get(doctorId);

                List<Integer> l = p.getFutureAppointments();
                l.add(Datas.totalAppointmentsId);
                p.setFutureAppointments(l);
                if (!p.getDoctors().values().contains(d.getId())) {
                    HashMap<Specialities, Integer> hm = p.getDoctors();
                    hm.put(d.getSpeciality(), d.getId());
                    l = d.getPatients();
                    l.add(patientId);
                    d.setPatients(l);
                }

                l = d.getFutureAppointments();
                l.add(Datas.totalAppointmentsId);
                d.setFutureAppointments(l);

                Datas.addPatient(p);
                Datas.addDoctor(d);

                Datas.totalAppointmentsId++;
                Datas.addAppointment(app);

                dispose();
            } else {
                l9.setText("You must fill all the required fileds.");
            }
        });

        setLayout(null);
        setVisible(true);
    }
}
