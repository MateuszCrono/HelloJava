package Door2Door;

public interface OrderService {

    private Customer customer;
    private Product product;


    boolean OrderSuccess(final Customer customer, final Product product, boolean isAvailable );

}
