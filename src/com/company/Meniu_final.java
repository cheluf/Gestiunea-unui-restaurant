package com.company;

import java.util.Scanner;

public class Meniu_final {
    String Nume_produs;
    double gramaj;
    double pret;

    public Meniu_final(String nume_produs, double gramaj, double pret) {
        Nume_produs = nume_produs;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public Meniu_final() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nume_produs: ");
        this.Nume_produs = in.nextLine();
        System.out.println("Gramaj:");
        this.gramaj = in.nextDouble();
        System.out.println("Pret:");
        this.pret = in.nextDouble();}

        public Meniu_final(int x) {}

    public String getNume_produs() {
        return Nume_produs;
    }

    public double getGramaj() {
        return gramaj;
    }

    public double getPret() {
        return pret;
    }

    public void setNume_produs(String nume_produs) {
        Nume_produs = nume_produs;
    }

    public void setGramaj(double gramaj) {
        this.gramaj = gramaj;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
