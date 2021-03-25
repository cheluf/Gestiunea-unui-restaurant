package com.company;

public class Ingrediente
{
    protected String nume_ingredient;
    protected int gramaj;


    public Ingrediente(String ingredient, int gramajul){
        this.nume_ingredient=ingredient;
        this.gramaj=gramajul;
    }

    public String getNume() {
        return nume_ingredient;
    }

    public void print()
    {
        System.out.println("Nume ingredient: " + nume_ingredient + "\nGramaj: " + gramaj);
    }

}
