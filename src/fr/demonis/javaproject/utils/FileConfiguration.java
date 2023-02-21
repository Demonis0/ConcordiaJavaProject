package fr.demonis.javaproject.utils;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class FileConfiguration {

    public static void save() {
        try {
            String fileName = "datas\\patients.txt";
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Datas.getPatients().values().stream().toList());

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

            fileName = "datas\\config.txt";
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            List<Integer> config = new ArrayList<Integer>();
            config.add(Datas.totalPersonId);
            config.add(Datas.totalAppointmentsId);
            config.add(Datas.totalTreatmentsId);
            oos.writeObject(config);

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
            File f5 = new File("datas\\config.txt");
            if (!f1.exists()) f1.createNewFile();
            if (!f2.exists()) f2.createNewFile();
            if (!f3.exists()) f3.createNewFile();
            if (!f4.exists()) f4.createNewFile();
            if (!f5.exists()) f5.createNewFile();
            String fileName;
            FileInputStream fin = null;
            ObjectInputStream ois = null;
            if (f1.length() != 0) {
                fileName = "datas\\patients.txt";
                fin = new FileInputStream(fileName);
                ois = new ObjectInputStream(fin);
                List<Patient> lp = (List<Patient>) ois.readObject();
                for (Patient p : lp) Datas.addPatient(p);
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
                for (Treatment p : (List<Treatment>) ois.readObject()) if ((new Date(Integer.parseInt(p.getDateEnd().split("/")[2]), Integer.parseInt(p.getDateEnd().split("/")[1]),Integer.parseInt(p.getDateEnd().split("/")[0]))).after(new Date(System.currentTimeMillis()))) Datas.addTreatment(p);
            }

            if (f4.length() != 0) {
                fileName = "datas\\appointments.txt";
                fin = new FileInputStream(fileName);
                ois = new ObjectInputStream(fin);
                for (Appointment p : (List<Appointment>) ois.readObject()) if ((new Date(Integer.parseInt(p.getDate().split("/")[2]), Integer.parseInt(p.getDate().split("/")[1]),Integer.parseInt(p.getDate().split("/")[0]))).after(new Date(System.currentTimeMillis()))) Datas.addAppointment(p);
            }

            if (f5.length() != 0) {
                fileName = "datas\\config.txt";
                fin = new FileInputStream(fileName);
                ois = new ObjectInputStream(fin);
                List<Integer> lc = (List<Integer>) ois.readObject();
                Datas.totalPersonId = lc.get(0);
                Datas.totalAppointmentsId = lc.get(1);
                Datas.totalTreatmentsId = lc.get(2);
            }

            if (ois != null) ois.close();
            if (fin != null) fin.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

