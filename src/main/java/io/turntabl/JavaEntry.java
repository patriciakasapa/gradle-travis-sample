package io.turntabl;

import java.sql.*;
import java.util.Scanner;

public class JavaEntry {
    private static Connection connection;

    public static void main(String[] args) throws ClassNotFoundException {


        Class.forName("org.postgresql.Driver");

        //build the connectionstring
        String url = "jdbc:postgresql:northwind";


        String username = "patricia-agyekum";
        String password = "turntabl";
        try(Connection db = DriverManager.getConnection(url, username, password)){
            //Statement s = db.createStatement();

            PreparedStatement ps = db.prepareStatement(
                    "select * from categories where category_name like ?"
            );
            ps.clearParameters();
            ps.setString(1, "Beverage");
            //ps.setString(2, "Beverage");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("category_name"));
                System.out.println(rs.getString("category_id"));
            }

            PreparedStatement pps = db.prepareStatement(
                    "select * from products where product_name like ?"
            );
            pps.clearParameters();
            pps.setString(1, "Chang");
            //ps.setString(2, "Beverage");
            ResultSet prs = pps.executeQuery();

            while (prs.next()){
                System.out.println(prs.getString("product_name"));
                System.out.println(prs.getString("product_id"));
            }

            PreparedStatement eps = db.prepareStatement(
                    "select * from employees where first_name like ?"
            );
            eps.clearParameters();
            eps.setString(1, "Margaret");
            //ps.setString(2, "Beverage");
            ResultSet ers = eps.executeQuery();

            while (ers.next()){
                System.out.println(ers.getString("first_name"));
                System.out.println(ers.getString("employee_id"));
            }
            /*ResultSet rs = s.executeQuery("select * from customers");
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
            }*/
        }catch(SQLException sqle){
            System.err.println("Connection err: " + sqle);
        }



    }


}
