package com.company.CSV2;

import com.company.audit;
import java.io.FileWriter;
import java.io.IOException;

public class SIngrediente {
    private final static String locatie = "src/com/company/CSV/ingrediente.csv";

    public static void SIngrediente(String Nume, int gramaj) {
        audit.saudit("Scriere Ingredient");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((locatie), true);

            String stringBuilder = Nume + "," + gramaj + "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
