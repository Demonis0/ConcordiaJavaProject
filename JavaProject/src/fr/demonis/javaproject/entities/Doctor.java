package fr.demonis.javaproject.entities;

import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Threatment;
import fr.demonis.javaproject.utils.Specialities;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person{

    String dateOfEmployment;
    Specialities speciality;
    List<Patient> patients,pastPatients;
    List<Appointment> futureAppointments,pastAppointments;
    List<Threatment> threatments, pastThreatments;

    public Doctor(String firstName, String lastName, String dateOfBirth, String phone, String mail, String dateOfEmployment, Specialities speciality) {
        super(firstName, lastName, dateOfBirth, phone, mail);
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;
        this.patients = new ArrayList<Patient>();
        this.pastPatients = new ArrayList<Patient>();
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.threatments = new ArrayList<Threatment>();
        this.pastThreatments = new ArrayList<Threatment>();
    }

    public Doctor(String firstName, String lastName, String dateOfBirth, String dateOfEmployment, Specialities speciality) {
        super(firstName, lastName, dateOfBirth);
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;
        this.patients = new ArrayList<Patient>();
        this.pastPatients = new ArrayList<Patient>();
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.threatments = new ArrayList<Threatment>();
        this.pastThreatments = new ArrayList<Threatment>();
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Specialities getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Specialities speciality) {
        this.speciality = speciality;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void setPastPatients(List<Patient> pastPatients) {
        this.pastPatients = pastPatients;
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
