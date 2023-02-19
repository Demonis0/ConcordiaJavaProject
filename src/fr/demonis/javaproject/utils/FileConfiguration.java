package fr.demonis.javaproject.utils;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileConfiguration {

    public static void save() {
        try {
            String fileName = "datas\\patients.txt";
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Datas.patients.values().stream().toList());

            fileName = "datas\\doctors.txt";
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(Datas.getDoctors().values().stream().toList());

            fileName = "datas\\treatments.txt";
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(Datas.getTreatments().values().stream().toList());

            fileName = "datas\\appointments.txt";
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(Datas.getAppointments().values().stream().toList());

            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void load() {
        Datas.patients = new HashMap<Integer, Patient>();
        Datas.doctors = new HashMap<Integer, Doctor>();
        Datas.appointments = new HashMap<Integer, Appointment>();
        Datas.treatments = new HashMap<Integer, Treatment>();
        try {
            File f1 = new File("datas\\patients.txt");
            File f2 = new File("datas\\doctors.txt");
            File f3 = new File("datas\\treatments.txt");
            File f4 = new File("datas\\appointments.txt");
            if (!f1.exists() ||
                    !f2.exists() ||
                    !f3.exists() ||
                    !f4.exists()) {
                (new File("datas\\patients.txt")).createNewFile();
                (new File("datas\\doctors.txt")).createNewFile();
                (new File("datas\\treatments.txt")).createNewFile();
                (new File("datas\\appointments.txt")).createNewFile();
                load();
            } else {
                String fileName;
                FileInputStream fin = null;
                ObjectInputStream ois = null;
                if (f1.length() != 0) {
                    fileName = "datas\\patients.txt";
                    fin = new FileInputStream(fileName);
                    ois = new ObjectInputStream(fin);
                    for (Patient p : (List<Patient>) ois.readObject()) Datas.addPatient(p);
                }

                if (f2.length() != 0) {
                    fileName = "datas\\doctors.txt";
                    fin = new FileInputStream(fileName);
                    ois = new ObjectInputStream(fin);
                    for (Doctor p : (List<Doctor>) ois.readObject()) Datas.addDoctor(p);
                }

                if (f3.length() != 0) {
                    fileName = "datas\\treatments.txt";
                    fin = new FileInputStream(fileName);
                    ois = new ObjectInputStream(fin);
                    for (Treatment p : (List<Treatment>) ois.readObject()) Datas.addTreatment(p);
                }

                if (f4.length() != 0) {
                    fileName = "datas\\appointments.txt";
                    fin = new FileInputStream(fileName);
                    ois = new ObjectInputStream(fin);
                    for (Appointment p : (List<Appointment>) ois.readObject()) Datas.addAppointment(p);
                }

                if (ois != null) ois.close();
                if (fin != null) fin.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

