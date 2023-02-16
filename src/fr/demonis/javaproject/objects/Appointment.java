package fr.demonis.javaproject.objects;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;

public class Appointment {

    static int totalId = 0;
    int id;
    String date;
    Patient patient;
    Doctor doctor;
    double price;

    public Appointment(int id, String date, Patient patient, Doctor doctor, double price) {
        this.id = id;
        this.date = date;
        this.patient = patient;
        this.doctor = doctor;
        this.price = price;
        this.id = totalId;
        totalId++;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
