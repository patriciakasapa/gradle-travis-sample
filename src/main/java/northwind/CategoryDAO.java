package northwind;

import java.util.List;

public interface CategoryDAO {
    List<ProductTO> getProductsByCategory(String name);
    // List<SaleTO> getSalesByCategory(String name);
}
