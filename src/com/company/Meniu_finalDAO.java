package com.company;
import com.company.Dbcon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Meniu_finalDAO{

    static Connection con = Dbcon.getConnection();
    public int add(Meniu_final mf) throws SQLException
    {
        String query = "insert into Meniu_final(nume_produs,gramajul,pret) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, mf.getNume_produs());
        ps.setDouble(2, mf.getGramaj());
        ps.setDouble(3, mf.getPret());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(String nume_produs) throws SQLException
    {
        String query = "delete from Meniu_final where nume_produs = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nume_produs);
        ps.executeUpdate();
    }

    public static Meniu_final getMeniu_final(String nume_produs) throws SQLException
    {

        String query = "select * from Meniu_final where nume_produs = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, nume_produs);
        Meniu_final mf = new Meniu_final(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            mf.setNume_produs(rs.getString("Nume_produs"));
            mf.setGramaj(rs.getDouble("Gramajul"));
            mf.setPret(rs.getDouble("Pret"));
        }

        if (check == true) {
            return mf;
        }
        else
            return null;
    }

    public void update(Meniu_final mf)  throws SQLException
    {

        String query = "update Meniu_final set gramajul = ? , pret = ? where nume_produs = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setDouble(1, mf.getGramaj());
        ps.setDouble(2, mf.getPret());
        ps.setString(3, mf.getNume_produs());
        ps.executeUpdate();
    }
}
