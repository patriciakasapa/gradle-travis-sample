package northwind;

class ProductTO {
    private String product_name;
    private int unit_price;

    public ProductTO(String product_name, int unit_price) {
        this.product_name = product_name;
        this.unit_price = unit_price;
    }


    public String getProduct_name() {
        return product_name;
    }

    public int getUnit_price() {
        return unit_price;
    }

    @Override
    public String toString() {
        return "product_name: " + product_name + "\n" +
                "unit_price: " + unit_price;
    }
}