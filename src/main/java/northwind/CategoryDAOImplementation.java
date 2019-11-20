package northwind;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImplementation implements CategoryDAO {

    List<ProductTO> popularProducts = new ArrayList<>();

    @Override
    public List<ProductTO> getProductsByCategory(String name) {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql:northwind";

            try{
                Connection connection = DriverManager.getConnection(url,"sammyK","turntabl");
                PreparedStatement query = connection.prepareStatement(
                        "select products.product_name,products.unit_price, count(order_details.product_id) from order_details inner join products on order_details.product_id = products.product_id group by products.product_name, products.unit_price limit 5"
                );
                query.clearParameters();

                ResultSet rs = query.executeQuery();
//                while(rs.next()){
//                    ProductTo productTo = new ProductTo(rs.getString("product_name"),rs.getInt("unit_price"));
//                    productTos.add(productTo);
//                }

            }catch (SQLException sqle){
                System.out.println("Connection err: " + sqle);
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return popularProducts;
    }

    /*@Override
    public List<SaleTo> getSalesByCategory(String name) {
        return null;
    }*/
}
