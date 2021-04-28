package com.company.CSV2;

import com.company.Angajat;
import com.company.audit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CAngajat {

    private final static String locatie = "src/com/company/CSV/angajat.csv";

    public static void CAngajat(ArrayList<Angajat> items) {
        audit.saudit("Citire angajat");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(locatie));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Angajat(strings[0], strings[1], strings[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
