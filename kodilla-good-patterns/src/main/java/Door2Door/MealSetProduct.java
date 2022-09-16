package Door2Door;

public class MealSetProduct extends Product {
    private String setCategory;

    public MealSetProduct(String productName, String setCategory) {
        super(productName);
        this.setCategory = setCategory;
    }
}
