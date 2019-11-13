package io.turntabl;

import java.sql.*;

public class JavaEntry {
    public static void main (String args[]) throws ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        //build the connectionstring
        String url = "jdbc:postgresql:northwind";


        String username = "patricia-agyekum";
        String password = "turntabl";
        try(Connection db = DriverManager.getConnection(url, username, password)){
            Statement s = db.createStatement();
            ResultSet rs = s.executeQuery("select customer_id from customers");
            while (rs.next()) {
                System.out.println(rs.getString("customer_id"));
                /*System.out.println(rs.getString("company_name"));
                System.out.println(rs.getString("contact_name"));
                System.out.println(rs.getString("contact_title"));
                System.out.println(rs.getString("address"));
                System.out.println(rs.getString("city"));
                System.out.println(rs.getString("region"));
                System.out.println(rs.getString("postal_code"));
                System.out.println(rs.getString("country"));
                System.out.println(rs.getString("phone"));
                System.out.println(rs.getString("fax"));*/

            }

        }catch(SQLException sqle){
            System.err.println("Connection err: " + sqle);
        }



    }


}
