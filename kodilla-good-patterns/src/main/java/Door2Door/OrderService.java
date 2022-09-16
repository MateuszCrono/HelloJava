package Door2Door;

import java.util.List;

public class OrderService {

    public void processAllOrders(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("We're processing your order " + n.getCustomer().getName());
                    return n.getFoodCompany().process(n.getCustomer(), n.getproductOrderRequest());
                })
                .forEach(t -> System.out.println("Order finished with success: " + t + "\n"));
    }
}

