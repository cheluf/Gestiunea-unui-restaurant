package com.company;

public class Angajat {
    protected String nume;
    protected String prenume;
    protected String data_angajarii;

    public Angajat(String nume, String prenume, String data_angajarii) {
        this.nume = nume;
        this.prenume = prenume;
        this.data_angajarii = data_angajarii;
    }

    public String getNume() {
        return nume;
    }
}
