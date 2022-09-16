package Door2Door;

import java.util.Objects;

public class Product {

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + productName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Objects.equals(productName, product1.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    public String getProduct() {
        return productName;
    }
}
