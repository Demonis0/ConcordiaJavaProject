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

    public static void save() throws IOException {

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
    }

    public static void load() throws FileNotFoundException, IOException, ClassNotFoundException {

        String fileName = "datas\\patients.txt";
        FileInputStream fin = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fin);
        for (Patient p : (List<Patient>) ois.readObject()) Datas.addPatient(p);

        fileName = "datas\\doctors.txt";
        fin = new FileInputStream(fileName);
        ois = new ObjectInputStream(fin);
        for (Doctor p : (List<Doctor>) ois.readObject()) Datas.addDoctor(p);

        fileName = "datas\\treatments.txt";
        fin = new FileInputStream(fileName);
        ois = new ObjectInputStream(fin);
        for (Treatment p : (List<Treatment>) ois.readObject()) Datas.addTreatment(p);

        fileName = "datas\\appointments.txt";
        fin = new FileInputStream(fileName);
        ois = new ObjectInputStream(fin);
        for (Appointment p : (List<Appointment>) ois.readObject()) Datas.addAppointment(p);

        ois.close();
        fin.close();
    }
}
