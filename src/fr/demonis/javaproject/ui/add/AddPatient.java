package fr.demonis.javaproject.ui.add;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.Main;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;
import fr.demonis.javaproject.utils.FileConfiguration;

import java.awt.*;
import java.awt.event.*;
public class AddPatient extends Frame {
    TextField fn, ln, dob, ic, em, ma, ph;


    public AddPatient(){
        setSize((Constants.xSize), (Constants.ySize));

        Label l = new Label("             Future Id: " + Datas.totalPersonId);
        l.setBounds((int) Math.ceil(Constants.xSize*0.05), Constants.ySize/20, 200, 50);
        add(l);

        //create components
        fn=new TextField();
        fn.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+(2*Constants.ySize/20),170,20);
        Label l1 = new Label("           Firstname*:");
        l1.setBounds((int) Math.ceil(Constants.xSize*0.05), 2*Constants.ySize/20, 200, 50);
        add(fn);
        add(l1);


        ln=new TextField();
        ln.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+(3*Constants.ySize/20),170,20);
        Label l2 = new Label("            Lastname*:");
        l2.setBounds((int) Math.ceil(Constants.xSize*0.05), 3*Constants.ySize/20, 200, 50);
        add(ln);
        add(l2);


        dob=new TextField();
        dob.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+4*Constants.ySize/20,170,20);
        Label l3 = new Label("       Date of Birth*:");
        l3.setBounds((int) Math.ceil(Constants.xSize*0.05), 4*Constants.ySize/20, 200, 50);
        add(dob);
        add(l3);


        ic=new TextField();
        ic.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+5*Constants.ySize/20,170,20);
        Label l4 = new Label("Insurance Carrier*:");
        l4.setBounds((int) Math.ceil(Constants.xSize*0.05), 5*Constants.ySize/20, 200, 50);
        add(ic);
        add(l4);


        em=new TextField();
        em.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+6*Constants.ySize/20,170,20);
        Label l5 = new Label("            Employer*:");
        l5.setBounds((int) Math.ceil(Constants.xSize*0.05), 6*Constants.ySize/20, 200, 50);
        add(em);
        add(l5);


        ma=new TextField();
        ma.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+7*Constants.ySize/20,170,20);
        Label l7 = new Label("                 Mail:");
        l7.setBounds((int) Math.ceil(Constants.xSize*0.05), 7*Constants.ySize/20, 200, 50);
        add(ma);
        add(l7);


        ph=new TextField();
        ph.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+8*Constants.ySize/20,170,20);
        Label l8 = new Label("                Phone:");
        l8.setBounds((int) Math.ceil(Constants.xSize*0.05), 8*Constants.ySize/20, 200, 50);
        add(ph);
        add(l8);

        Label l9 = new Label("");
        l9.setBounds((int) Math.ceil(Constants.xSize*0.05), 9*Constants.ySize/20, 200, 50);
        add(l9);
        Button b=new Button("Send");
        b.setBounds((int) Math.ceil(Constants.xSize*0.05),10*Constants.ySize/20,80,30);
        Label l6 = new Label("*: Must be filled");
        l6.setBounds((int) Math.ceil(Constants.xSize*0.05), 11*Constants.ySize/20, 200, 50);
        add(b);
        add(l6);

        Button quit = new Button("Quitter");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),12*Constants.ySize/20,80,30);
        add(quit);
        quit.addActionListener (e -> {
            dispose();
        });


        b.addActionListener(e -> {
            if (!fn.getText().equals("") && !ln.getText().equals("") && !dob.getText().equals("") && !ic.getText().equals("") && !em.getText().equals("")) {
                String firstN = fn.getText();
                String lastN = ln.getText();
                String dateOfB = dob.getText();
                String insuranceC = ic.getText();
                String employer = em.getText();
                String mail = ma.getText() == null ? "" : ma.getText();
                String phone = ph.getText() == null ? "" : ph.getText();
                Patient p = new Patient(firstN, lastN, dateOfB, insuranceC, employer, Datas.totalPersonId);
                p.setMail(mail);
                p.setPhone(phone);
                Datas.totalPersonId++;
                Datas.addPatient(p);

                dispose();
            } else {
                l9.setText("You must fill all the required fileds.");
            }
        });


        setLayout(null);
        setVisible(true);
    }
}
