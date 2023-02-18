package fr.demonis.javaproject.utils;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;

import java.util.HashMap;

public class Datas {

    static HashMap<Integer, Patient> patients = new HashMap<Integer, Patient>();
    static HashMap<Integer, Doctor> doctors = new HashMap<Integer, Doctor>();
    static HashMap<Integer, Appointment> appointments = new HashMap<Integer, Appointment>();
    static HashMap<Integer, Treatment> treatments = new HashMap<Integer, Treatment>();

    public static void addPatient(Patient p) {
        patients.put(p.getId(), p);
    }

    public static  void addDoctor(Doctor d) {
        doctors.put(d.getId(), d);
    }

    public static void addAppointment(Appointment a) {
        appointments.put(a.getId(), a);
    }

    public static void addTreatment(Treatment t) {
        treatments.put(t.getId(), t);
    }
}
