package fr.demonis.javaproject.utils;
import fr.demonis.javaproject.entities.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SearchPatient {

    String selectedItem;

    public SearchPatient(Frame frame, int x, int y, int width, int height) {

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(list);

        scrollPane.setBounds(x,y+Constants.ySize/20,width,height);
        frame.add(scrollPane);


        TextField search = new TextField();
        search.setBounds(x,y,width,20);
        search.addActionListener (e -> {
            listModel.clear();
            String ref = search.getText();
            for (Patient p : Datas.getPatients().values()) {
                String current = p.getId() + "-" + p.getFirstName().substring(0, 1).toUpperCase() + p.getFirstName().substring(1).toLowerCase() + " " + p.getLastName().toUpperCase();

                if (current.toLowerCase().contains(ref.toLowerCase())) {
                    listModel.addElement(current);

                }
            }
            list.setModel(listModel);
        });
        frame.add(search);

        JButton button = new JButton("Select");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedElement = list.getSelectedValue();
                //selectedItem = selectedElement;
                setSelectedItem(selectedElement);
            }
        });
        button.setBounds(x + width + 10, y+Constants.ySize/20 + height/2 - 20, 80,40);
        frame.add(button);
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }
}
