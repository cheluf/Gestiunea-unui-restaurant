package com.company;

public class Ajutor_ospatar extends Ospatar{
    private Ospatar nume_ospatar;

    public Ajutor_ospatar(String nume, String prenume, String data_angajarii, String[] ture, Ospatar nume1) {
        super(nume, prenume, data_angajarii, ture);
        this.nume_ospatar = nume1;
    }

    public void print(){
        System.out.println("Nume si prenume :" + nume + " " + prenume);
        System.out.println("Data angajarii: " + data_angajarii);
        for(int i = 0 ; i < ture.length; i++){
            System.out.println("Tura lucrata: " + ture[i]);
        }
        System.out.println("Apartine de ospatarul: " + nume_ospatar.getNume());
    }
}
