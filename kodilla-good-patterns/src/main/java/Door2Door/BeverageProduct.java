package Door2Door;

public class BeverageProduct extends Product{
    private String beverageType;

    public BeverageProduct(String productName, String beverageType) {
        super(productName);
        this.beverageType = beverageType;
    }
}