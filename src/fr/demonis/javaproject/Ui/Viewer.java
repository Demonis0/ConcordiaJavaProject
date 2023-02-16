package fr.demonis.javaproject.Ui;

import fr.demonis.javaproject.Entities.Patient;
import fr.demonis.javaproject.Main;
import fr.demonis.javaproject.Utils.Constants;

import java.awt.*;
import java.awt.event.*;
public class Viewer extends Frame implements ActionListener{
    public static TextField fn, ln, dob, ic, em;

    Viewer(){

//create components
        fn=new TextField();
        fn.setBounds(300,100,170,20);
        Label l1 = new Label("           Firstname:");
        l1.setBounds(100, 85, 200, 50);

        ln=new TextField();
        ln.setBounds(300,150,170,20);
        Label l2 = new Label("            Lastname:");
        l2.setBounds(100, 135, 200, 50);

        dob=new TextField();
        dob.setBounds(300,200,170,20);
        Label l3 = new Label("       Date of Birth:");
        l3.setBounds(100, 185, 200, 50);

        ic=new TextField();
        ic.setBounds(300,250,170,20);
        Label l4 = new Label("Insurance Carrier:");
        l4.setBounds(100, 235, 200, 50);

        em=new TextField();
        em.setBounds(300,300,170,20);
        Label l5 = new Label("            Employer:");
        l5.setBounds(100, 285, 200, 50);

        Button b=new Button("Leave");
        b.setBounds(100,350,80,30);

        b.addActionListener(e -> {
            dispose();
        });//passing current instance



//add components and set size, layout and visibility
        add(b);add(fn);add(ln);add(dob);add(ic);add(em);add(l1);add(l2);add(l3);add(l4);add(l5);
        setSize((Constants.xSize), (Constants.ySize));
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        fn.setText("Secretary");
    }
}
