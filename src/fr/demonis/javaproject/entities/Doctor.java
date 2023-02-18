package fr.demonis.javaproject.entities;

import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.utils.Specialities;

import java.util.ArrayList;
import java.util.List;
public class Doctor extends Person{
    String dateOfEmployment;
    Specialities speciality;
    List<Patient> patients,pastPatients;
    List<Appointment> futureAppointments,pastAppointments;
    List<Treatment> treatments, pastTreatments;

    public Doctor(String firstName, String lastName, String dateOfBirth, String phone, String mail, String dateOfEmployment, Specialities speciality) {
        super(firstName, lastName, dateOfBirth, phone, mail);
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;  
        this.patients = new ArrayList<Patient>();
        this.pastPatients = new ArrayList<Patient>();
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.treatments = new ArrayList<Treatment>();
        this.pastTreatments = new ArrayList<Treatment>();
    }

    public Doctor(String firstName, String lastName, String dateOfBirth, String dateOfEmployment, Specialities speciality) {
        super(firstName, lastName, dateOfBirth);
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;
        this.patients = new ArrayList<Patient>();
        this.pastPatients = new ArrayList<Patient>();
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.treatments = new ArrayList<Treatment>();
        this.pastTreatments = new ArrayList<Treatment>();
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

    public void setThreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }

    public void setPastThreatments(List<Treatment> pastTreatments) {
        this.pastTreatments = pastTreatments;
    }

}
