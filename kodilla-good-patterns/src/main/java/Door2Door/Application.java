package Door2Door;

import challenges.ProductOrderRetriever;

public class Application {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        orderService.processAllOrders(new OrderRequestReciever().retrieve());
    }
}
