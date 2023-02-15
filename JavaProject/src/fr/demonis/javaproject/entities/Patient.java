package fr.demonis.javaproject.entities;

import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Threatment;
import fr.demonis.javaproject.utils.Specialities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Patient extends Person{

    String insuranceCarrier,exployer;
    List<Appointment> futureAppointments,pastAppointments;
    List<Threatment> threatments, pastThreatments;
    HashMap<Specialities, Doctor> doctors;

    public Patient(String firstName, String lastName, String dateOfBirth, String phone, String mail, String insuranceCarrier, String exployer) {
        super(firstName, lastName, dateOfBirth, phone, mail);
        this.insuranceCarrier = insuranceCarrier;
        this.exployer = exployer;
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.doctors = new HashMap<Specialities, Doctor>();
        this.threatments = new ArrayList<Threatment>();
        this.pastThreatments = new ArrayList<Threatment>();
    }

    public Patient(String firstName, String lastName, String dateOfBirth, String insuranceCarrier, String exployer) {
        super(firstName, lastName, dateOfBirth);
        this.insuranceCarrier = insuranceCarrier;
        this.exployer = exployer;
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.doctors = new HashMap<Specialities, Doctor>();
        this.threatments = new ArrayList<Threatment>();
        this.pastThreatments = new ArrayList<Threatment>();
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

    public void setDoctors(HashMap<Specialities, Doctor> hm) {
        this.doctors = hm;
    }

    public void setFutureAppointments(List<Appointment> futureAppointments) {
        this.futureAppointments = futureAppointments;
    }

    public void setPastAppointments(List<Appointment> pastAppointments) {
        this.pastAppointments = pastAppointments;
    }

    public void setThreatments(List<Threatment> threatments) {
        this.threatments = threatments;
    }

    public void setPastThreatments(List<Threatment> pastThreatments) {
        this.pastThreatments = pastThreatments;
    }
}
