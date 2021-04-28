package com.company.CSV2;

import com.company.audit;
import java.io.FileWriter;
import java.io.IOException;

public class SMeniu {
    private final static String locatie = "src/com/company/CSV/meniu.csv";

    public static void SMeniu(String Nume, double gramaj, double pret) {
        FileWriter fileWriter;
        audit.saudit("Scriere meniu");
        try {
            fileWriter = new FileWriter((locatie), true);
            String stringBuilder = Nume + "," + gramaj + "," + pret + "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}