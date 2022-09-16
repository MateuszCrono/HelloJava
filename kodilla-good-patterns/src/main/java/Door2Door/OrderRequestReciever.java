package Door2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestReciever {

    public List<OrderRequest> retrieve() {

        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer1 = new Customer("Adam Kamiński");
        FoodCompany foodCompany1 = new HealthyShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList1.put(new MealSetProduct("Healthy Set", "under 1500kcal"), 21);
        productsList1.put(new BeverageProduct("Water 1.5L", "water"), 2);
        productsList1.put(new BeverageProduct("Orange Juice", "Juice"), 5);

        orderRequestList.add(new OrderRequest(customer1, foodCompany1, productsList1));

        Customer customer2 = new Customer("Maria Wenezuela");
        FoodCompany foodCompany2 = new ExtraFoodShop();
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList2.put(new MeatProduct("chicken wings", "chicken"), 15);

        orderRequestList.add(new OrderRequest(customer2, foodCompany2, productsList2));

        return orderRequestList;
    }
}
