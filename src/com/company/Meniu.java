package com.company;

public class Meniu extends Produse{
    protected float pret;

    public Meniu(int idProdus, String nume_produs, com.company.Ingrediente[] ingrediente, float pret) {
        super(idProdus, nume_produs, ingrediente);
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    public void print(){
        System.out.println("Numele produslui: "+ this.nume_produs + "\nidProdus: " + this.idProdus + "\nIngrediente: ");
        for(int i=0; i < getIngrediente().length; i++){
            System.out.println(Ingrediente[i].getNume());
        }
        System.out.print("Pret: " + pret);
    }
    }

