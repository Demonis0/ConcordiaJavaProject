package fr.demonis.javaproject.utils;

import fr.demonis.javaproject.entities.Patient;

import java.io.*;

public class FileConfiguration {

    public static void serializeDataOut(Patient ish)throws IOException {
        String fileName= "datas\\config.txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ish);
        oos.close();
        fos.close();
    }

    public static Patient serializeDataIn(){
        String fileName= "datas\\config.txt";
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fin);
            Patient iHandler= (Patient) ois.readObject();
            ois.close();
            return iHandler;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
