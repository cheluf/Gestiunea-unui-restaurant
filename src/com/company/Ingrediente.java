package com.company;

import java.util.Scanner;

public class Ingrediente
{
    protected String nume_ingredient;
    protected int gramaj;

    public Ingrediente(int x) {}
    public Ingrediente() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nume ingredient: ");
        this.nume_ingredient = in.nextLine();
        System.out.println("Gramaj:");
        this.gramaj = in.nextInt();
    }
    public Ingrediente(String ingredient, int gramajul){
        this.nume_ingredient=ingredient;
        this.gramaj=gramajul;
    }

    public void setNume_ingredient(String nume_ingredient) {
        this.nume_ingredient = nume_ingredient;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public String getNume_ingredient() {
        return nume_ingredient;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void print()
    {
        System.out.println("Nume ingredient: " + nume_ingredient + "\nGramaj: " + gramaj);
    }

}
