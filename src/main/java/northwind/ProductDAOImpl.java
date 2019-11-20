package northwind;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductDAOImpl implements ProductDAO {

    List<ProductTO> popularProducts = new ArrayList<>();

    @Override
    public List<ProductTO> getMostPopularProducts() {
            try {
                Class.forName("org.postgresql.Driver");
                String url = "jdbc:postgresql:northwind";

                try{
                    Connection connect = DriverManager.getConnection(url,"sammyK","turntabl");
                    PreparedStatement query = connect.prepareStatement(
                            "select products.product_name,products.unit_price, count(order_details.product_id) from order_details inner join products on order_details.product_id = products.product_id group by products.product_name, products.unit_price limit 5"
                    );
                    query.clearParameters();
                    ResultSet rs = query.executeQuery();
                while(rs.next()){
                    ProductTO productTO = new ProductTO(rs.getString("product_name"),rs.getInt("unit_price"));
                    popularProducts.add(productTO);
                }

                }catch (SQLException sqle){
                    System.out.println("Connection err: " + sqle);
                }

            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        return popularProducts;
    }

    }
   /* @Override
    public void  viewProducts() {

        String url = "jdbc:postgresql:northwind";
        try(Connection database = DriverManager.getConnection(url, "patricia-agyekum",  "turntabl")){
            PreparedStatement prep = database.prepareStatement("select count(order_details.product_id) as count, products.product_name from products inner join order_details on products.product_id = order_details.product_id group by products.product_name order by count desc limit 5");
            prep.clearParameters();
            ResultSet results = prep.executeQuery();
            while (results.next()) {
                System.out.print(results.getString("product_name"));
                System.out.println();

            }



        }catch(SQLException sqlE){
            System.err.println("Connection error: " + sqlE);
        }*/

    //}


