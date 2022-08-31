package challenges;

public class ProductItem {

    private String productName;
    private String productDescription;
    private String productCategory;

    public ProductItem(String productName, String productDescription, String productCategory) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }
}
