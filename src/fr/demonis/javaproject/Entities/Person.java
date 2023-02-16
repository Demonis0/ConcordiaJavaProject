package fr.demonis.javaproject.Entities;

public class Person {

    String FirstName, LastName, dateOfBirth, phone, mail;
    int id;
    static int totalId = 0;

    public Person(String firstName, String lastName, String dateOfBirth, String phone, String mail) {
        FirstName = firstName;
        LastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.mail = mail;
        this.id = totalId;
        totalId++;
    }

    public Person(String firstName, String lastName, String dateOfBirth) {
        FirstName = firstName;
        LastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.id = totalId;
        totalId++;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
