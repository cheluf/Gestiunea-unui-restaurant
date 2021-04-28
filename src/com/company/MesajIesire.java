package com.company;

public class MesajIesire {   // singleton class

    private static MesajIesire instance = new MesajIesire();
    private MesajIesire(){}
    public static MesajIesire getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("La revedere! Multumim pentru prezenta dvs.!");
    }
}
