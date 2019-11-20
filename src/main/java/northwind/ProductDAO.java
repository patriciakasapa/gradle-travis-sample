package northwind;

import java.util.List;

public interface ProductDAO {

    //public void viewProducts();
    List<ProductTO> getMostPopularProducts();
}
