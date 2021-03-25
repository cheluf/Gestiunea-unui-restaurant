package com.company;

public class Main {
    public static void main(String[] args) {

        Ingrediente ceapa = new Ingrediente("Ceapa",200);
        Ingrediente varza = new Ingrediente("Varza",300);
        Ingrediente bors = new Ingrediente("Bors",250);
        Produse VarzaAlaCluj = new Produse(1,"Varza Ala Cluj",new Ingrediente[]{ceapa, varza, bors});
        Meniu MeniuVarza = new Meniu(1,"VarzaAlaCluj",new Ingrediente[]{ceapa, varza, bors}, (float) 20.5);
        Comanda Masa1 = new Comanda(1,new Meniu[]{MeniuVarza});
        Salariu Ion = new Salariu("Ion",200);
        Ospatar Marian = new Ospatar("Marian","Popescu","01-02-99",new String[]{"luni","marti"});
        Ajutor_ospatar Fabian =  new Ajutor_ospatar("Chelu","Fabian","03-01-2004",new String[]{"marti","miercuri"},Marian);
        //VarzaAlaCluj.print();
        //varza.print();
        //MeniuVarza.print();
        //Masa1.print();
        //Ion.print();
        //Ion.marire_salariu("Ion",400);
        //Fabian.print();
        //Marian.print();


    }

}
