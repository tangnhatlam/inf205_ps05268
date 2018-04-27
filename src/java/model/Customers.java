/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Customers {

    public Customers() {
    }

    public List<Customer> showProduct(String ten) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "select * from Customers";
            if (ten.length() > 0) {
                sql += " where Hoten like '%" + ten + "%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<Customer> list = new ArrayList<Customer>();
            while (rs.next()) {
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String lastname = rs.getString("Hoten");
                Boolean gioitinh = rs.getBoolean("Gioitinh");
                String email = rs.getString("Email");
                Boolean role = rs.getBoolean("Role");
                Customer sp = new Customer(username, password, lastname, gioitinh, email, role);
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean checkLogin(String username, String password) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "select * from Customers where Username = ? and Password = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            boolean exist = false;
            exist = rs.next();
            rs.close();
            stm.close();
            con.close();
            if (exist) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkLoginIdmin(String username, String password) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "select * from Customers where Username = ? and Password = ? and Role = 1";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            boolean exist = false;
            exist = rs.next();
            rs.close();
            stm.close();
            con.close();
            if (exist) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insert(String username, String password, String lastname, boolean gioitinh, String email, boolean role) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "insert into Customers values(?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, lastname);
            stm.setBoolean(4, gioitinh);
            stm.setString(5, email);
            stm.setBoolean(6, role);
            int result = stm.executeUpdate();
            stm.close();
            con.close();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void updateCustomer(String username, String password, String lastname, boolean gioitinh, String email, boolean role) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "Update Customers set Password = ?, Hoten = ?, Gioitinh = ?,Email = ?,Role =?"
                    + " where username = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, password);
            stm.setString(2, lastname);
            stm.setBoolean(3, gioitinh);
            stm.setString(4, email);
            stm.setBoolean(5, role);
            stm.setString(6, username);
            stm.executeUpdate();
            stm.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(String username)
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "delete from Customers where Username = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
