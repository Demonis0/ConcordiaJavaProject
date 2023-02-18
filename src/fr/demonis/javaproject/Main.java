package fr.demonis.javaproject;

import fr.demonis.javaproject.entities.Doctor;
import fr.demonis.javaproject.entities.Patient;
import fr.demonis.javaproject.ui.MainMenu;

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