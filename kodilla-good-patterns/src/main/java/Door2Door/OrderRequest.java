package Door2Door;

import java.util.Map;

public class OrderRequest {

    private Customer customer;
    private FoodCompany foodCompany;
    private Map<Product, Integer> productOrderRequest;

    public Customer getCustomer() {
        return customer;
    }

    public FoodCompany getFoodCompany() {
        return foodCompany;
    }

    public Map<Product, Integer> getproductOrderRequest() {
        return productOrderRequest;
    }


    public OrderRequest(final Customer customer, final FoodCompany foodCompany, Map<Product, Integer> productOrderRequest) {
        this.customer = customer;
        this.foodCompany = foodCompany;
        this.productOrderRequest = productOrderRequest;
    }

}
