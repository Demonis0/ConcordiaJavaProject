package fr.demonis.javaproject.objects;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;

import java.io.Serializable;

public class Appointment implements Serializable {

    static int totalId = 0;
    int id;
    String date;
    int patient;
    int doctor;
    double price;

    public Appointment(int id, String date, int patient, int doctor, double price) {
        this.id = id;
        this.date = date;
        this.patient = patient;
        this.doctor = doctor;
        this.price = price;
        this.id = totalId;
        totalId++;
    }

    public int getId() {
        return id;
    }

    public int getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
