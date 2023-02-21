package fr.demonis.javaproject.utils;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;

import java.util.HashMap;

public class Datas {

    static HashMap<Integer, Patient> patients;
    static HashMap<Integer, Doctor> doctors;
    static HashMap<Integer, Appointment> appointments;
    static HashMap<Integer, Treatment> treatments;

    public static int totalPersonId = 0;
    public static int totalAppointmentsId = 0;
    public static int totalTreatmentsId = 0;

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

    public static HashMap<Integer, Patient> getPatients() {
        return patients;
    }

    public static HashMap<Integer, Doctor> getDoctors() {
        return doctors;
    }

    public static HashMap<Integer, Appointment> getAppointments() {
        return appointments;
    }

    public static HashMap<Integer, Treatment> getTreatments() {
        return treatments;
    }

    public static void removeAppointment(int id) {
        appointments.remove(id);
    }

    public static void removeTreatment(int id) {
        treatments.remove(id);
    }

    public static void removePatient(int id) {
        patients.remove(id);
    }

    public static void removeDoctor(int id) {
        doctors.remove(id);
    }
}
