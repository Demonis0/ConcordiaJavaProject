package fr.demonis.javaproject.objects;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;

import java.io.Serializable;

public class Treatment implements Serializable {

    int id;
    String date, dateBeg, dateEnd, medicines;
    double price;
    int doctor;
    int patient;

    public Treatment(String date, String dateBeg, String medicines, String dateEnd, double price, int doctor, int patient, int id) {
        this.date = date;
        this.dateBeg = dateBeg;
        this.dateEnd = dateEnd;
        this.price = price;
        this.doctor = doctor;
        this.patient = patient;
        this.medicines = medicines;
        this.id = id;
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

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public int getPatient() {
        return patient;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }
}
