package com.company;

public class Produse{

    protected int idProdus;
    protected String nume_produs;
    protected com.company.Ingrediente[] Ingrediente;


    public Produse(int idProdus, String nume_produs, com.company.Ingrediente[] ingrediente) {
        audit.saudit("Produs");
        this.idProdus = idProdus;
        this.nume_produs = nume_produs;
        Ingrediente = ingrediente;
    }

    public String getNumep() {
        return nume_produs;
    }

    public com.company.Ingrediente[] getIngrediente() {
        return Ingrediente;
    }
    public void print(){
        audit.saudit("Print produs");
        System.out.println("Numele produslui: " + this.nume_produs + "\nidProdus: " + this.idProdus + "\nIngrediente: ");
        for(int i=0; i < getIngrediente().length; i++){
            System.out.println(Ingrediente[i].getNume());
        }
    }
}
