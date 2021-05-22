package com.company;
import java.sql.SQLException;
import java.util.Scanner;

public class SystemCon {
    public void AddAngajat() throws SQLException {
        Angajat ang = new Angajat();
        AngajatDAO angDao = new AngajatDAO();
        angDao.add(ang);
    }
    public void DeleteAngajat() throws SQLException {
        AngajatDAO angDao = new AngajatDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numele: ");
        String x = in.nextLine();
        angDao.delete(x);
    }

    public void SelectAngajat() throws SQLException {
        AngajatDAO angDao = new AngajatDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Numele:");
        String x = in.nextLine();
        Angajat e = angDao.getAngajat(x);
        System.out.println(e.getNume() + " "
                + e.getPrenume() + " " + e.getData_angajarii());
    }

    public void UpdateAngajat() throws SQLException {
        AngajatDAO angDao = new AngajatDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Numele:");
        String x = in.nextLine();
        Angajat ang = angDao.getAngajat(x);
        System.out.println("New data_angajarii:");
        ang.setData_angajarii(in.nextLine());
        angDao.update(ang);
    }
    public void AddMeniu_final() throws SQLException {
        Meniu_final mf = new Meniu_final();
        Meniu_finalDAO mfDao = new Meniu_finalDAO();
        mfDao.add(mf);
    }

    public void DeleteMeniu_final() throws SQLException {
        Meniu_finalDAO mfDao = new Meniu_finalDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numele produsului: ");
        String x = in.nextLine();
        mfDao.delete(x);
    }

    public void SelectMeniu_final() throws SQLException {
        Meniu_finalDAO mfDao = new Meniu_finalDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume_produs:");
        String x = in.nextLine();
        Meniu_final e = mfDao.getMeniu_final(x);
        System.out.println(e.getNume_produs() + " "
                + e.getGramaj() + " " + e.getPret());
    }

    public void UpdateMeniu_final() throws SQLException {
        Meniu_finalDAO mfDao = new Meniu_finalDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume_produs:");
        String x = in.nextLine();
        Meniu_final mf = mfDao.getMeniu_final(x);
        System.out.println("New pret:");
        mf.setPret(in.nextDouble());
        mfDao.update(mf);
    }

    public void AddIngredient() throws SQLException {
        Ingrediente ing = new Ingrediente();
        IngredienteDAO ingDao = new IngredienteDAO();
        ingDao.add(ing);
    }

    public void DeleteIngrediente() throws SQLException {
        IngredienteDAO ingDao = new IngredienteDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numele ingredientului: ");
        String x = in.nextLine();
        ingDao.delete(x);
    }

    public void SelectIngrediente() throws SQLException {
        IngredienteDAO ingDao = new IngredienteDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume ingredient:");
        String x = in.nextLine();
        Ingrediente e = ingDao.getIngrediente(x);
        System.out.println(e.getNume_ingredient() + " " + e.getGramaj());
    }

    public void UpdateIngrediente() throws SQLException {
        IngredienteDAO ingDao = new IngredienteDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Ingredient:");
        String x = in.nextLine();
        Ingrediente ing = ingDao.getIngrediente(x);
        System.out.println("New gramaj:");
        ing.setGramaj(in.nextInt());
        ingDao.update(ing);
    }

    public void AddZiSalariu() throws SQLException {
        ZiSalariu zs = new ZiSalariu();
        ZiSalariuDAO zsDao = new ZiSalariuDAO();
        zsDao.add(zs);
    }

    public void DeleteZiSalariu() throws SQLException {
        ZiSalariuDAO zsDao = new ZiSalariuDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Numele angajatului: ");
        String x = in.nextLine();
        zsDao.delete(x);
    }

    public void SelectZiSalariu() throws SQLException {
        ZiSalariuDAO zsDao = new ZiSalariuDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume angajat:");
        String x = in.nextLine();
        ZiSalariu e = zsDao.getZiSalariu(x);
        System.out.println(e.getData_salariu() + " " + e.getNume_angajat());
    }
    public void UpdateZiSalariu() throws SQLException {
        ZiSalariuDAO zsDao = new ZiSalariuDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Nume angajat:");
        String x = in.nextLine();
        ZiSalariu zs = zsDao.getZiSalariu(x);
        System.out.println("New data_salariu:");
        zs.setData_salariu(in.nextLine());
        zsDao.update(zs);
    }
}
