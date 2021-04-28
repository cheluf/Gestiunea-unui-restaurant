package com.company.CSV2;

import com.company.Ingrediente;
import com.company.audit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CIngrediente {
    private final static String locatie = "src/com/company/CSV/ingrediente.csv";
    public static void CIngrediente(ArrayList<Ingrediente> items) {
        audit.saudit("Citire ingredient");
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(locatie));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Ingrediente(strings[0], Integer.parseInt(strings[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}