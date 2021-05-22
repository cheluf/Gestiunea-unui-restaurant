package com.company;

import com.company.Dbcon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ZiSalariuDAO{

    static Connection con = Dbcon.getConnection();

    public int add(ZiSalariu zs)
            throws SQLException
    {
        String query = "insert into ZiSalariu(data_salariu, nume_angajat) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, zs.getData_salariu());
        ps.setString(2, zs.getNume_angajat());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(String nume_angajat) throws SQLException
    {
        String query = "delete from ZiSalariu where nume_angajat = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, nume_angajat);
        ps.executeUpdate();
    }

    public static ZiSalariu getZiSalariu(String nume_angajat) throws SQLException
    {

        String query = "select * from ZiSalariu where nume_angajat = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, nume_angajat);
        ZiSalariu zs = new ZiSalariu(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            zs.setData_salariu(rs.getString("data_salariu"));
            zs.setNume_angajat(rs.getString("nume_angajat"));
        }

        if (check == true) {
            return zs;
        }
        else
            return null;
    }

    public void update(ZiSalariu zs) throws SQLException
    {

        String query = "update ZiSalariu set data_salariu = ? where nume_angajat = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, zs.getData_salariu());
        ps.setString(2,zs.getNume_angajat() );
        ps.executeUpdate();
    }
}