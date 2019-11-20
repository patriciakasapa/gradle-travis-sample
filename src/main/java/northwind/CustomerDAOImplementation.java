package northwind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.tree.RowMapper;
import java.util.List;

public class CustomerDAOImplementation implements CustomerDAO {
    // List<ProductTO> allProductsOrdered = new ArrayList<>();

    @Override
    public void setJdbcTemplate(JdbcTemplate template) {
        this.jdbcTemplate = template;

    }

    @Override
    public List<CustomersTO> getCustomerNames(String name) {


        RowMapper rowMapper = (RowMapper) BeanPropertyRowMapper.newInstance(CustomersTO.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        private JdbcTemplate template = (JdbcTemplate) ctx.getBean("JdbcTemplate");
        List<CustomersTO> customers = template.queryForObject(
                "select * from customers where fname = ?",
                new Object[]{name}, rowMapper);

        // public Object mapRow (ResultSet rs,int row) throws SQLException;

    }
    return customers;

}





        //String name;
    //build the connectionstring
        //String url = "jdbc:postgresql:northwind";




        /*String username = "patricia-agyekum";
        String password = "turntabl";
        try (Connection conProd = DriverManager.getConnection(url, username, password)) {
            PreparedStatement prepProd = conProd.prepareStatement(
                "select products.product_name, products.unit_price from products inner join order_details on products.product_id = order_details.product_id inner join orders on order_details.order_id = orders.order_id inner join customers on orders.customer_id = customers.customer_id where customers.contact_name like ?"
            );
            
            prepProd.clearParameters();
            prepProd.setString(1, "Contact_name");
    
            ResultSet results = prepProd.executeQuery();

            while (results.next()) {


                System.out.println(results.getString("product_name"));
                System.out.println(results.getString("unit_price"));

            }*/

           /* ProductTO products = new ProductTO("Chang", "2");
            allProductsOrdered.add(products);

            for (ProductTO product : products) {
                System.out.println(products);
            }*/


        //}catch (SQLException sqle) {
          //  System.err.println("Connection err: " + sqle);
    
    //}




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




