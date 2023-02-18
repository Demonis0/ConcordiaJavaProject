package fr.demonis.javaproject;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.ui.AddDoctor;
import fr.demonis.javaproject.ui.DoctorMenu;
import fr.demonis.javaproject.ui.MainMenu;
import fr.demonis.javaproject.utils.Datas;
import fr.demonis.javaproject.utils.Specialities;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {



    public static void main(String[] args) {
        //new MainMenu();
        /*Patient p = new Patient("Matthieu", "JACQUES", "14/02/2002", "Blue Cross", "SEPEFREI");
        p.setPhone("efpzlfef");
        p.setMail("vkodskofpzef");
        Patient p2 = new Patient("Boris", "JACQUES", "14/02/2002", "Blue Cross", "SEPEFREI");
        p2.setPhone("efpzlfef");
        p2.setMail("vkodskofpzef");
        Patient p3 = new Patient("jean", "JACQUES", "14/02/2002", "Blue Cross", "SEPEFREI");
        p3.setPhone("efpzlfef");
        p3.setMail("vkodskofpzef");
        Patient p4 = new Patient("Marie", "JACQUES", "14/02/2002", "Blue Cross", "SEPEFREI");
        p4.setPhone("efpzlfef");
        p4.setMail("vkodskofpzef");
        HashMap<Integer, Patient> hm = new HashMap<Integer, Patient>();
        hm.put(p.getId(), p);
        hm.put(p2.getId(), p2);
        hm.put(p3.getId(),p3);
        hm.put(p4.getId(),p4);
        List<Patient> patientList = hm.values().stream().toList();
        for (Patient pat :
                patientList) {
            System.out.println(pat.getFirstName());
        }*/

        /*JSONObject jo = new JSONObject();
        jo.put("Last Name", "JACQUES");
        jo.put("First Name", "Matthieu");
        jo.put("Date of birth", "14/02/2002");
        File file = new File("datas\\config.txt");
        try {
            Files.writeString(file.toPath(), jo.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file2 = new File("datas\\config.txt");
        List<String> lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(file2.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JSONObject jo2 = new JSONObject(lines.get(0));
        System.out.println(jo2.toString());
        System.out.println(jo2.get("Last Name"));
        System.out.println(jo2.get("First Name"));
        System.out.println(jo2.get("Date of birth"));
        HashMap<Specialities, Integer> l = new HashMap<Specialities, Integer>();
        l.put(Specialities.CRITICAL_CARE, 6);
        l.put(Specialities.DERMATOLOGISTS, 0);
        l.put(Specialities.GASTROENTEROLOGISTS, 4);
        List<String> li = new ArrayList<String>();
        for (Specialities sp : l.keySet()) {
            li.add(sp.toString() + ":" + l.get(sp));
        }
        jo2.put("liste", li);
        try {
            Files.writeString(file.toPath(), jo2.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        file2 = new File("datas\\config.txt");
        lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(file2.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JSONObject jo3 = new JSONObject(lines.get(0));
        System.out.println(jo3.get("liste").toString());
        JSONArray ar = jo3.getJSONArray("liste");
        List<Integer> tyum = new ArrayList<Integer>();
        HashMap<Specialities, Integer> m = new HashMap<Specialities, Integer>();
        for (int q = 0; q < ar.length(); q++) {
            String[] k = ar.getString(q).split(":");
            m.put(Specialities.valueOf(k[0]), Integer.valueOf(k[1]));
        }
        for (Specialities o :
                m.keySet()) {
            System.out.println(m.get(o));
        }
        System.out.println(jo3.getJSONArray("liste"));*/

    }





}
