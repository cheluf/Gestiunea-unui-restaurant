package com.company;
import java.util.HashMap;
import java.util.Map;

public class Salariu implements SalariuService {
    private HashMap<String, Double>dictionar=new HashMap();

    public Salariu(String Nume, double salariu) {
        dictionar.put(Nume,salariu);
    }
    @Override
    public void print(){
        audit.saudit("Print salariu");
        for( Map.Entry<String, Double> entry : dictionar.entrySet() ){
            System.out.print(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }
    }

    @Override
    public void marire_salariu(String nume, double valoare){
        audit.saudit("Marire salariu");
        double valoareCont;
        valoareCont=dictionar.get(nume).doubleValue();
        dictionar.put(nume,valoareCont + valoare);
        System.out.println("Noul salariu al lui " + nume + " este de " + dictionar.get(nume) );
    }
    }

