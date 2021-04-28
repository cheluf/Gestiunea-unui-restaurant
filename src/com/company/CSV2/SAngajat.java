package com.company.CSV2;

import com.company.audit;
import java.io.FileWriter;
import java.io.IOException;

public class SAngajat {
    private final static String locatie = "src/com/company/CSV/angajat.csv";

    public static void SAngajat(String Nume, String Prenume, String Data) {
        FileWriter fileWriter;
        audit.saudit("Scriere angajat");
        try {
            fileWriter = new FileWriter((locatie), true);
            String stringBuilder = Nume + "," + Prenume + "," + Data + "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
