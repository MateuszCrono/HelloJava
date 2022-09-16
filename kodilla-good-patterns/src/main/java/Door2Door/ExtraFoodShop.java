package Door2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodCompany {

    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new MeatProduct("chicken wings", "chicken"), 15);
        productsList.put(new MealSetProduct("Beef ribs", "beef"), 25);
        productsList.put(new BeverageProduct("Orange Juice", "Juice"), 5);


    return productsList;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{ " +
                "your order = " + productsList +
                " } for ";
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer>productsOrders) {

        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()){
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Extra Food Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        System.out.println("here is your order" + productsList.toString());
        return true;
    }
}

