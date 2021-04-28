package com.company;

public class Meniu_final {
    String Nume_produs;
    double gramaj;
    double pret;

    public Meniu_final(String nume_produs, double gramaj, double pret) {
        Nume_produs = nume_produs;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public String getNume_produs() {
        return Nume_produs;
    }
}
