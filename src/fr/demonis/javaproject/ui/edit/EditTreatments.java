package fr.demonis.javaproject.ui.edit;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;
import fr.demonis.javaproject.utils.SearchPatient;

import java.awt.*;
import java.util.List;

public class EditTreatments extends Frame {

    TextField date, datebeg,dateend,medicines,price;


    public EditTreatments(int id) {
        setSize((Constants.xSize), (Constants.ySize));
        Treatment tre = Datas.getTreatments().get(id);

        //create components
        date = new TextField();
        date.setText(tre.getDate());
        date.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (1 * Constants.ySize / 20), 170, 20);
        Label l1 = new Label("                Date*:");
        l1.setBounds((int) Math.ceil(Constants.xSize * 0.05), 1 * Constants.ySize / 20, 200, 50);
        add(date);
        add(l1);


        datebeg = new TextField();
        datebeg.setText(tre.getDateBeg());
        datebeg.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (2 * Constants.ySize / 20), 170, 20);
        Label l2 = new Label("              Begins*:");
        l2.setBounds((int) Math.ceil(Constants.xSize * 0.05), 2 * Constants.ySize / 20, 200, 50);
        add(datebeg);
        add(l2);


        dateend = new TextField();
        dateend.setText(tre.getDateEnd());
        dateend.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (3 * Constants.ySize / 20), 170, 20);
        Label l3 = new Label("                Ends*:");
        l3.setBounds((int) Math.ceil(Constants.xSize * 0.05), 3 * Constants.ySize / 20, 200, 50);
        add(dateend);
        add(l3);


        medicines = new TextField();
        medicines.setText(tre.getMedicines());
        medicines.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (4 * Constants.ySize / 20), 170, 20);
        Label l4 = new Label("           Medicines*:");
        l4.setBounds((int) Math.ceil(Constants.xSize * 0.05), 4 * Constants.ySize / 20, 200, 50);
        add(medicines);
        add(l4);


        price = new TextField();
        price.setText(tre.getPrice()+"");
        price.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 15 + (5 * Constants.ySize / 20), 170, 20);
        Label l5 = new Label("               Price*:");
        l5.setBounds((int) Math.ceil(Constants.xSize * 0.05), 5 * Constants.ySize / 20, 200, 50);
        add(price);
        add(l5);


        Patient pa = Datas.getPatients().get(tre.getPatient());
        Label la = new Label(pa.getId() + "-" + pa.getFirstName().substring(0, 1).toUpperCase() + pa.getFirstName().substring(1).toLowerCase() + " " + pa.getLastName().toUpperCase());
        la.setBounds((int) Math.ceil(Constants.xSize * 0.05) + 200, 6 + 3 * Constants.ySize / 20, 200, 50);
        add(la);
        Label l6 = new Label("             Patient*:");
        l6.setBounds((int) Math.ceil(Constants.xSize * 0.05), 7 * Constants.ySize / 20, 200, 50);
        add(l6);
        SearchPatient sp = new SearchPatient(this, (int) Math.ceil(Constants.xSize * 0.05) + 200,15 + 7 * Constants.ySize / 20, 250, 150);


        /*Label l7 = new Label("              Doctor*:");
        l7.setBounds((int) Math.ceil(Constants.xSize * 0.05), 11 * Constants.ySize / 21, 200, 50);
        add(l7);
        SearchDoctor sd = new SearchDoctor(this, (int) Math.ceil(Constants.xSize * 0.05) + 200,15+11 * Constants.ySize / 21, 250, 150);
*/

        Label l9 = new Label("");
        l9.setBounds((int) Math.ceil(Constants.xSize*0.05), 12*Constants.ySize/20, 200, 50);
        add(l9);
        Button b=new Button("Send");
        b.setBounds((int) Math.ceil(Constants.xSize*0.05),13*Constants.ySize/20,80,30);
        Label l8 = new Label("*: Must be filled");
        l8.setBounds((int) Math.ceil(Constants.xSize*0.05), 14*Constants.ySize/20, 200, 50);
        add(b);
        add(l8);


        Button quit = new Button("Quit");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),15*Constants.ySize/20,80,30);
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
