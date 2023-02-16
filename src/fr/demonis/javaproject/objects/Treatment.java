package fr.demonis.javaproject.objects;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;

public class Treatment {

     static int totalId = 0;
    int id;
    String date, dateBeg, dateEnd;
    double price;
    Doctor doctor;
    Patient patient;

    public Treatment(String date, String dateBeg, String dateEnd, double price, Doctor doctor, Patient patient) {
        this.date = date;
        this.dateBeg = dateBeg;
        this.dateEnd = dateEnd;
        this.price = price;
        this.doctor = doctor;
        this.patient = patient;
        this.id = totalId;
        totalId++;
    }

    public String getDateBeg() {
        return dateBeg;
    }

    public void setDateBeg(String dateBeg) {
        this.dateBeg = dateBeg;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }
}
