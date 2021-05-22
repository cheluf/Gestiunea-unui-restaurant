package com.company;

import com.company.Dbcon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class IngredienteDAO{

    static Connection con = Dbcon.getConnection();
    public int add(Ingrediente ing)
            throws SQLException
    {
        String query = "insert into Ingrediente(ingredient, gramajul) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ing.getNume_ingredient());
        ps.setDouble(2, ing.getGramaj());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(String nume_ingredient) throws SQLException
    {
        String query = "delete from Ingrediente where ingredient = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nume_ingredient);
        ps.executeUpdate();
    }

    public static Ingrediente getIngrediente(String ingredient) throws SQLException
    {

        String query = "select * from Ingrediente where ingredient = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, ingredient);
        Ingrediente ing = new Ingrediente(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            ing.setNume_ingredient(rs.getString("Ingredient"));
            ing.setGramaj(rs.getInt("Gramajul"));
        }

        if (check == true) {
            return ing;
        }
        else
            return null;
    }

    public void update(Ingrediente ing) throws SQLException
    {

        String query = "update Ingrediente set gramajul = ? where ingredient = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, ing.getGramaj());
        ps.setString(2,ing.getNume_ingredient() );
        ps.executeUpdate();
    }
}