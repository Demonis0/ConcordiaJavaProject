package fr.demonis.javaproject.entities;

import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.utils.Specialities;

import java.util.List;

public class Doctor extends Person{

    String dateOfEmployment;
    Specialities speciality;
    List<Patient> patients;
    List<Appointment> futureAppointments,pastAppointments;

    public Doctor(String firstName, String lastName, String dateOfBirth, String phone, String mail, String dateOfEmployment, Specialities speciality) {
        super(firstName, lastName, dateOfBirth, phone, mail);
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;

    }

    public Doctor(String firstName, String lastName, String dateOfBirth, String dateOfEmployment, Specialities speciality) {
        super(firstName, lastName, dateOfBirth);
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;
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
}
