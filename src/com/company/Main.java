package com.company;

import com.company.CSV2.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Etapa 1
        Meniu_final pizza = new Meniu_final("Pizza Italiana", 300, 120);
        Ingrediente ceapa = new Ingrediente("Ceapa", 200);
        Ingrediente varza = new Ingrediente("Varza", 300);
        Ingrediente bors = new Ingrediente("Bors", 250);
        Produse VarzaAlaCluj = new Produse(1, "Varza Ala Cluj", new Ingrediente[]{ceapa, varza, bors});
        Meniu MeniuVarza = new Meniu(1, "VarzaAlaCluj", new Ingrediente[]{ceapa, varza, bors}, (float) 20.5);
        Comanda Masa1 = new Comanda(1, new Meniu[]{MeniuVarza, MeniuVarza});
        Salariu Ion = new Salariu("Ion", 200);
        Ospatar Marian = new Ospatar("Marian", "Popescu", "01-02-99", new String[]{"luni", "marti"});
        Ajutor_ospatar Fabian = new Ajutor_ospatar("Chelu", "Fabian", "03-01-2004", new String[]{"marti", "miercuri"}, Marian);
        VarzaAlaCluj.print();
        varza.print();
        MeniuVarza.print();
        Masa1.print();
        Ion.print();
        Ion.marire_salariu("Ion", 1200);
        Fabian.print();
        Marian.print();
        Masa1.nota_de_plata();
        // Etapa 2
        MesajIesire masaintai = MesajIesire.getInstance();
        masaintai.showMessage();                                    //singleton

        ArrayList<Angajat> ang = new ArrayList<Angajat>();
        CAngajat.CAngajat(ang);
        for (int i = 0; i < ang.size(); i++) {
            System.out.println(ang.get(i).getNume());             // citire din csv + audit
        }


        SAngajat.SAngajat("Mihai", "Vaidos", "03-02-2000");        // scriere din csv + audit
        audit.saudit("Scriere Angajat");
        audit.saudit("Citire angajat");

        ArrayList<Ingrediente> ingr = new ArrayList<>();
        CIngrediente.CIngrediente(ingr);                         // citire din csv + audit
        for (int i = 0; i < ingr.size(); i++) {
            System.out.println(ingr.get(i).getNume());
        }
        SIngrediente.SIngrediente("Ceapa", 300);      //scriere in csv + audit

        SMeniu.SMeniu("Pizza Capricioasa", 420, 100);
        ArrayList<Ingrediente> items = new ArrayList<>();

        ArrayList<Meniu_final> mnu = new ArrayList<>();
        CMeniu.CMeniu(mnu);                         // citire din csv + audit
        for (int i = 0; i < items.size(); i++) {
            System.out.println(mnu.get(i).getNume_produs());
        }

    }
}

