package fr.demonis.javaproject.ui.edit;

import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.utils.Constants;
import fr.demonis.javaproject.utils.Datas;

import java.awt.*;

public class EditPatient extends Frame {

    TextField fn, ln, dob, ic, em, ma, ph;


    public EditPatient(int id){
        setSize((Constants.xSize), (Constants.ySize));
        Patient p = Datas.getPatients().get(id);

        Label l = new Label("                    Id: " + id);
        l.setBounds((int) Math.ceil(Constants.xSize*0.05), Constants.ySize/20, 200, 50);
        add(l);

        //create components
        fn=new TextField();
        fn.setText(p.getFirstName());
        fn.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+(2*Constants.ySize/20),170,20);
        Label l1 = new Label("           Firstname*:");
        l1.setBounds((int) Math.ceil(Constants.xSize*0.05), 2*Constants.ySize/20, 200, 50);
        add(fn);
        add(l1);


        ln=new TextField();
        ln.setText(p.getLastName());
        ln.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+(3*Constants.ySize/20),170,20);
        Label l2 = new Label("            Lastname*:");
        l2.setBounds((int) Math.ceil(Constants.xSize*0.05), 3*Constants.ySize/20, 200, 50);
        add(ln);
        add(l2);


        dob=new TextField();
        dob.setText(p.getDateOfBirth());
        dob.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+4*Constants.ySize/20,170,20);
        Label l3 = new Label("       Date of Birth*:");
        l3.setBounds((int) Math.ceil(Constants.xSize*0.05), 4*Constants.ySize/20, 200, 50);
        add(dob);
        add(l3);


        ic=new TextField();
        ic.setText(p.getInsuranceCarrier());
        ic.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+5*Constants.ySize/20,170,20);
        Label l4 = new Label("Insurance Carrier*:");
        l4.setBounds((int) Math.ceil(Constants.xSize*0.05), 5*Constants.ySize/20, 200, 50);
        add(ic);
        add(l4);


        em=new TextField();
        em.setText(p.getEmployer());
        em.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+6*Constants.ySize/20,170,20);
        Label l5 = new Label("            Employer*:");
        l5.setBounds((int) Math.ceil(Constants.xSize*0.05), 6*Constants.ySize/20, 200, 50);
        add(em);
        add(l5);


        ma=new TextField();
        ma.setText(p.getMail());
        ma.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+7*Constants.ySize/20,170,20);
        Label l7 = new Label("                 Mail:");
        l7.setBounds((int) Math.ceil(Constants.xSize*0.05), 7*Constants.ySize/20, 200, 50);
        add(ma);
        add(l7);


        ph=new TextField();
        ph.setText(p.getPhone());
        ph.setBounds((int) Math.ceil(Constants.xSize*0.05)+200,15+8*Constants.ySize/20,170,20);
        Label l8 = new Label("                Phone:");
        l8.setBounds((int) Math.ceil(Constants.xSize*0.05), 8*Constants.ySize/20, 200, 50);
        add(ph);
        add(l8);

        Label l9 = new Label("");
        l9.setBounds((int) Math.ceil(Constants.xSize*0.05), 9*Constants.ySize/20, 200, 50);
        add(l9);
        Button b=new Button("Save");
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
                Patient pa = new Patient(firstN, lastN, dateOfB, insuranceC, employer, id);
                pa.setMail(mail);
                pa.setPhone(phone);
                Datas.addPatient(pa);

                dispose();
            } else {
                l9.setText("You must fill all the required fileds.");
            }
        });


        setLayout(null);
        setVisible(true);
    }
}
