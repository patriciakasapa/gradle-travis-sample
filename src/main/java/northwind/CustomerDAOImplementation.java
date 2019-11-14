package northwind;

import java.sql.*;

public class CustomerDAOImplementation implements CustomerDAO {
    List<ProductTO> allProductsOrdered = new ArrayList<>();
    @Override
    public showProductNames(String names){
    //build the connectionstring
        String url = "jdbc:postgresql:northwind";


        String username = "patricia-agyekum";
        String password = "turntabl";
        try (Connection conProd = DriverManager.getConnection(url, username, password)) {
            PreparedStatement prepProd = conProd.prepareStatement(
                "select products.product_name, products.unit_price from products inner join order_details on products.product_id = order_details.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where customers.contact_name like ?"
            );
            
            prepProd.clearParameters();
            prepProd.setString(1, name + '%');
    
            ResultSet results = prepProd.executeQuery();

            while (results.next()) {
                
                ProductTO products = new ProductTO;
                (results.getString("product_name"));
                (results.getString("unit_price"));
                allProductsOrdered.add(products);
            }
            
            for (ProductTO product : products){
                System.out.println(products);
            }
        
        }catch (SQLException sqle) {
            System.err.println("Connection err: " + sqle);
    
    }
   /* @Override
    public AllCustomersTO getCustomersNames() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        //build the connectionstring
        String url = "jdbc:postgresql:northwind";


        String username = "patricia-agyekum";
        String password = "turntabl";
        try (Connection db = DriverManager.getConnection(url, username, password)) {
            //Statement s = db.createStatement();

            PreparedStatement ps = db.prepareStatement(
                    "select product_name from products inner join order_details on products.product_id = order_details.product_id inner join orders on orders.order_id = order_details.order_id inner join customers on orders.customer_id = customers.customer_id"
                    "select * from categories where category_name like ?"
            );
            ps.clearParameters();
            ps.setString(1, "Beverage");
            //ps.setString(2, "Beverage");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("category_name"));
                System.out.println(rs.getString("category_id"));
            }


        } catch (SQLException sqle) {
            System.err.println("Connection err: " + sqle);


    @Override
    public void showPrices() {

    }*/
        }
        return null;
    }
}
