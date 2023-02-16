package fr.demonis.javaproject.entities;

import fr.demonis.javaproject.objects.Appointment;
import fr.demonis.javaproject.objects.Treatment;
import fr.demonis.javaproject.utils.Specialities;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Patient extends Person{

    String insuranceCarrier,employer;
    List<Integer> futureAppointments,pastAppointments;
    List<Integer> treatments, pastTreatments;
    HashMap<Specialities, Integer> doctors;

    public Patient(String firstName, String lastName, String dateOfBirth, String phone, String mail, String insuranceCarrier, String exployer) {
        super(firstName, lastName, dateOfBirth, phone, mail);
        this.insuranceCarrier = insuranceCarrier;
        this.employer = exployer;
        this.futureAppointments = new ArrayList<Integer>();
        this.pastAppointments = new ArrayList<Integer>();
        this.doctors = new HashMap<Specialities, Integer>();
        this.treatments = new ArrayList<Integer>();
        this.pastTreatments = new ArrayList<Integer>();
    }

    public Patient(String firstName, String lastName, String dateOfBirth, String insuranceCarrier, String exployer) {
        super(firstName, lastName, dateOfBirth);
        this.insuranceCarrier = insuranceCarrier;
        this.employer = exployer;
        this.futureAppointments = new ArrayList<Integer>();
        this.pastAppointments = new ArrayList<Integer>();
        this.doctors = new HashMap<Specialities, Integer>();
        this.treatments = new ArrayList<Integer>();
        this.pastTreatments = new ArrayList<Integer>();
    }

    public String getInsuranceCarrier() {
        return insuranceCarrier;
    }

    public void setInsuranceCarrier(String insuranceCarrier) {
        this.insuranceCarrier = insuranceCarrier;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void setDoctors(HashMap<Specialities, Integer> hm) {
        this.doctors = hm;
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

    public void setPastThreatments(List<Integer> pastTreatments) {
        this.pastTreatments = pastTreatments;
    }

    public JSONObject toJSONObject() {
        JSONObject jo = new JSONObject();

        jo.put("id", this.id);
        jo.put("firstName", this.FirstName);
        jo.put("lastName", this.LastName);
        jo.put("dateOfBirth", this.dateOfBirth);
        jo.put("phone", this.phone);
        jo.put("mail", this.mail);
        jo.put("insuranceCarrier", this.insuranceCarrier);
        jo.put("employer", this.employer);

        jo.put("futureAppointments", this.futureAppointments);
        jo.put("pastAppointments", this.pastAppointments);

        jo.put("futureTreatment", this.treatments);
        jo.put("pastTreatment", this.pastTreatments);

        List<String> li = new ArrayList<String>();
        for (Specialities sp : this.doctors.keySet()) {
            li.add(sp.toString() + ":" + this.doctors.get(sp));
        }
        jo.put("doctors", li);

        return jo;
    }

    public static Patient fromJSONObject(JSONObject jo) {
        Patient patient = new Patient(jo.getString("firstName"), jo.getString("lastName"), jo.getString("dateOfBirth"), jo.getString("insuranceCarrier"), jo.getString("employer"));
        patient.setMail(jo.getString("mail"));
        patient.setPhone(jo.getString("phone"));


        JSONArray ar = jo.getJSONArray("futureAppointments");
        List<Integer> m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        patient.setFutureAppointments(m);

        ar = jo.getJSONArray("pastAppointments");
        m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        patient.setPastAppointments(m);

        ar = jo.getJSONArray("pastTreatments");
        m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        patient.setPastThreatments(m);

        ar = jo.getJSONArray("futureTreatments");
        m = new ArrayList<Integer>();
        for (int q = 0; q < ar.length(); q++) {
            m.add(ar.getInt(q));
        }
        patient.setTreatments(m);

        ar = jo.getJSONArray("doctors");
        HashMap<Specialities, Integer> hm = new HashMap<>();
        for (int q = 0; q < ar.length(); q++) {
            String[] k = ar.getString(q).split(":");
            hm.put(Specialities.valueOf(k[0]), Integer.valueOf(k[1]));
        }
        patient.setDoctors(hm);


        return patient;
    }
}
