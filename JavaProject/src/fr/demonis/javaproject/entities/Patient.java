package fr.demonis.javaproject.entities;

import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.utils.Specialities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Patient extends Person{

    String insuranceCarrier,exployer;
    List<Appointment> futureAppointments,pastAppointments;
    HashMap<Specialities, Doctor> doctors;

    public Patient(String firstName, String lastName, String dateOfBirth, String phone, String mail, String insuranceCarrier, String exployer) {
        super(firstName, lastName, dateOfBirth, phone, mail);
        this.insuranceCarrier = insuranceCarrier;
        this.exployer = exployer;
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.doctors = new HashMap<Specialities, Doctor>();
    }

    public Patient(String firstName, String lastName, String dateOfBirth, String insuranceCarrier, String exployer) {
        super(firstName, lastName, dateOfBirth);
        this.insuranceCarrier = insuranceCarrier;
        this.exployer = exployer;
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.doctors = new HashMap<Specialities, Doctor>();
    }

    public String getInsuranceCarrier() {
        return insuranceCarrier;
    }

    public void setInsuranceCarrier(String insuranceCarrier) {
        this.insuranceCarrier = insuranceCarrier;
    }

    public String getExployer() {
        return exployer;
    }

    public void setExployer(String exployer) {
        this.exployer = exployer;
    }

    public void setPastAppointment(List<Appointment> a) {
        this.pastAppointments=a;
    }

    public void setPFutureAppointment(List<Appointment> a) {
        this.futureAppointments=a;
    }

    public void setDoctors(HashMap<Specialities, Doctor> hm) {
        this.doctors = hm;
    }
}
