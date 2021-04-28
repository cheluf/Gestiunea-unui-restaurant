package com.company;

public class Comanda implements ComandaService {
    private int nr_masa;
    private com.company.Meniu[] Prod_comandate;

    public Comanda(int nr_masa, Meniu[] prod_comandate) {
        audit.saudit("Comanda");
        this.nr_masa = nr_masa;
        Prod_comandate = prod_comandate;
    }

    public Meniu[] getProd_comandate() {
        return Prod_comandate;
    }

    @Override
    public void print() {
        System.out.print("Numar masa: " + nr_masa);
        System.out.print("\n|||||||||||||||");
        for (int i = 0; i < Prod_comandate.length; i++) {
            System.out.print("\nNume produs:" +Prod_comandate[i].getNumep() + "\nPret: " + Prod_comandate[i].getPret());
        }
    }

    @Override
    public void nota_de_plata(){
        System.out.print("Numar masa: " + nr_masa);
        System.out.print("\n|||||||||||||||");
        for (int i = 0; i < Prod_comandate.length; i++) {
            System.out.print("\nNume produs: " +Prod_comandate[i].getNumep() + "\nPret: " + Prod_comandate[i].getPret());
        }
        float suma = 0;
        for(int i = 0 ; i < Prod_comandate.length;i++){
            suma = suma + Prod_comandate[i].getPret();
        }
        System.out.println("\nSuma totala : " + suma);
        System.out.println("|||||||||||||||");
    }
}

