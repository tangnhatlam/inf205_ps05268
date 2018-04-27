/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.rmi.Naming.list;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Products {

    public Products() {
    }

    public List<Product> showProduct(String tensp) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "select * from Products";
            if (tensp.length() > 0) {
                sql += " where Name like '%" + tensp + "%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<Product> list = new ArrayList<Product>();
            while (rs.next()) {
                String code = rs.getString("Code");
                String name = rs.getString("Name");
                int price = rs.getInt("Price");
                String image = rs.getString("Image");
                Product sp = new Product(code, name, price, image);
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete(String masp) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "delete from Products where Code = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, masp);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(String masp, String tensp, int gia, String image) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "Insert into Products values(?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, masp);
            stm.setString(2, tensp);
            stm.setInt(3, gia);
            stm.setString(4, image);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void upload(String masp, String tensp, int gia, String img) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
            Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
            String sql = "Update Products set Name=?, Price=?,Image=? where Code=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tensp);
            stm.setInt(2, gia);
            stm.setString(3, img);
            stm.setString(4, masp);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Product> getShop(int a, int b) throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
        Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
        ArrayList<Product> list = new ArrayList();
        String sql = "select * \n"
                + "from(\n"
                + "	select *, ROW_NUMBER() OVER (ORDER BY Code) as RowsNum\n"
                + "	from dbo.Products\n"
                + "	) as MyData where MyData.RowsNum between ? and ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, a);
        stmt.setInt(2, b);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            String code = rs.getString("Code");
            String name = rs.getString("Name");
            int price = rs.getInt("Price");
            String image = rs.getString("Image");
            Product sp = new Product(code, name, price, image);
            list.add(sp);
        }
        return list;
    }

    public int getCount() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://hieuhayhovn.database.windows.net:1433;database=Java5";
        Connection con = DriverManager.getConnection(url, "hieuhayho@hieuhayhovn", "Hieu1234");
        String sql = "SELECT count(Code) FROM Products";
        int count = 0;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
