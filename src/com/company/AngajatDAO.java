package com.company;

import com.company.Angajat;
import com.company.Dbcon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AngajatDAO{

    static Connection con = Dbcon.getConnection();
    public int add(Angajat ang)
            throws SQLException
    {
        String query = "insert into Angajat(nume, prenume,data_angajarii) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ang.getNume());
        ps.setString(2, ang.getPrenume());
        ps.setString(3, ang.getData_angajarii());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(String nume)
            throws SQLException
    {
        String query = "delete from Angajat where nume = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nume);
        ps.executeUpdate();
    }

    public static Angajat getAngajat(String nume)
            throws SQLException
    {

        String query = "select * from Angajat where nume = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, nume);
        Angajat ang = new Angajat(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            ang.setNume(rs.getString("Nume"));
            ang.setPrenume(rs.getString("Prenume"));
            ang.setData_angajarii(rs.getString("Data_Angajarii"));
        }

        if (check == true) {
            return ang;
        }
        else
            return null;
    }

    public void update(Angajat ang)
            throws SQLException
    {

        String query = "update Angajat set data_angajarii = ? where nume = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ang.getData_angajarii());
        ps.setString(2, ang.getNume());
        ps.executeUpdate();
    }
}

