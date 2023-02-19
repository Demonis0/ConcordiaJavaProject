package fr.demonis.javaproject.entities;

import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.utils.Specialities;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Doctor extends Person implements Serializable {

    String dateOfEmployment;
    Specialities speciality;
    List<Integer> patients,pastPatients;
    List<Integer> futureAppointments,pastAppointments;
    List<Integer> treatments, pastTreatments;

    public Doctor(String firstName, String lastName, String dateOfBirth, String phone, String mail, String dateOfEmployment, Specialities speciality, int id) {
        super(firstName, lastName, dateOfBirth, phone, mail, id);
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;
        this.patients = new ArrayList<Integer>();
        this.pastPatients = new ArrayList<Integer>();
        this.futureAppointments = new ArrayList<Integer>();
        this.pastAppointments = new ArrayList<Integer>();
        this.treatments = new ArrayList<Integer>();
        this.pastTreatments = new ArrayList<Integer>();
    }

    public Doctor(String firstName, String lastName, String dateOfBirth, String dateOfEmployment, Specialities speciality, int id) {
        super(firstName, lastName, dateOfBirth, id);
        this.dateOfEmployment = dateOfEmployment;
        this.speciality = speciality;
        this.patients = new ArrayList<Integer>();
        this.pastPatients = new ArrayList<Integer>();
        this.futureAppointments = new ArrayList<Integer>();
        this.pastAppointments = new ArrayList<Integer>();
        this.treatments = new ArrayList<Integer>();
        this.pastTreatments = new ArrayList<Integer>();
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

    public void setPatients(List<Integer> patients) {
        this.patients = patients;
    }

    public void setPastPatients(List<Integer> pastPatients) {
        this.pastPatients = pastPatients;
    }

    public void setFutureAppointments(List<Integer> futureAppointments) {
        this.futureAppointments = futureAppointments;
    }

    public void setPastAppointments(List<Integer> pastAppointments) {
        this.pastAppointments = pastAppointments;
    }

    public void setTreatments(List<Integer> treatments) {
        this.treatments = treatments;
    }

    public void setPastTreatments(List<Integer> pastTreatments) {
        this.pastTreatments = pastTreatments;
    }

    public List<Integer> getPatients() {
        return patients;
    }

    public List<Integer> getPastPatients() {
        return pastPatients;
    }

    public List<Integer> getFutureAppointments() {
        return futureAppointments;
    }

    public List<Integer> getPastAppointments() {
        return pastAppointments;
    }

    public List<Integer> getTreatments() {
        return treatments;
    }

    public List<Integer> getPastTreatments() {
        return pastTreatments;
    }

    /*
    public JSONObject toJSONObject() {
        JSONObject jo = new JSONObject();

        jo.put("id", this.id);
        jo.put("firstName", this.FirstName);
        jo.put("lastName", this.LastName);
        jo.put("dateOfBirth", this.dateOfBirth);
        jo.put("phone", this.phone);
        jo.put("mail", this.mail);
        jo.put("dateOfEmployment", this.dateOfEmployment);
        jo.put("speciality", this.speciality);

        jo.put("futureAppointments", this.futureAppointments);
        jo.put("pastAppointments", this.pastAppointments);

        jo.put("futureTreatment", this.treatments);
        jo.put("pastTreatment", this.pastTreatments);

        jo.put("patients", this.patients);
        jo.put("pastPatients", this.pastPatients);

        return jo;
    }


    public static Doctor fromJSONObject(JSONObject jo) {
        Doctor doctor = new Doctor(jo.getString("firstName"), jo.getString("lastName"), jo.getString("dateOfBirth"), jo.getString("dateOfEmployment"), Specialities.valueOf(jo.getString("speciality")));
        doctor.setMail(jo.getString("mail"));
        doctor.setPhone(jo.getString("phone"));


        JSONArray ar = jo.getJSONArray("futureAppointments");
        List<Integer> m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        doctor.setFutureAppointments(m);

        ar = jo.getJSONArray("pastAppointments");
        m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        doctor.setPastAppointments(m);

        ar = jo.getJSONArray("pastTreatments");
        m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        doctor.setPastTreatments(m);

        ar = jo.getJSONArray("futureTreatments");
        m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        doctor.setTreatments(m);

        ar = jo.getJSONArray("pastPatients");
        m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        doctor.setPastPatients(m);

        ar = jo.getJSONArray("patients");
        m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        doctor.setPatients(m);


        return doctor;
    }
    */

}
