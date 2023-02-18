package fr.demonis.javaproject.entities;
import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.utils.Specialities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Patient extends Person{
    String insuranceCarrier,exployer;
    List<Appointment> futureAppointments,pastAppointments;
    List<Treatment> treatments, pastTreatments;
    HashMap<Specialities, Doctor> doctors;

    public Patient(String firstName, String lastName, String dateOfBirth, String phone, String mail, String insuranceCarrier, String exployer) {
        super(firstName, lastName, dateOfBirth, phone, mail);
        this.insuranceCarrier = insuranceCarrier;
        this.exployer = exployer;
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.doctors = new HashMap<Specialities, Doctor>();
        this.treatments = new ArrayList<Treatment>();
        this.pastTreatments = new ArrayList<Treatment>();
    }

    public Patient(String firstName, String lastName, String dateOfBirth, String insuranceCarrier, String exployer) {
        super(firstName, lastName, dateOfBirth);
        this.insuranceCarrier = insuranceCarrier;
        this.exployer = exployer;
        this.futureAppointments = new ArrayList<Appointment>();
        this.pastAppointments = new ArrayList<Appointment>();
        this.doctors = new HashMap<Specialities, Doctor>();
        this.treatments = new ArrayList<Treatment>();
        this.pastTreatments = new ArrayList<Treatment>();
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

    public void setThreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }

    public void setPastThreatments(List<Treatment> pastTreatments) {
        this.pastTreatments = pastTreatments;
    }

}
