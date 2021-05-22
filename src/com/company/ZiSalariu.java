package com.company;

import java.util.Scanner;

public class ZiSalariu {
    private String data_salariu;
    private String nume_angajat;

    public ZiSalariu(int x) {}

    public ZiSalariu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Data_salariu: ");
        this.data_salariu = in.nextLine();
        System.out.println("Nume_angajat:");
        this.nume_angajat= in.nextLine();
    }

    public String getData_salariu() {
        return data_salariu;
    }

    public String getNume_angajat() {
        return nume_angajat;
    }

    public void setData_salariu(String data_salariu) {
        this.data_salariu = data_salariu;
    }

    public void setNume_angajat(String nume_angajat) {
        this.nume_angajat = nume_angajat;
    }
}
