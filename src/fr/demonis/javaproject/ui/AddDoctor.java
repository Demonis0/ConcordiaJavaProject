package fr.demonis.javaproject.ui;

import fr.demonis.javaproject.Main;
import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;
import fr.demonis.javaproject.utils.Specialities;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDoctor extends Frame implements ActionListener {

    TextField fn, ln, dob, ic, ma, ph;


    AddDoctor(){
        setSize((Constants.xSize), (Constants.ySize));

        //create components
        fn=new TextField();
        fn.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+(1*Constants.ySize/20),170,20);
        Label l1 = new Label("            Firstname*:");
        l1.setBounds((int) Math.ceil(Constants.xSize*0.05), 1*Constants.ySize/20, 200, 50);
        add(fn);
        add(l1);


        ln=new TextField();
        ln.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+(2*Constants.ySize/20),170,20);
        Label l2 = new Label("             Lastname*:");
        l2.setBounds((int) Math.ceil(Constants.xSize*0.05), 2*Constants.ySize/20, 200, 50);
        add(ln);
        add(l2);


        dob=new TextField();
        dob.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+3*Constants.ySize/20,170,20);
        Label l3 = new Label("        Date of Birth*:");
        l3.setBounds((int) Math.ceil(Constants.xSize*0.05), 3*Constants.ySize/20, 200, 50);
        add(dob);
        add(l3);


        ic=new TextField();
        ic.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+4*Constants.ySize/20,170,20);
        Label l4 = new Label("Date of employment*:");
        l4.setBounds((int) Math.ceil(Constants.xSize*0.05), 4*Constants.ySize/20, 200, 50);
        add(ic);
        add(l4);



        Choice sp = new Choice();
        // setting the bounds of choice menu
        sp.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+5*Constants.ySize/20,170,20);

        // adding items to the choice menu
        for (Specialities s : Specialities.values()) {
            sp.addItem(s.toString());
        }
        Label l5 = new Label("             Employer*:");
        l5.setBounds((int) Math.ceil(Constants.xSize*0.05), 5*Constants.ySize/20, 200, 50);
        add(sp);
        add(l5);


        ma=new TextField();
        ma.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+6*Constants.ySize/20,170,20);
        Label l7 = new Label("                  Mail:");
        l7.setBounds((int) Math.ceil(Constants.xSize*0.05), 6*Constants.ySize/20, 200, 50);
        add(ma);
        add(l7);


        ph=new TextField();
        ph.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+7*Constants.ySize/20,170,20);
        Label l8 = new Label("                 Phone:");
        l8.setBounds((int) Math.ceil(Constants.xSize*0.05), 7*Constants.ySize/20, 200, 50);
        add(ph);
        add(l8);

        Label l9 = new Label("");
        l9.setBounds((int) Math.ceil(Constants.xSize*0.05), 8*Constants.ySize/20, 200, 50);
        add(l9);
        Button b=new Button("Send");
        b.setBounds((int) Math.ceil(Constants.xSize*0.05),9*Constants.ySize/20,80,30);
        Label l6 = new Label("*: Must be filled");
        l6.setBounds((int) Math.ceil(Constants.xSize*0.05), 10*Constants.ySize/20, 200, 50);
        add(b);
        add(l6);


        Button quit = new Button("Quitter");
        quit.setBounds((int) Math.ceil(Constants.xSize*0.80),11*Constants.ySize/20,80,30);
        add(quit);
        quit.addActionListener (e -> {
            dispose();
        });


        b.addActionListener(e -> {
            if (!fn.getText().equals("") && !ln.getText().equals("") && !dob.getText().equals("") && !ic.getText().equals("")) {
                String firstN = fn.getText();
                String lastN = ln.getText();
                String dateOfB = dob.getText();
                String dateOfEmployment = ic.getText();
                Specialities spe = Specialities.valueOf(sp.getSelectedItem());
                String mail = ma.getText() == null ? "" : ma.getText();
                String phone = ph.getText() == null ? "" : ph.getText();
                Doctor d = new Doctor(firstN, lastN, dateOfB, dateOfEmployment, spe, Datas.totalPersonId);
                d.setMail(mail);
                d.setPhone(phone);
                Datas.totalPersonId++;
                Datas.addDoctor(d);

                dispose();
            } else {
                l9.setText("You must fill all the required fileds.");
            }
        });




        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
    }
}
