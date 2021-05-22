package com.company;

import java.util.Scanner;

public class Angajat {
    protected String nume;
    protected String prenume;
    protected String data_angajarii;

    public Angajat(String nume, String prenume, String data_angajarii) {
        this.nume = nume;
        this.prenume = prenume;
        this.data_angajarii = data_angajarii;
    }

    public Angajat(int x){}
    public Angajat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Numele angajatului: ");
        this.nume = in.nextLine();
        System.out.println("Prenume:");
        this.prenume = in.nextLine();
        System.out.println("Data angajarii:");
        this.data_angajarii = in.nextLine();
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getData_angajarii() {
        return data_angajarii;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setData_angajarii(String data_angajarii) {
        this.data_angajarii = data_angajarii;
    }
}
