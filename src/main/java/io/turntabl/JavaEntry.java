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
            ResultSet rs = s.executeQuery("select * from customers");
            System.out.println("*********************************************************************************************");
            System.out.printf("%25s %35s %25s %35s ", "Customer Id", "Company Name", "Contact Name", "contact_title");
            System.out.println("\n********************************************************************************************************");

            while (rs.next()) {
                System.out.format("%25s %35s %25s %35s %25s %35s %25s %35s",
                        rs.getString("customer_id"),
                        rs.getString("company_name"),
                        rs.getString("contact_name"),
                        rs.getString("contact_title"),
                        rs.getString("city"),
                        rs.getString("region"),
                        rs.getString("postal_code"),
                        rs.getString("country"),
                        rs.getString("phone"),
                        rs.getString("fax")

                );
                System.out.println();
            }
        }catch(SQLException sqle){
            System.err.println("Connection err: " + sqle);
        }



    }


}
