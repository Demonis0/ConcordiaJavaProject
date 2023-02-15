package fr.demonis.javaproject;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        JSONObject jo = new JSONObject();
        jo.put("Last Name", "JACQUES");
        jo.put("First Name", "Matthieu");
        jo.put("Date of birth", "14/02/2002");
        File file = new File("datas\\config.txt");
        try {
            Files.writeString(file.toPath(), jo.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file2 = new File("datas\\config.txt");
        List<String> lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(file2.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JSONObject jo2 = new JSONObject(lines.get(0));
        System.out.println(jo2.toString());
        System.out.println(jo2.get("Last Name"));
        System.out.println(jo2.get("First Name"));
        System.out.println(jo2.get("Date of birth"));
    }


}
