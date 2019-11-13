package io.turntabl;

import java.awt.print.Book;
import java.sql.*;

public class DAOImplementation implements DAOBooks {

    private static DAOBooks DBConstants;

   /* @Override
    public void addBook(Books book) throws SQLException {

    }*/

    @Override
    public void addBook(Books book) throws SQLException, ClassNotFoundException {

    }

    @Override
    public Books getBookByTitle(String title) {
        return null;
    }

    @Override
    public void deleteBook(String title) {

    }

    @Override
    public void updateBook(Books book) {

    }

    public static void addBooks (Books book) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql:northwind";

        String username = "patricia-agyekum";
        String password = "turntabl";


        Connection bdb = DriverManager.getConnection(url, username, password);

        PreparedStatement pps = bdb.prepareStatement(
                String.valueOf(new Books("Mary", "Martha")));
        try {

            pps.setString(1, book.getTitle());
            pps.setString(2, book.getAuthor());

            int rows = pps.executeUpdate();
            if (rows != 1){
                throw new SQLException("Unexpected error");
            }

        }catch(SQLException sqle){
            System.err.println("Connection err: " + sqle);
        }





            /*PreparedStatement ppps = bdb.prepareStatement(
                "select * from products where product_name like ?"
        );
        ppps.clearParameters();
        ppps.setString(1, "Chang");
        //ps.setString(2, "Beverage");
        ResultSet pprs = ppps.executeQuery();




            pps.clearParameters();
            pps.setString(1, "Beverage");
            //ps.setString(2, "Beverage");
            ResultSet prs = pps.executeQuery();

            while (prs.next()) {
                System.out.println(prs.getString("category_name"));
                System.out.println(prs.getString("category_id"));
            }

            PreparedStatement ppps = bdb.prepareStatement(
                    "select * from products where product_name like ?"
            );
            ppps.clearParameters();
            ppps.setString(1, "Chang");
            //ps.setString(2, "Beverage");
            ResultSet pprs = ppps.executeQuery();

        } catch (SQLException sqle) {
            System.err.println("Connection err: " + sqle);
        }*/




        // Connection c =

    }

}
