package Door2Door;

public class MeatProduct extends Product{

    private String meatType;

    public MeatProduct(String productName, String meatType) {
        super(productName);
        this.meatType = meatType;
    }
}
