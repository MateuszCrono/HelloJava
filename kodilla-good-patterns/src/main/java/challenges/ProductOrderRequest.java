package challenges;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private User user;
    private  ProductItem productItem;
    private double productPrice;
    private LocalDateTime productOrderTime;

    public ProductOrderRequest (final User user, final ProductItem productItem, final double productPrice, final LocalDateTime productOrderTime) {
        this.user = user;
        this.productItem = productItem;
        this.productPrice = productPrice;
        this.productOrderTime = productOrderTime;
    }

    public User getUser() {
        return user;
    }

    public ProductItem getProductItem() {
        return productItem;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public LocalDateTime getProductOrderTime() {
        return productOrderTime;
    }
}
