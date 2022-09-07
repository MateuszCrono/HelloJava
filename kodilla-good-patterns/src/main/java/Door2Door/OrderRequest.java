package Door2Door;

public class OrderRequest {

    private Customer customer;

    private FoodCompany foodCompany;
    private Product product;
    private double productPrice;
    private double quantity;

    public OrderRequest (final Customer customer,final FoodCompany foodCompany, final Product product, final double productPrice, final double quantity) {
        this.customer = customer;
        this.product = product;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getQuantity() {
        return quantity;
    }
}
