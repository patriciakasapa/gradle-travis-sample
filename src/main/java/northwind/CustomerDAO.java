package northwind;

import java.util.List;

public interface CustomerDAO {
    //public void showProductNames();
    //public void showPrices();
    public void setJdbcTemplate(JdbcTemplate template);
    public List<CustomersTO> getCustomerNames(String name);
    //public List<ProductTO> getCustomerProducts(String name);
}
