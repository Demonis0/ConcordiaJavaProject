package fr.demonis.javaproject;

import fr.demonis.javaproject.Entities.Doctor;
import fr.demonis.javaproject.Entities.Patient;
import fr.demonis.javaproject.Ui.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class Main { 

    public static List <Patient> storage1 = new ArrayList<Patient>();
    public static List <Doctor> storage2 = new ArrayList<Doctor>();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new MainMenu();

    }
}