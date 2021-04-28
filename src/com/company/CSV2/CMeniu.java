package com.company.CSV2;

import com.company.Meniu_final;
import com.company.audit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CMeniu {
    private final static String locatie = "src/com/company/CSV/meniu.csv";

    public static void CMeniu(ArrayList<Meniu_final> items) {
        audit.saudit("Citire meniu");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(locatie));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Meniu_final(strings[0], Double.parseDouble(strings[1]), Double.parseDouble(strings[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
