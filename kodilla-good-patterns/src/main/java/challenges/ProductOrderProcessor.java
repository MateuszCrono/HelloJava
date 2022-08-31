package challenges;

public class ProductOrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;


    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService,
                                 final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public productOrderDto process(final ProductOrderRequest productOrderRequest) {
        boolean isSoldSuccess = productOrderService.isSoldSuccess(productOrderRequest.getUser(),
                productOrderRequest.getProductItem(),
                productOrderRequest.getProductPrice(),
                productOrderRequest.getProductOrderTime());
        if (isSoldSuccess) {
            informationService.sendEmail(productOrderRequest.getUser());
            productOrderRepository.createOrder(productOrderRequest.getUser(),
                    productOrderRequest.getProductItem(),
                    productOrderRequest.getProductPrice(),
                    productOrderRequest.getProductOrderTime());
        } else {
            System.out.println("Your order request has been rejected. Please try again later.");
        }


        return new productOrderDto (productOrderRequest.getUser(),
                productOrderRequest.getProductItem(),
                productOrderRequest.getProductPrice(),
                productOrderRequest.getProductOrderTime(),
                isSoldSuccess);
    }

}
