package fr.demonis.javaproject.Ui;
import fr.demonis.javaproject.Entities.Patient;
import fr.demonis.javaproject.Main;
import fr.demonis.javaproject.Utils.Constants;

import java.awt.*;
import java.awt.event.*;
public class SecretaryMenu extends Frame implements ActionListener{

    TextField tf;

    SecretaryMenu(){

//create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Schedule");
        b.setBounds(100,120,80,30);
        Button c=new Button("Retour");
        c.setBounds(100,250,80,30);
        Button q=new Button("Quitter");
        q.setBounds(1000,150,80,30);
        Button a1=new Button("Add Patient");
        a1.setBounds(100,520,80,30);
        Button a2=new Button("Add Doctor");
        a2.setBounds(100,620,80,30);
        Button j=new Button("Join Person");
        j.setBounds(1000,220,80,30);

//register listener
        b.addActionListener(this);//passing current instance

        c.addActionListener (e -> {
            new MainMenu();
            dispose();
        });
        q.addActionListener (e -> {
            dispose();
        });
        a1.addActionListener (e -> {
            new AddPatient();
        });
        a2.addActionListener (e -> {
            new AddDoctor();
        });
        j.addActionListener (e -> {
            new Viewer();
            Patient p0 = Main.storage1.get(0);
            Viewer.fn.setText(p0.getFirstName());
            Viewer.ln.setText(p0.getLastName());
            Viewer.dob.setText(p0.getDateOfBirth());
            Viewer.ic.setText(p0.getInsuranceCarrier());
            Viewer.em.setText(p0.getExployer());
            dispose();
        });

//add components and set size, layout and visibility
        add(b);add(tf);add(c);add(q);add(a1);add(a2);add(j);
        setSize(Constants.xSize, Constants.ySize);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Secretary");
    }
}
