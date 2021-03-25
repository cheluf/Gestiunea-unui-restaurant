package com.company;

public class Ospatar extends Angajat {
    protected String[] ture;

    public Ospatar(String nume, String prenume, String data_angajarii, String[] ture) {
        super(nume, prenume, data_angajarii);
        this.ture = ture;
    }

    public void print(){
        System.out.println("Nume si prenume :" + nume + " " + prenume);
        System.out.println("Data angajarii: " + data_angajarii);
        for(int i = 0 ; i < ture.length; i++){
            System.out.println("Tura lucrata: " + ture[i]);
        }
    }
}
